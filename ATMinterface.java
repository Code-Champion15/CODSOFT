import java.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ATMinterface extends JFrame{
    private JTextField amountField;
    private JTextArea resultArea;
    private double balance=100.0;

    public ATMinterface(){
        setTitle("ATM MACHINE");
        setSize(450,450);
        setDefaultCloseOperation(JFrame,EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        amountField=new JTextfield(10);
        resultArea=new JTextArea(10,25);
        resultArea.setEditable(false);
        JButton retraitButton=new JButton("retrait");
        JButton depositButton=new JButton("deposit");
        JButton checkBalanceButton=new JButton("check balance");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        add(new JLabel("amount="));
        add(amountField);
        add(retraitButton);
        add(depositButton);
        add(checkBalanceButton);
        add(new JScrollPane(resultArea));
        retraitButton.addActionListener(new ActionListener()){
            public void actionPerformed(ActionEvent e){
                performRetrait();
            }
        }

        depositButton.addActionListener(new ActionListener()){
            public void actionPerformed(ActionEvent e){
                performDeposit();
            }
        }

        CheckBalanceButton.addActionListener(new ActionListener()){
            public void actionPerformed(ActionEvent e){
                checkBalance();
            }
        }

        private void performRetrait(){
            try{
                double amount = Double.parseDouble(amountField.getText());
                if (amount>0 && amount<=balance){
                    balance -= amount;
                    resultArea.setText("retrais avec succes. nouveau solde:"+balance);
                }
                else{
                    resultArea.setText("invalid retrait ou code incorrect")

                }
            }

            catch (numberb)
        }

    }
}
import java.util.Scanner;
public class ATMmachine {
    private int accountnb;
    private String code;
    private double balance;

    public ATMmachine(int accountnb,String code,double balanceinitial){
        this.accountnb=accountnb;
        this.code=code;
        this.balance=balanceinitial;
    }

    public void setAccountnb(int accountnb){
        this.accountnb=accountnb;
    }
    public int getAccountnb(){
        return accountnb;
    }
    public void setCode(String code){
        this.code=code;
    }
    public String getCode(){
        return code;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }

    public boolean login(String entredcode){
        return code.equals(entredcode);
    }

    public void withdrow(double amount){
        if(amount>0 && amount<=balance){
            balance=balance-amount;
            System.out.println("operation terminee avec succes"+balance+"€");
        }
        else{
            System.out.println("solde insufisant");
        }
        }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("operation achevée avec succes, nouveau solde:"+balance+"$");
        }
        else{
            System.out.println("operation  invalide");
        }
    }
    public void checkBalance(){
        System.out.println("current balance="+balance+"€");
    }
    public void changercode(String newCode){
        code=newCode;
        System.out.println("le code a ete change avec succes");
    }

}
    


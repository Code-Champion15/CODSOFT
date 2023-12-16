import java.util.Scanner;
public class studentgradecalculator{
    public static void main(String[] args){
        Scanner e=new Scanner(System.in);
        System.out.println("hollo! please give me the number of subjects:");
        int nbsub=e.nextInt();
        int [] notes= new int[nbsub];
        for(int i=0;i<nbsub;i++){
            System.out.println("donner la note de la matiere"+i+1+":");
            notes[i]=e.nextInt();
        }
        int totale=0;
        for(int i=0;i<nbsub;i++){
            totale=totale+notes[i];

        }
        double average=(double)totale/nbsub;
        System.out.println(average);
        int grade;
        if(average>=16){
            grade=1;
            System.out.println("grade equal to:"+grade);
        }
        else{
            if(average<16 && average>13){
                grade=2;
                System.out.println("grade equal to"+grade);
            }
            else{
                grade=3;
                System.out.println("grade equal to"+grade);
            }

        }
        
        
    }
}
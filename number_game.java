
import java.util.Random;
import java.util.Scanner;
public class number_game{
    public static void main(String args[]){
        int min=1;
        int max=100;
        Random random=new Random();
        int randomnbr=random.nextInt(100);
        System.out.println("the random number is:"+randomnbr);
        boolean test=false;
        
        int round=0;
        int score=100;
        do{
            int i=0;
            System.out.println("round number:"+round);
            do{
                System.out.println("guess the number");
                Scanner scanner=new Scanner(System.in);
                int nbguess=scanner.nextInt();
                
                if(nbguess==randomnbr){
                    System.out.println("your guess is correct");
                    test=true;
                    break;
                }
                else{
                    if(nbguess>randomnbr){
                        System.out.println("your guess is too high");
                        test=false;
                        i++;
                    }
                    else{
                        System.out.println("your guess is too low");
                        test=false;
                        i++;
                    }
                }
            } while(i<4);
            round++;
            
        }while (round<4 && test==false);
        if(round==4 && test==false){
            System.out.println("vous avez perdu");
        }
        System.out.println("round is"+round);
        switch(round){
            case 1:
            System.out.println("ton score est:"+score);
            break;
            case 2:
            score=score-20;
            System.out.println("ton score est:"+score);
            break;
            case 3:
            score=score-40;
            System.out.println("ton score est:"+score);
            break;    
        
        }
    
        
    }
    
}


import java.util.Random;
import java.util.Scanner;
public class number_game{
    public static void main(String args[]){
        int min=1;
        int max=100;
        Random random=new Random();
        int randomnbr=random.nextInt(100);
        System.out.println("the random number is:"+randomnbr);
        System.out.println("guess the number");
        Scanner scanner=new Scanner(System.in);
        int nbguess=scanner.nextInt();
        System.out.println(nbguess);
        if(nbguess==randomnbr){
            System.out.println("your guess is correct");
        }
        else{
            if(nbguess>randomnbr){
                System.out.println("your guess is too high");
            }
            else{
                System.out.println("your guess is too low");
            }
        }
        

    }
}
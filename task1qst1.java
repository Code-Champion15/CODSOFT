import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        int minRange = 1;
        int maxRange = 100;
        Random random = new Random();
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        System.out.println("Random Number: " + randomNumber);
    }
}
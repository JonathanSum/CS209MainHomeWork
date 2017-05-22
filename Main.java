
//ID: 881716741
//Name: Jonathan
//Project: OnePlayer
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input an amount to store for bank");
        int storeBetAmount = input.nextInt();
        System.out.println("How much for the bet amount?");
        int betAmount = input.nextInt();
        Data data = new Data(storeBetAmount, betAmount);
        data.rollDice();

    }
}

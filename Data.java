//ID: 881716741
//        Name: Jonathan
//        Project: OnePlayer

import java.util.Scanner;

/**
 * Created by JonathanSum on 5/18/2017.
 */
public class Data {
    private int mDice1;
    private int mDice2;
    private int mBank;
    private int mBet;
    private int WinAmount;

    Data(int bank, int bet) {
        mBank = bank;
        mBet = bet;
    }

    int i = 0;

    public void setDice1() {
        mDice1 = (int) (Math.random() * 6 + 1);
    }

    public void setDice2() {
        mDice2 = (int) (Math.random() * 6 + 1);
    }

    private int getDice1() {
        return mDice1;
    }

    private int getDice2() {
        return mDice2;
    }

    public void setBank(int bank) {
        mBank = bank;
    }

    int getBank() {
        return mBank;
    }

    private void setBet(int bank) {
        mBet = bank;
    }

    int getBet() {
        return mBet;
    }

    private void addWinningTimes() {
        mBank += mBet * 3;
    }

    private void resultOfLose() {
        mBank -= mBet;
    }

    Scanner input = new Scanner(System.in);

    void rollDice() {
        if (getBet() <= (getBank())) {
            setDice1();
            setDice2();
            int totalPoints = getDice1() + getDice2();
            //System.out.println("total Point is " + totalPoints);
            if (totalPoints == 7 || totalPoints == 11) {
                addWinningTimes();
                System.out.println("You won.");
                System.out.println("Do you want to continuous?\n Remaining Bet Amount: " + getBank() + "\nClick Yes to continuous or Click No to exit");
                askingContinuous();


            } else {
                resultOfLose();
                System.out.println("You loses.");
                System.out.println("Do you want to continuous?\n Remaining Bet Amount: " + getBank() + "\nClick Yes to continuous or Click No to exit");
                askingContinuous();
            }
        } else {
            System.out.println("Please enter an amount that is less than the bank amount");
            setBet(input.nextInt());
            rollDice();
        }
    }


    private void askingContinuous() {
        if (getBank() > 0) {
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("Yes")) {
                System.out.println("Enter the bet amount");
                setBet(input.nextInt());
                rollDice();
            } else if (answer.equalsIgnoreCase("No")) {
                System.exit(0);
            } else {
                askingContinuous();
            }
        } else {
            System.out.println("Your bank balance is zero.");
        }
    }
}

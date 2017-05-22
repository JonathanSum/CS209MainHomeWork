import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by JonathanSum on 5/18/2017.
 */
public class TestingClass1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
//        ArrayList<String> stockList = new ArrayList<String>();
//        stockList.add("stock1");
//        stockList.add("stock2");
//
//        String[] stockArr = new String[stockList.size()];
//        stockArr = stockList.toArray(stockArr);
//
//        for(String s : stockArr)
//            System.out.println(s);
//        Scanner input = new Scanner(System.in);
//        System.out.println("Do you want to continuous? Remaining Bet Amount: ");
//        if(input.nextInt()>1){
//            System.out.println("More than 1");
//            int t2 =4;
//            t2 += 7*3;
//            System.out.println(t2 +" "+ t2);
//        }
        System.out.println("Which direction to shift R/L : ");
        System.out.println("How many times: ");
        String direction = input.nextLine();
        int times = input.nextInt();
        System.out.println(direction);
        System.out.println(times);
    }
}

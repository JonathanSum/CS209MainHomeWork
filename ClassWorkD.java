/**
 * Created by Computer type C on 20/3/2017.
 */
import java.util.Scanner;
public class ClassWorkD {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println(("Enter your age"));
        int age = input.nextInt();
        if (age <= 10 ) {
            System.out.println(" you can not see the movie.");
        } else if (age > 10 && age < 21){
            System.out.println("You have to bring your parent to watch the movie.");
        }else if (age > 21){
            System.out.println("You can do anything you want");
        }
        System.exit(0);
    }

}

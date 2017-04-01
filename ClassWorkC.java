import java.util.Scanner;

/**
 * Created by Computer type C on 20/3/2017.
 */


public class ClassWorkC {
    public static Scanner input = new Scanner(System.in);
        public static void main(String args[]){


            System.out.print("Enter your name:");
            String name = input.nextLine();
            printNameInColumn(name);
            String newPhrase = name.replaceAll("text","Exam");
            System.out.println(newPhrase);
            System.exit(0);
        }
    public static void printNameInColumn(String name){
        int count = 0;
        System.out.println(name + " has " +name.length()+" characters.");
        System.out.println("First letter is "+name.charAt(0));
        //String test = "a";
        //for(int i = 0; i<name.length(); i++){
        for(int i = name.length()-1; i>=0; i--){
            //System.out.println(name.charAt(i));
            //if(name.charAt(i) == test.charAt(0)){
                //count++;
            System.out.println(name.charAt(i));
            }

        }

        //System.out.println(count);

    }





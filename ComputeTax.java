import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        // Create a Scanner6
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter filing status
        System.out.print("(0-single filer, 1-married jointly or " +
         "qualifying widow(er), 2-married separately, 3-head of " +
          "household) Enter the filing status: ");

        int status = input.nextInt();
        System.out.println(status==0);
        // Prompt the user to enter taxable income 16      System.out.print("Enter the taxable income: "); 17 double income = input.nextDouble(); 18 19 // Compute tax 20 double tax = 0; 21 22 if (status == 0) {// Compute tax for single filers 23 if (income <= 8350) 24          tax = income * 0.10; 25 else if (income <= 33950) 26          tax = 8350 * 0.10 + (income - 8350) * 0.15; 27 else if (income <= 82250) 28          tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + 29            (income - 33950) * 0.25; 30 else if (income <= 171550) 31          tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + 32            (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
    }
}
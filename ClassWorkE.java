/**
 * Created by Computer type C on 27/3/2017.
 */
import javax.swing.*;
import java.awt.*;

//import java.util.Scanner;
public class ClassWorkE {
    public static void main(String args[]) {
//        Scanner input = new Scanner(System.in);
//
//
//    String newNum = input.next();
//
//    getInt(newNum);
//        String strNum = JOptionPane.showInputDialog("Enter a number");
//        int n1 = Integer.parseInt(strNum);
//        String strNum2 = JOptionPane.showInputDialog("Enter number");
//        int n2 = Integer.parseInt(strNum2);
//        int sum = n1 + n2;
//        JOptionPane.showMessageDialog(null, "n1 + n2 = " + sum);
        int n1 = MyIO.getInt("Enter Number");
        int n2 = MyIO.getInt("Enter Number");
        MyIO.display(n1+" "+n2);
        MyIO.display("Total is " + (n1 + n2));

    }
}
class MyIO{

    public static void display(String x)
    {
        Font f = new Font("Times new Roman",Font.BOLD+Font.ITALIC,30);
        JTextArea jt = new JTextArea(15,20);
        jt.setFont(f);
        jt.setBackground(Color.YELLOW);
        jt.setForeground(Color.BLUE);
        jt.setText(x);
        JOptionPane.showMessageDialog(null,jt);
    }



    public static int getInt(String s) {
        int n = 0;
        String strNum = "";
        boolean ok = false;
        while (!ok) {
            try {
                strNum = JOptionPane.showInputDialog(s);
                n = Integer.parseInt(strNum);
            } catch (Exception e) {
                JOptionPane.showInputDialog(null, strNum + " is integer and try again.");
            }
            ok = true;
        }

        return n;
    }}




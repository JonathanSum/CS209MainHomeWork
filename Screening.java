import javax.swing.*;
import java.awt.*;

/**
 * Created by JonathanSum on 4/1/2017.
 */
public class Screening {

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
        }
}


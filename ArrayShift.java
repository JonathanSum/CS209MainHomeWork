import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by JonathanSum on 5/18/2017.
 */
public class ArrayShift {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of slots needs in the array");
        int[] arrayInt = new int[input.nextInt()];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) (Math.random() * (100) + 1);
        }
        System.out.println("This is element of your array: " + arrayToList(arrayInt));
        System.out.println("Which direction to shift R/L : ");
        String direction = input.next();
        System.out.println(direction);
        System.out.println("How many times: ");
        int times = input.nextInt();
        System.out.println("times " + times);
        System.out.println("This is element of your array: " + arrayToList(rotateArray(direction, times, arrayInt)));
    }

    public static String arrayToList(int[] array) {
        return Arrays.toString(array).replace("[", "")
                .replace("]", "")
                .replace(",", "");
    }

    public static int[] rotateArray(String directionTo, int times, int[] array) {
        int[] temp = new int[array.length];
        if (directionTo.equalsIgnoreCase("R")) {
            int shiftUnit;
            for (int i = array.length - 1; i >= 0; i--) {
                if (times + i >= array.length) {
                    shiftUnit = (i + times) % array.length;
                } else {
                    shiftUnit = i + times;
                }

                temp[i] = array[shiftUnit];


            }

        } else if (directionTo.equalsIgnoreCase("L")) {

        }
        int shiftUnit;
        for (int i = array.length - 1; i >= 0; i--) {
            if (i - times < 0) {
                times = array.length - (times % array.length);

                if (times + i >= array.length) {
                    shiftUnit = (i + times) % array.length;
                } else {
                    shiftUnit = i + times;
                }
            } else {
                shiftUnit = i - times;
            }

            temp[i] = array[shiftUnit];

        }


        return temp;
    }
}

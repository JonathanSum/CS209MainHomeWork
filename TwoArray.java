import com.sun.xml.internal.bind.v2.util.QNameMap;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by JonathanSum on 5/18/2017.
 */
public class TwoArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] lettersList = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        HashMap<Character, Integer> resultMap = new HashMap<>();
        for (char i :lettersList){
            resultMap.put(i,0);
        }
        System.out.println("Please enter a sentence to parse.");
        String EnteredString = input.nextLine();

            HashMap<Character, Integer> counterMap = new HashMap<>();
        for (Character k : EnteredString.toCharArray()) {
            if (counterMap.containsKey(k)) {
                counterMap.remove(k, counterMap.get(k) + 1);
            } else {
                counterMap.put(k, 1);
            }
        }
        for(HashMap.Entry<Character, Integer> index : counterMap.entrySet()){
            if(resultMap.containsKey(index.getKey())){

                resultMap.put(index.getKey(),index.getValue());
            }
        }
        for(HashMap.Entry<Character,Integer> index : resultMap.entrySet()){
            System.out.println((char)index.getKey()+" : "+ index.getValue());
        }

    }
}

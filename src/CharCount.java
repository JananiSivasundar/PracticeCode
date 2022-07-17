import java.util.HashMap;
import java.util.Map;

public class CharCount {
// method to count the umber of integers
   /* public static void charCount(int[] numbers) {
        //int[] number={1,2,5,7,7,9,1,5};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int c : numbers) {
            if (hm.containsKey(c)) {
                System.out.println(hm.get(c));
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);
            }
        }
        for (Map.Entry<Integer, Integer> map : hm.entrySet()) {
            System.out.println("CharCount:" + map.getKey() + "--" + map.getValue());
        }
    }
*/
    // method to count number of alphabets
    public static void stringCharCount(String input) {
        char[] ip = input.toCharArray();


        HashMap<Character, Integer> hm = new HashMap<>();   

        for (char ch : ip) {
            if (hm.containsKey(ch)) {
            //    System.out.println(hm.get(ch));
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        for (Map.Entry<Character, Integer> map  : hm.entrySet()) {
            System.out.println("CharCount:" + map.getKey() + "--" + map.getValue());
        }


    }

    public static void main(String[] args) {
        String name = "This is program is running and is failing";
        //counting alphabets
        stringCharCount(name);
        //counting numbers
    // charCount(new int[]{1, 2, 5, 7, 7, 9, 1, 5});

    }
}

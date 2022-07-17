import java.util.HashSet;

public class MissingNumberInt {

    public static void main(String[] args) {
        //int[] input = { 1, 1, 2, 3, 5,5,4,7, 9, 9, 9 };

        int[] input = { 21, 22, 25, 26, 5,27,4,29, 9, 9, 30 };

        HashSet<Integer> number = new HashSet<>();

        for(int i=input[0];i<input[input.length-1];i++)
        {
            number.add(i);
        }

        for(int orgNumber:input)
        {
            number.remove(orgNumber);
        }

        System.out.println(number);
    }
}

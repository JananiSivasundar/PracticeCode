import java.util.Arrays;
import java.util.HashSet;

public class MissingNumber {

    public static void main(String[] args) {
        //Input Array : [1, 4, 5, 3, 2, 8, 6]
        //int[] input={1, 4, 3, 2, 8, 6};
        int[] input = { 1, 1, 2, 3, 5,5,4,7,9,9,9};

        Arrays.sort(input);

        int[] exist=new int[input.length];
        HashSet<Integer> hs=new HashSet<>();

        for (int i=input[0];i<=input[input.length-1];i++)
        {
            hs.add(i);
        }
        System.out.println(hs);

        for(int i:input) {
            hs.remove(i);
        }

        System.out.println(hs);
    }
}

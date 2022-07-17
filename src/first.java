import java.util.Arrays;
import java.util.HashSet;

public class first {

    public static void findMissing(int[] numberList)
    {
        HashSet<Integer> missing=new HashSet<>();
        for(int i=numberList[0];i<numberList.length-1;i++)
        {
            missing.add(i);
        }

        for(int i:numberList)
        {
            missing.remove(i);
        }

        System.out.println("Missing numbers in the range are:"+missing);
    }

    public static void main(String[] args) {


            // given input
            int[] input = { 1, 1, 2, 3, 5,5,4,7, 9, 9, 9 };
        findMissing(input);
        //int[] input={1, 4, 5, 3, 2, 8, 6};

            // let's create another array with same length
            // by default all index will contain zero
            // default value for int variable
            Arrays.sort(input);
            System.out.println(input.length);
            int[] register = new int[input.length-1];//{0,0,0,0,0,0,0,0,0,0}

            // now let's iterate over given array to
            // mark all present numbers in our register
            // array

            for (int i : input) {
                register[i] = 1;
            }

            // now, let's print all the absentees
            System.out.println("missing numbers in given array");

            for (int i = 1; i < input[input.length-1]; i++) {
                if (register[i] == 0) {
                    System.out.println(i);
                }
            }
        }


}

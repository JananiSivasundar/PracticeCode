public class reverseArray {

    public static void reverseArray(int[] number)
    {


        for(int i=number.length-1;i>=0;i--)
        {
           System.out.println(number[i]);

        }

        



    }

    public static void main(String[] args) {
           reverseArray(new int[]{5, 8, 9});
    }
}

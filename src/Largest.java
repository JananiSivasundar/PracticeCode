public class Largest {

    public static void main(String[] args) {
        //int[] input={47498, 14526, 74562, 42681, 75283, 45796};
        int[] input = { 22,23,24,26,27,28,60};
        //74562

       int largest=input[0];

        for(int i=0;i<input.length;i++)
        {
            for(int j=i+1;j< input.length;j++) {
                if (input[i] > input[j]) {
                    largest = input[i];
                }
            }

        }

        System.out.println(largest);
    }
}

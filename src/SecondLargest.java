public class SecondLargest {

    public static void main(String[] args) {

        int[] input={10,22,65,98, 43,103, 200,300,440,5009,9000, 1001, 400, 301, 9999};
        //74562

        int temp;

        for(int i=0;i< input.length;i++)
        {
            for(int j=i+1;j<input.length;j++)
            {
                if(input[i]>input[j])
                {
                    temp=input[i];
                    input[i]=input[j];
                    input[j]=temp;
                }
            }
        }

        System.out.println(input[input.length-2]);
    }
}

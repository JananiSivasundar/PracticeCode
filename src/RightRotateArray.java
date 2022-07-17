public class RightRotateArray {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};

        for(int i=0;i<1;i++)
        {
            int last,j;
            last=arr[arr.length-1];
            for(j=arr.length-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }

            arr[0]=last;

        }

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}

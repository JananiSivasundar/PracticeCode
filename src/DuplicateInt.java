public class DuplicateInt {

    public static void main(String[] args) {
        int[] numbers={1,5,7,8};
        int[] numbers2a={1,2,3,5,1,5,5,7};

        int checked=-1;

        for(int i=0;i<numbers.length;i++)
        {
            for(int j=0;j<numbers2a.length;j++)
            {
                if(numbers[i]==numbers2a[j])
                {
                    System.out.print(numbers[j] + ",");
                    numbers[i]=checked;
                }
            }
        }
    }
}

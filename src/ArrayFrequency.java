public class ArrayFrequency {

    public static void main(String[] args) {

        int[] input={1,2,1,4,5,2,4,8,1};
        int[] freq=new int[input.length];
        int visited=-1;
        for(int i=0;i<input.length;i++)
        {
            int count=1;
            for(int j=i+1;j<input.length;j++)
            {
                if(input[i]==input[j])
                {
                    count++;
                    freq[j]=visited;
                }
            }

            if(freq[i]!=visited)
            {
                freq[i]=count;
            }
        }

        for(int i=0;i<input.length;i++)
        {
            if(freq[i]!=visited)
            {
                System.out.println(input[i] +"|"+freq[i]);
            }
        }
    }
}

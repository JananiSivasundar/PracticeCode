public class SumArray {

    public static void sum2Array(int[] sumSeries,int total)
    {
        for(int i=0;i<sumSeries.length;i++)
        {
            for(int j=i+1;j<sumSeries.length;j++)
            {
                if(sumSeries[i]+sumSeries[j]==total)
                {
                    System.out.println(sumSeries[i] + "---"+ sumSeries[j]);
                }
            }
        }

    }

    public static void main(String[] args) {
        sum2Array(new int[]{2,6,9,3,7,5},8);

    }
}

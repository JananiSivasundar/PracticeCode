public class FibonacciSeries {

    public static void main(String[] args) {

        int n=10;
        int a1=0;
        int a2=1;
        int a3 = 0;

        System.out.print(a1+","+a2+",");
        for(int i=0;i<n;i++)
        {
                a3 = a1 + a2;
                a1 = a2;
                a2 = a3;
            //    i=a3;
                /*if(a3==n)
                {
                    break;
                }*/
            System.out.print(a3+",");
        }


    }
}

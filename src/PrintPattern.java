public class PrintPattern {

    public static void printPattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
                System.out.println(" ");
        }
    }

    public static void printPatternDownOpposiite(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void printPatternOpposiite(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }

    public static void printPatternTriangle(int n)
    {
        for(int i=0;i<=n;i++)
        {
           for(int j=n;j>=i;j--)
           {
               System.out.print(" ");
           }
           for(int j=0;j<i;j++)
           {
               System.out.print("* ");
           }
        }

    }

    public static void printPatternSquare(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void printPatternSquareWithoutBorder(int n)
    {
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
               if(i==0||i==n)
               {
                 System.out.print("* ");
               }
               else if(j==0||j==n)
               {
                   System.out.print("* ");
               }
               else
               {
                   System.out.print("  ");
               }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        //printPattern(5);
        //printPatternDownOpposiite(5);
        //printPatternOpposiite(5);
        //printPatternSquare(5);
       // printPatternSquareWithoutBorder(5);
        printPatternTriangle(3);
    }
}

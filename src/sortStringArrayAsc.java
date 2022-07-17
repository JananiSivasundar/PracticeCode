import java.util.Scanner;

public class sortStringArrayAsc {

    public static void main(String[] args) {

        System.out.println("enter the number of names to sort:");

        Scanner no=new Scanner(System.in);

        int number=no.nextInt();

        String temp;

        System.out.println("Enter the names:");

        String[] names=new String[number];

        Scanner namesui=new Scanner(System.in);

        for(int i=0;i<number;i++)
        {
            names[i]=namesui.nextLine();
        }

        for(int i=0;i<number;i++)
        {
            for(int j=i+1;j<number;j++)
            {
                if(names[i].compareTo(names[j])>0)
                {
                    temp=names[i];
                    names[i]=names[j];
                    names[j]=temp;


                }
            }
        }
        System.out.println("Names in sorting order");
        for(int i=0;i<number-1;i++)
        {
            System.out.print(names[i]+",");
        }

    }
}

import java.util.ArrayList;
import java.util.Iterator;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int n=1000;
        int c=0;
        int temp; //1,216,27,64
        int b;
        ArrayList<Integer> al=new ArrayList<>();

        for(int a=100;a<n;a++) {
            temp=a;
            b=a;
            while (b > 0) {
                int R = b % 10;
                b = b / 10;
                c = c + (R * R * R);
            }
            if(c==temp)
            {
                al.add(temp);
            }
            c=0;
        }

        System.out.println("Armstrong number between 101 to 1000are");

        Iterator<Integer> it=al.iterator();

        while(it.hasNext())
        {
            System.out.print(it.next()+",");
        }






    }
}

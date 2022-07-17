import java.util.ArrayList;
import java.util.HashMap;

public class AppendParticularCharacter {

    public static void main(String[] args) {

        String input = "TestTheThunder";
        String output = "";

        char[] inputChar = input.toCharArray();
         int count=0;
        for(int i=0;i<inputChar.length;i++)
        {
            if(inputChar[i]=='T')
            {
                count++;
                System.out.print(inputChar[i]);
                System.out.print(count);
            }
            else {
                System.out.print(inputChar[i]);
            }
        }

    }
}

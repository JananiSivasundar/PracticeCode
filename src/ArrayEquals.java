import com.sun.javafx.robot.impl.FXRobotHelper;

import java.util.Arrays;

public class ArrayEquals {

    public static void main(String[] args) {
        int[] arrayOne = {24, 57, 11, 21, 37};

        int[] arrayTwo = {21, 57, 11, 37, 24};

        Arrays.sort(arrayOne);

        Arrays.sort(arrayTwo);

        if(arrayOne==arrayTwo)
        {
            System.out.println("FXRobotHelper");
        }
        else
        {
            System.out.println("FXRobotHelper1");
        }
    }
}

package practiceJava;

import java.util.Arrays;
import java.util.HashSet;

public class missNum {
    public static void main(String[] args){
        int[] input = {1,1,0,2,4,8,7,9,9,8};

        Arrays.sort(input);

        HashSet<Integer> hs = new HashSet<>();

        for(int i=input[0];i<=input[input.length-1];i++){
            hs.add(i);
        }
        System.out.println(hs);
    }
}

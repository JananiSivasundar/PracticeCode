package practiceJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class appendDupArray {

    public static void main(String[] args){

        String[] nameIP = {"siva","janani","thanya","siva","thanya","siva"};

        HashMap<String, Integer>hm = new HashMap<>();

        ArrayList<String> output = new ArrayList<>();

        int count = 0;

        for(String name: nameIP)
            {
                if(hm.containsKey(name)){
                    hm.put(name, hm.get(name)+1);
                            count=hm.get(name);
                    output.add(name+count);
                                    }
            else{
                hm.put(name,0);
                output.add(name);
                }
        }
        System.out.println("Ouput: " + output);

            for(Map.Entry<String, Integer> maps:hm.entrySet()){
                System.out.println(maps.getKey());
                System.out.println(maps.getValue());
            }
    }
}

package practiceJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmapLoop {

    public static void main(String args[]){
        //keyset() example
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "UI");
        hm.put(2, "API");
        hm.put(3,"Automation");
        Set<Integer> keys = hm.keySet();
        for(Integer ele : keys){
            System.out.println("Value of " + ele + "is: " +hm.get(ele));
        }
        // enhanced for loop
        HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
        hm1.put(4, "DB TESTTING");
        hm1.put(5, "REGRESSION");
        hm.putAll(hm1);
        for(Map.Entry<Integer, String> entry :hm.entrySet()){
    System.out.println("Value of entry set  " + entry.getKey() + "is: " + entry.getValue());
        }
// Iterator loop
        hm.remove(4);
        Iterator itr = hm.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry pair = (Map.Entry)itr.next();
            System.out.println(pair.getKey() + "=" + pair.getValue());
            }

        hm.clear();
        System.out.println("Value of Map is :" + hm);
        }

    }


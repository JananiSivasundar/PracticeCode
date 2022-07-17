package practiceJava;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetLoop {

    public static void main(String args[]){
        HashSet<String> hs = new HashSet<String>();
        hs.add("JANANI");
        hs.add("SIVA");
        hs.add("THANYA");
        HashSet<String> hs1 =new HashSet<String>();
        hs1.add("MICK");
        hs1.add("Loving Family");
        hs.addAll(hs1);
         //enhance for loop
        System.out.println("********");
        System.out.println("Enhanced for loop: ");
        for(String name: hs){
            System.out.println(name);
        }
        hs.remove("Loving Family");
        //Iterator
        System.out.println("********");
        System.out.println("Iterator loop: ");
        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}


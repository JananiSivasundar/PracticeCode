package practiceJava;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListloop {
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<String>();
        al.add("JANANI");
        al.add("SIVA");
        al.add("THANYA");
        //traditional for loop
        System.out.println("********");
        System.out.println("Tradtional for loop: ");
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("MICK");
        al1.add("Loving Family");
        al.addAll(al1);
        //enhance for loop
        System.out.println("********");
        System.out.println("Enhanced for loop: ");
        for(String name: al){
            System.out.println(name);
        }
        al.remove("Loving Family");
        //Iterator
        System.out.println("********");
        System.out.println("Iterator loop");
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}


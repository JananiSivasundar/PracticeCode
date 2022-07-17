package practiceJava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class practiceSep{

public static void main(String[] args) {
    HashSet<String> hs = new HashSet<String>();
    hs.add("Janani");
    hs.add("Sivasundar");
    hs.add("Thanyamethini");
    HashSet<String> hs1 = new HashSet<String>();
    hs1.add("Mick");
    hs1.add("Happy Family");
    hs.addAll(hs1);
    System.out.println("***Enhanced for loop");
    for(String name:hs){
        System.out.println(name);
    }
    hs.remove("Happy Family");
    System.out.println("***Iterator loop***");
    Iterator itr = hs.iterator();
    while (itr.hasNext()){
        System.out.println(itr.next());
    }

    }
}
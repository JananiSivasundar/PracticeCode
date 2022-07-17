package practiceJava;

import java.util.LinkedHashSet;

public class removeDuplicateChars {

    //Create removeDuplicates() method for removing duplicates using LinkedHashSet
//    static void removeDuplicates(String str)
//    {
//        //Create LinkedHashSet of type character
//        LinkedHashSet<Character> set = new LinkedHashSet<>();
//        //Add each character of the string into LinkedHashSet
//        for(int i=0;i<str.length();i++)
//            set.add(str.charAt(i));
//
//        // print the string after removing duplicate characters
//        for(Character ch : set)
//            System.out.print(ch);
//    }
//
//    //main() method start
//    public static void main(String args[])
//    {
//        //Create string variable with default value
//        String str = "JANANI HAS CRACKED";
//        //removeDuplicates() method by passing the string as an argument
//        removeDuplicates(str);
//    }

    public static void main(String[] args){
        String name = "JANANI SIVASUNDAR";
        LinkedHashSet<Character> cha = new LinkedHashSet<>();
        for(int i=0; i<name.length(); i++){
            cha.add(name.charAt(i));
        }

        for(Character ch : cha){
            System.out.println(ch);
        }

    }
}


package practiceJava;

public class substring {

    public static void main(String[] args) {
        String s1="Janani";
        String substr = s1.substring(0); // Starts with 0 and goes to end
        System.out.println(substr);
        String substr2 = s1.substring(5,6); // Starts from 5 and goes to 10
        System.out.println(substr2);
        String substr3 = s1.substring(5,15); // Returns Exception
    }
}

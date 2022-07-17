public class Palindrome {

    public static  boolean stringPalindrome(String ip)
    {
        String pali = "";
        String temp=ip;

        for(int i=ip.length()-1;i>=0;i--)
        {
            pali=pali+ip.charAt(i);
        }

        if(pali.equals(temp)) {
            System.out.println(ip + ":Is palindrome");
            return true;
        }
        else
        {
            System.out.println(ip + ":Is not palindrome");
            return false;

        }
    }

    public static boolean intPalindrome(int ip)
    {
       int temp=ip;
        int c=0;
        while(ip>0) {
            int r = ip % 10;
            ip = ip / 10;
            c = (10 * c) + r;
        }

        if(c==temp)
        {
            return true;
        }
        else
        {
            return false;
        }



    }

    public static void main(String[] args) {
         stringPalindrome("baba");
         System.out.println(intPalindrome(545));
    }
}

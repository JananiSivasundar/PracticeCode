public class reverseString {

   /* public static String reverseSting(String input)
    {
        String reverse = "";
        for(int i=input.length()-1;i>=0;i--)
        {
            reverse=reverse + input.charAt(i);
        }

        
        return reverse;
        
    }*/
    
    public static void main(String[] args) {
        String input = "Automation";
        String reverse = "";
        for(int i=input.length()-1;i>=0;i--)
        {
            reverse=reverse + input.charAt(i);
        }

    System.out.println(reverse);
//        return reverse;

    }
       // System.out.println(reverseSting("Automation"));
    }
    


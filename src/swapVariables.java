public class swapVariables {
        public static void main(String args[]) {
            String a = "Love";
            String b = "You";
            System.out.println("Before swap: "
                    + a + " " + b);
            a = a + b;
            System.out.println(a);
            b = a.substring(0, a.length() - b.length());
            a = a.substring(b.length());
            System.out.println("After : " + a + " " + b);
        }
    }




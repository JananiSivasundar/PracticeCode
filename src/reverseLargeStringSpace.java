public class reverseLargeStringSpace {

    public static void main(String[] args) {
        String text="siva sundar janani Thanya";

        String[] textChar=text.split(" ");


        for(int i= textChar.length-1;i>=0;i--)
        {
            System.out.print(textChar[i]+",");
        }
    }
}

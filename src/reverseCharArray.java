public class reverseCharArray {

    public static void main(String[] args) {
        char[] text={'s','u','i'};

        System.out.print(text[2]);

        for(int i=text.length-1;i>=0;i--)
        {
            System.out.print(text[i]+",");
        }
    }
}

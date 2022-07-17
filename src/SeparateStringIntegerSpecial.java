public class SeparateStringIntegerSpecial {

    public static void main(String[] args) {

        String input="siva5667&^%r";

        StringBuffer alpha = new StringBuffer(),num = new StringBuffer(),special=new StringBuffer();

        for(int i=0;i<input.length();i++)
        {
            if(Character.isDigit(input.charAt(i)))
            {
                num.append(input.charAt(i));
            }
            else if(Character.isAlphabetic(input.charAt(i)))
            {
                alpha.append(input.charAt(i));
            }
            else {
                special.append(input.charAt(i));
            }


        }
        System.out.println(num);
        System.out.println(alpha);
        System.out.println(special);
    }
}

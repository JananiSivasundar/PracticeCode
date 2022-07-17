package practiceJava;

public class separatealphddigit {

    public static void main(String[] args){
        String input = "Jana123$%n#";

        StringBuffer alpha =new StringBuffer(), num = new StringBuffer(), sym = new StringBuffer();

        for(int i= 0; i<input.length(); i++){
            if(Character.isDigit(input.charAt(i))){
                num.append(input.charAt(i));
            }
            else if(Character.isAlphabetic(input.charAt(i))){
                alpha.append(input.charAt(i));
            }
                else{
                    sym.append(input.charAt(i));
            }

        }
        System.out.println("Num: " + num);
        System.out.println("Alphabets: " + alpha);
        System.out.println("Symbols: " + sym);
    }
}

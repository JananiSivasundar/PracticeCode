public class stringCompare {

    public static void main(String[] args) {
        String s1="LTI";
        String s2="LTI";
        String s3=s2;//LTI
        String s4 = new String("LTI");
        String s5 = new String("LTI");
        System.out.println(s1==s2);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s3==s1);//true
        System.out.println(s4==s1);//false
        System.out.println(s4.equals(s3));//true
        System.out.println(s4.equals(s5));//true
        System.out.println(s4==s5);//false
    }
}

public class reverseStringArray {

    public static void main(String[] args) {
        String[] name={"siva","janani","sundar","Thanya"};

        System.out.println(name[0]);

        for(int i= name.length-1;i>=0;i--)
        {
            System.out.print(name[i]+",");
        }
    }

}

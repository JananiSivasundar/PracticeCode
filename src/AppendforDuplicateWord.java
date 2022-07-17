import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class AppendforDuplicateWord {

    public static void main(String[] args) {
        String[] input={"Siva","janani","Thanya","Siva","Methini","Thanya","Methini","Siva"};

        HashMap<String,Integer> hm =new HashMap<>();

        ArrayList<String> al=new ArrayList<>();
        int count=0;
        for(String ip:input)

        {
            if(hm.containsKey(ip))
            {
                hm.put(ip,hm.get(ip)+1);
                count=hm.get(ip);
                al.add(ip+count);
            }
            else
            {
                hm.put(ip,0);
                al.add(ip);
            }
        }

        for(Map.Entry<String,Integer> mp:hm.entrySet())
        {
            System.out.println(mp.getKey() + "|" + mp.getValue());
        }

        Iterator<String> it= al.iterator();
        while (it.hasNext())
        {
            System.out.print(it.next() + ",");
        }
    }
}

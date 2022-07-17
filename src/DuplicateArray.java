import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.HashSet;

public class DuplicateArray {

    public static void main(String[] args) {
        String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
        //o/p={}

        for(int i=0;i< strArray.length;i++)
        {
            for(int j=i+1;j< strArray.length;j++)
            {
                if(strArray[i].equals(strArray[j]))
                {
                    System.out.println("Duplicate are:"+strArray[i]);
                }
            }
        }

        HashSet<String> duplicate = new HashSet<>();
        for(String stry : strArray)
        {

            if(!duplicate.add(stry))
            {
               System.out.println("Duplicate Hashset:"+stry);
            }

        }
    }




}

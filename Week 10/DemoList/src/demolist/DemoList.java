package demolist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.StringTokenizer;

public class DemoList {
    public static void main(String[] args) {
        String customers[] = {"Fred Hamilton", "Barney Barrie", "Dino Detroit", "Wilma Winstor"};
        LinkedList <String> customerList = new LinkedList();
        ArrayList <String> cList = new ArrayList();
        customerList.addAll(Arrays.asList(customers));
        cList.addAll(Arrays.asList(customers));
        
        customerList.addLast("Betty Hamilton");
        
        int last = cList.size();
        cList.add(last,"Betty Hamilton");
        
        Iterator<String> itcustomerList = customerList.iterator();
        Iterator<String> itcList = cList.iterator();
        
        while(itcustomerList.hasNext()){
            System.out.println(itcustomerList.next());
        }
        while(itcList.hasNext()){
            System.out.println(itcList.next());
        }
        StringTokenizer one = new StringTokenizer(customerList.getLast());
        one.nextToken();
        System.out.println(one.nextToken());
        
        int last1 = cList.size()-1;
        StringTokenizer two = new StringTokenizer(cList.get(last1));
        two.nextToken();
        System.out.println(two.nextToken());
    }
    
}

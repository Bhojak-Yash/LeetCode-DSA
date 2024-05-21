import java.util.*;
public class Sorting_in_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);    
        
        //Ascending Order...
        Collections.sort(list);
        System.out.println(list);  

        //Descending Order...
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        
        //Operation on Strings....
        ArrayList<String> str = new ArrayList<>();
        str.add("Akshay");
        str.add("Akshat");
        str.add("Aayush");
        str.add("Yash");
        
        Collections.sort(str);
        System.out.println(str);
    }
}

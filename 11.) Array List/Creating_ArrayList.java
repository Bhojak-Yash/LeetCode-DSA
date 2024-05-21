import java.util.ArrayList;

public class Creating_ArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        //Add operation - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        list.add(1,9);
        System.out.println(list);

        //Get operation - O(1)
        int a = list.get(2); 
        System.out.println(a);

        //Remover opeation - O(n)
        list.remove(2);
        System.out.println(list);

        //Set Operation - O(n)
        list.set(2,10);
        System.out.println(list); 

        //Contains - O(n)
        Boolean b = list.contains(12);
        System.out.println(b);

        //Size of ArrayList
        int c = list.size();
        System.out.println(c);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }   
}
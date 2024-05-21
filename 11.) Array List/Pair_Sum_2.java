import java.util.*;
public class Pair_Sum_2 {
    
    private static Boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)) { //Breaking Point...
                bp = i;
                break;
            }
        }

        int lp = bp+1;  //Smallest no.
        int rp = bp;    //Largest no.
        int n = list.size();

        while(lp != rp){
            //Case 1...
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }
            //Case 2...
            
            if(list.get(lp) + list.get(rp) > target){
                rp = (n+rp-1) % n;
            }
            //Case 3...
            else{
                lp = (lp+1) % n;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.print(pairSum2(list, target));
    }
}
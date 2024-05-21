import java.util.*;

public class Fractional_Knapsack {
    public static void main(String[] args) {
        int val[]   = {60, 100, 120};
        int wt[]    = {10, 20, 30};
        int w = 50;

        double ratio[][] = new double [val.length][2];
        //0th column = index.....1st col = ratio

        for(int i=0 ;i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double)wt[i];
        }

        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int final_val = 0;
        
        for(int i= ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= wt[idx]){
                final_val += val[idx];
                capacity -= wt[idx];
            }else{
                final_val += (ratio[i][1] * capacity);
                break;
            }
        }
        System.out.println("Final value : " + final_val);
    }
}

import java.util.*;

public class Next_greater_element {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int next_Greater[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        
        for(int i=arr.length-1; i>=0; i--){
            //1 While loop
            //arr[s.peek()] = stack[top]
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            //2 if-else
            if(s.isEmpty()){
                next_Greater[i] = -1;
            } else{
                next_Greater[i] = arr[s.peek()];
            }
            //3 push in stack
            s.push(i);
        }

        for(int i=0; i<next_Greater.length; i++){
            System.out.print(next_Greater[i] + " ");
        }
    }
}

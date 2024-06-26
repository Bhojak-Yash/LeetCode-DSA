import java.util.*;

public class Stack_Using_ArrayList {
    public static class Stack{
        public static ArrayList<Integer> list = new ArrayList<>();
        
        //isEmpty function...
        public static boolean isEmpty(){
            return list.size() == 0;
        }
        //push function...
        public static void push(int data){
            list.add(data);
        }

        //pop function...
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(Integer.valueOf(top));
            return top;
        }

        //peek function...
        
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
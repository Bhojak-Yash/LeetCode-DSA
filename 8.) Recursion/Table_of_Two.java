public class Table_of_Two{ 

    public static void table(int n, int i){
        
        if(i >10){
            return;
        }
        
        System.out.println(n + " x " + i + " = " + n*i );
        table(n, i+1);
    }
    
    public static void main(String[] args) {
        int n = 2, i = 1;
        table(2, i);    
    }
}
 
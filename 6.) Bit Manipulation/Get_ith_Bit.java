
public class Get_ith_Bit {
    public static int print(int n, int i) {
        int bitmask = 1<<i;	//no. jisse divide krna h...
        
        if((n & bitmask) == 0) {
            return 0;
        }else {
            return 1;
        }
    }
        
    public static void main(String[] args) {
        System.out.println(print(10,2));
        
    }	
}

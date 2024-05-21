
public class Clear_ith_Bit {
    public static int print(int n, int i) {

        int bitmask = 1<<i;	//no. jisse divide krna h...
        return n & ~bitmask;
    }
        
    public static void main(String[] args) {
        System.out.println(print(10,1));
        
    }	
}

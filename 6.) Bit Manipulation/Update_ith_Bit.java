public class Update_ith_Bit {
	
    /*1*/	public static int clear(int n, int i) {
    
                int bitmask = 1<<i;	//no. jisse divide krna h...
                return n & ~bitmask;
            }
        
    /*2*/	public static int set(int n, int i) {
            
                int bitmask = 1<<i;	//no. jisse divide krna h...
                return n|bitmask;
            }
        
    /*3*/	public static int update(int n, int i, int newBit) {
                if(newBit == 0) {
                    return clear(n,i);
                }else {
                    return set(n, i);
                }
            }
        
        public static void main(String[] args) {
                System.out.println(update(10,2,1));
        }
    }
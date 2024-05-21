public class Binary_String {
   
    public static void binString(int n, int lastPlace, String str){
        // base case
        if ( n == 0 ) {
        
            System.out.println ( str ) ;
            return ;
        }
    
        // kaam
        binString(n-1, 0, str+"0" );
        if ( lastPlace == 0 ) {
            binString(n-1, 1, str+"1");
        }
    }
 
    public static void main(String[] args) {
        binString(3, 0, "");
    }
}
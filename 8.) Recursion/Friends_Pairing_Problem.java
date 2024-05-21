public class Friends_Pairing_Problem {
    public static int pair(int n){
        //Base Case..
        if(n==1 || n==2){
            return n;
        }

        // choice
        // single
        int fnm1 = pair( n - 1 ) ;
        
        // pair
        int fnm2 = pair( n - 2 ) ;
        int pairways = ( n - 1 ) * fnm2 ;
        
        // totWays
        int totWays = fnm1 + pairways ;

        return totWays;
    }
    
    public static void main(String[] args) {
        System.out.println(pair(3));
    }
}
public class Grid_Ways {

    public static int GridWays(int i, int j, int n, int m){
        //base case
        if(i == n-1 && j == m-1){ //Condition of last cell...
            return 1;
        }else if(i==n || j==m){ //Boundary cross condition...
            return 0;
        }
        //kaam
        int w1 = GridWays(i+1, j, n, m);
        int w2 = GridWays(i, j+1, n, m);

        return w1 + w2;
    }
    public static void main(String[] args) {
        int n=3, m=3; //row=n , col=m
        System.out.println(GridWays(0, 0, n, m));
    }
}

public class N_Queens {
    public static boolean isSafe(char board[][], int row, int col){
        //Vertical Up...
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //Diagonal Left Up...
        for(int i=row-1, j=col-1; i>=0 && j>=0 ; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //Diagonal Right Up...
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row){
        if(row == board.length){
            printBoard(board);
            return;
        }
        //column loop...
        for(int col=0; col<board.length; col++){
            if(isSafe(board, row , col)){    
                board[row][col] = 'Q';
                nQueens(board, row+1); //Recursion...
                board[row][col] = '.'; //Backtracking...
            }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("------ Chess Board ------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j] + " "); 
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        //Initialize....
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        nQueens(board, 0);
    }
}
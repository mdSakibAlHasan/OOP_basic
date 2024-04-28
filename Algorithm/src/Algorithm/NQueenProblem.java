package Algorithm;

// Java program to solve N Queen Problem using backtracking

public class NQueenProblem {
    final int N = 4;

    // A utility function to print solution
    void printSolution(int board[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] == 1)
                    System.out.print("Q ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }
    }

    boolean isSafe(int board[][], int row, int col)
    {
        int x[] = {-1,-1,-1,0,0,1,1,1};
        int y[] = {-1,0,1,-1,1,-1,0,1};
        for(int i=0;i<8;i++){
            if(row+x[i]>=0 && row+x[i]<N && col+y[i]>=0 && col+y[i]<N){
                if(board[row+x[i]][col+y[i]] == 1)
                    return false;
            }
        }

        return true;
    }

    // A recursive utility function to solve N
    // Queen problem
    boolean solveNQUtil(int board[][], int col)
    {
        if (col >= N)
            return true;

        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {

                // Place this queen in board[i][col]
                board[i][col] = 1;

                // Recur to place rest of the queens
                if (solveNQUtil(board, col + 1) == true)
                    return true;

                board[i][col] = 0; // BACKTRACK
            }
        }

        // If the queen can not be placed in any row in
        // this column col, then return false
        return false;
    }


    boolean solveNQ()
    {
        int board[][] = new int[N][N];
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                board[i][j] = 0;
            }
        }

        if (solveNQUtil(board, 0) == false) {
            System.out.print("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }

    public static void main(String args[])
    {
        NQueenProblem Queen = new NQueenProblem();
        Queen.solveNQ();
    }
}


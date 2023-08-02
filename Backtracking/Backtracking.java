public class Backtracking {
    public static void changeArr(int arr[], int i, int val) {
        //base case
        if(arr.length == i) {
            printArr(arr);
            System.out.println();
            return;
        }
        //recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void findSubSets(String str, String ans, int i) {
        //base case
        if(i == str.length()) {
            System.out.print(ans);
            return;
        }
        //Yes Choice
        findSubSets(str, ans+str.charAt(i),i+1);
        //No Choice
        findSubSets(str, ans, i+1);
    }
    public static void findPermutations(String str, String ans) {
        if(str.length() == 0) {
            System.out.print(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            String Newstr = str.substring(0,i) + str.substring(i+1);
            findPermutations(Newstr, ans+curr);
        }
    }
    public static boolean nQueens(char board[][], int row) {
        //base
        if(row == board.length) {
          //  count++;
            return true;
        }
        
        //column
        for(int j=0; j<board.length; j++) {
           if(isSafe(board,row,j)) {
            board[row][j] = 'Q';
            if(nQueens(board,row+1)) { //function call
            return true;
           }
           board[row][j] = 'x';
        }
    }
    return false;
    }
    public static void printBoard(char board[][]) {
        System.out.println("-----chess board-----");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + "x");
            }
             System.out.println();
        }
    }
    public static boolean isSafe(char board[][], int row , int col) {
        //vertical up
        for(int i=row-1; i>=0; i--) {
          if(board[i][col] == 'Q') {
            return false;
          }
        }
        //diag. left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        //diag right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if(board[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }
    public static int gridways(int i, int j, int n, int m) {
        //base case
        if(i == n-1 && j == m-1) { //condition for lastcell
            return 1;
        } else if(i == n || j == m) {
           return 0;
        }
        int w1 = gridways(i,j+1,n,m);
        int w2 = gridways(i+1,j,n,m);
        return w1 + w2;
    }
    //static int count = 0;
    public static void isSafer(int sudoku[][], int row, int col, int digit) {
        //column
        for(int i=0; i<=8; i++) {
            if(sudoku[row][col] == digit) {
                return false;
            }
        }
        //row
        for(int j=0; j<=8; j++) {
            if(sudoku[row][col] == digit) {
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        //3*3 grid
        for(int i=sr; i<sr+3; i++) {
            for(int j= sc; j<sc+3; j++) {
                if(sudoku[row][col] == digit) {
                    return false;
                }
            }
        }
    }
    public static boolean sudokuSolver(int sudoku[][], int row, int col){
        //base case
        if(row == 9) {
            return true;
        }
        //recursion
        int nextRow = row, nextCol =  col+1;
        if(col+1 == 9) {
            nextRow = row+1;
            nextCol = 0;
        }
        if(sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit =1; digit <= 9; digit++) {
            if(isSafe(sudoku, row , col, digit)) {
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku,nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
            
        }
        return false;
    }
    public static void printsudoku(int sudoku[][]) {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int sudoku[][] = {}
        if(sudokuSolver(sudoku,0,0)) {
            System.out.print("Solution exist");
            printsudoku(sudoku);
        } else { 
            System.out.print("Solution doesn't exist");
        }
    }
        //int n = 3, m=3;
        //System.out.println(gridways(0,0,n,m));
       //int n = 4;
      // char board[][] = new char[n][n];
       //initialize
       //for(int i=0; i<n; i++) {
       // for(int j=0; j<n; j++) {
       //     board[i][j] = 'x';
       // }
      // }
      // if(nQueens(board,0)) {
      //  System.out.println("Solution is possible");
      //  printBoard(board);
       //} else {
       // System.out.println("Solution is not possible");
      // }
      // System.out.print("total ways to solve n Queens :"+ count);
    }

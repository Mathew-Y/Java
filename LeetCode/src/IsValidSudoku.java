public class IsValidSudoku {
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                          {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                          {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                          {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                          {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                          {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                          {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                          {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                          {'.', '.', '.', '.', '8', '.', '.', '7', '9'},};

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char [][] board) {
        // Check horizontal lines (rows)
        for(int i = 0; i < board.length; i++) {
            int[] temp = new int[9];
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] != '.') {
                    int number = Integer.parseInt(String.valueOf(board[i][j]));
                    temp[number - 1]++;
                    if(temp[number - 1] > 1) {
                        return false;
                    }
                }

            }
        }

        // Check all vertical lines (columns)
        for(int j = 0; j < board[0].length; j++) {
            int[] temp = new int[9];
            for(int i = 0; i < board.length; i++) {
                if(board[i][j] != '.') {
                    int number = Integer.parseInt(String.valueOf(board[i][j]));
                    temp[number - 1]++;
                    if(temp[number - 1] > 1) {
                        return false;
                    }
                }
            }
        }

        int currentSubBoard = 0;
        int rows = 0;
        int columns = 0;
        while(currentSubBoard < 9) {
            int[] temp = new int[9];
            for (int i = rows; i < rows + 3; i++) {
                for (int j = columns; j < columns + 3; j++) {
                    System.out.println("i: " + i);
                    System.out.println("j: " + j);
                    if(board[i][j] != '.') {
                        int number = Integer.parseInt(String.valueOf(board[i][j]));
                        temp[number - 1]++;
                        if(temp[number - 1] > 1) {
                            return false;
                        }
                    }
                }
            }
            currentSubBoard++;

            if(currentSubBoard % 3 == 0) {
                rows += 3;
                columns = 0;
            }
            else if(currentSubBoard % 3 == 1 || currentSubBoard % 3 == 2) {
                columns += 3;
            }
        }

        return true;
    }
}

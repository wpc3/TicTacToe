package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

     Character[][] board;

    public Board(Character[][] matrix) {
        this.board = matrix;
//    this.board = new Character[matrix.length][matrix[0].length];
//    for(int i =0; i < matrix.length; i++){
//        for(int j =0; j < matrix[i].length; j++){
//            this.board[i][j] = matrix[i][j];
//        }
//    }

    }

//    public void printBoard(){
//        for(int i = 0; i < board.length; i++){
//            System.out.print("{");
//            for(int j = 0; j <board[i].length; j++){
//                System.out.print("" + board[i][j] + "");
//                if(j < board[i].length -1){
//                    System.out.print(", ");
//                }
//            }
//            System.out.println("},");
//        }
//    }

    public Boolean isInFavorOfX() {
        //Rows
        for(int i = 0; i< 3; i++) {
            if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') {
                return true;
            }



        }
        //Columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == 'X' && board[1][j] == 'X' && board[2][j] == 'X') {
                return true;

            }


        }

        //Diagonals
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'){
            return true;
        } else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            return true;
        }


        return false;
    }

    public Boolean isInFavorOfO() {
        //Rows
        for(int i = 0; i< 3; i++) {
            if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') {
                return true;
            }



        }
        //Columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == 'O' && board[1][j] == 'O' && board[2][j] == 'O') {
                return true;

            }


        }

        //Diagonals
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){
            return true;
        } else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            return true;
        }






        return false;
    }

    public Boolean isTie() {
        for (int i =0; i < 3; i++){
            for (int j=0; j<3; j++){
                if (board[i][j] == ' '){
                    return false;
                }
            }
        }
        return !isInFavorOfO() && !isInFavorOfX();
    }

    public String getWinner() {
    if (isInFavorOfX()){
        return "X";
    } else if (isInFavorOfO()) {
        return "O";
    }
    else
        return "";
    }




}

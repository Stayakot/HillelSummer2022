package Lesson3;

public class ChessBoard {

    public static void main(String[] args) {
        System.out.println("Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети)");

        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }
}
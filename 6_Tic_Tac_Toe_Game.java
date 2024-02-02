import java.util.Scanner;

public class TicTacToe {
    private static final char EMPTY = ' ';
    private static final char X = 'X';
    private static final char O = 'O';
    private final char[][] board = new char[3][3];
    private char currentPlayer = X;

    public TicTacToe() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (!isGameOver()) {
            displayBoard();
            makeMove(scanner);
            if (isGameOver()) {
                break;
            }
            currentPlayer = currentPlayer == X ? O : X;
        }
        displayBoard();
        if (hasWinner()) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
        System.out.println("Game Over!");
    }

    private void makeMove(Scanner scanner) {
        int row, col;
        do {
            System.out.printf("Player %c, enter row (1-3) and column (1-3) to place your move: ", currentPlayer);
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
        } while (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != EMPTY);

        board[row][col] = currentPlayer;
    }

    private boolean isGameOver() {
        return hasWinner() || isBoardFull();
    }

    private boolean hasWinner() {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != EMPTY && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != EMPTY && board[0][j] == board[1][j] && board[0][j] == board[2][j]) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] != EMPTY && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }
        if (board[0][2] != EMPTY && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }

        return false;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("-----");
            }
        }
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }
}

import java.util.Scanner;

public class TicTacToe {
	
    static char[] board = new char[10];
    static char userLetter;
    static char computerLetter;

    public static void main(String[] args) {
		
	createEmptyBoard();
        chooseLetter();
     
    }    	
    private static void createEmptyBoard()
    {
        for(int index=1; index<board.length;index++)
        {
            board[index] = ' ';
        }
    }
    private static void chooseLetter()
    {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose a letter : X or O:- ");
    userLetter = scanner.next().toUpperCase().charAt(0);
    computerLetter = (userLetter == 'X') ? 'O' : 'X';
    }
}

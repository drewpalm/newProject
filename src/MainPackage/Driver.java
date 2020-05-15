package MainPackage;

import java.awt.Point;
import java.util.HashMap;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Board board = Board.GetStartingPosition();
		printBoard(board, Color.white);
		playGame(board);
	}
	
	public static void playGame(Board board) {
		
		while(true) {
			Move move = getMove();
			board.movePiece(move);
			printBoard(board, Color.white);
		}
	}
	
	public static Move getMove() {
		
		System.out.print("input move: ");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		return new Move(input);
	}
	
	public static void printBoard(Board board, Color playerColor) {
		
		if(playerColor == Color.white) {
			System.out.println("  ABCDEFGH  ");
			System.out.println("  --------  ");
			for(int row = 7; row >= 0; row--) {
				System.out.print((row + 1) + "|");
				for(int col = 0; col <= 7; col++) {
					Square square = new Square(col, row);
					char display = board.getPiece(col, row).character;
					if(display == '?') {
						display = (row + col) % 2 == 0 ? ' ' : '*';
					}
					System.out.print(display);
				}
				System.out.println("|" + (row + 1));
			}
			System.out.println("  --------  ");
			System.out.println("  ABCDEFGH  ");
		}
		else {
			System.out.println(" HGFEDCBA ");
			for(int row = 0; row <= 7; row++) {
				System.out.print(row + 1);
				for(int col = 7; col >= 0; col--) {
					Square square = new Square(col, row);
					char display = board.getPiece(col, row).character;
					if(display == '?') {
						display = (row + col) % 2 == 0 ? ' ' : '*';
					}
					System.out.print(display);
				}
				System.out.println(row + 1);
			}
			System.out.println(" HGFEDCBA ");
		}
	}

}

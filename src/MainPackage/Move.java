package MainPackage;

import java.awt.Point;

public class Move {
	public Square start;
	public Square end;
	
	public Move(int startCol, int startRow, int endCol, int endRow) {
		
		start = new Square(startCol, startRow);
		end = new Square(endCol, endRow);
	}
	
	public Move(String code) {
		
		assert(code.length() == 4);
		
		int startCol = charToCol(code.toCharArray()[0]);
		int startRow = charToRow(code.toCharArray()[1]);
		int endCol = charToCol(code.toCharArray()[2]);
		int endRow = charToRow(code.toCharArray()[3]);
		
		start = new Square(startCol, startRow);
		end = new Square(endCol, endRow);
	}
	
	public int charToCol(char c) {
		
		switch(c) {
			case 'a': return 0;
			case 'b': return 1;
			case 'c': return 2;
			case 'd': return 3;
			case 'e': return 4;
			case 'f': return 5;
			case 'g': return 6;
			case 'h': return 7;
			default: return -1;
		}
	}
	
	public int charToRow(char c) {
		switch(c) {
			case '1': return 0;
			case '2': return 1;
			case '3': return 2;
			case '4': return 3;
			case '5': return 4;
			case '6': return 5;
			case '7': return 6;
			case '8': return 7;
			default: return -1;
		}
	}
	
	
}

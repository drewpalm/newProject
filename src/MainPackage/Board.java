package MainPackage;

public class Board {

	private Piece[][] _board = new Piece[8][8]; // [col][row]
	
	public Board() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				_board[i][j] = Piece.Empty;
			}
		}
	}
	
	public static Board GetStartingPosition() {
		Board board = new Board();
		
		board.setPiece(0, 0, Piece.WhiteRook);
		board.setPiece(1, 0, Piece.WhiteKnight);
		board.setPiece(2, 0, Piece.WhiteBishop);
		board.setPiece(3, 0, Piece.WhiteQueen);
		board.setPiece(4, 0, Piece.WhiteKing);
		board.setPiece(5, 0, Piece.WhiteBishop);
		board.setPiece(6, 0, Piece.WhiteKnight);
		board.setPiece(7, 0, Piece.WhiteRook);
		
		board.setPiece(0, 1, Piece.WhitePawn);
		board.setPiece(1, 1, Piece.WhitePawn);
		board.setPiece(2, 1, Piece.WhitePawn);
		board.setPiece(3, 1, Piece.WhitePawn);
		board.setPiece(4, 1, Piece.WhitePawn);
		board.setPiece(5, 1, Piece.WhitePawn);
		board.setPiece(6, 1, Piece.WhitePawn);
		board.setPiece(7, 1, Piece.WhitePawn);
		
		board.setPiece(0, 7, Piece.BlackRook);
		board.setPiece(1, 7, Piece.BlackKnight);
		board.setPiece(2, 7, Piece.BlackBishop);
		board.setPiece(3, 7, Piece.BlackQueen);
		board.setPiece(4, 7, Piece.BlackKing);
		board.setPiece(5, 7, Piece.BlackBishop);
		board.setPiece(6, 7, Piece.BlackKnight);
		board.setPiece(7, 7, Piece.BlackRook);
		
		board.setPiece(0, 6, Piece.BlackPawn);
		board.setPiece(1, 6, Piece.BlackPawn);
		board.setPiece(2, 6, Piece.BlackPawn);
		board.setPiece(3, 6, Piece.BlackPawn);
		board.setPiece(4, 6, Piece.BlackPawn);
		board.setPiece(5, 6, Piece.BlackPawn);
		board.setPiece(6, 6, Piece.BlackPawn);
		board.setPiece(7, 6, Piece.BlackPawn);
		
		return board;
	}
	
	public void setPiece(int col, int row, Piece piece) {
		_board[col][row] = piece == null ? Piece.Empty : piece;
	}
	
	public Piece getPiece(int col, int row) {
		try {
			return _board[col][row];
		}
		catch(Exception e) {
			// out of range
			return null;
		}
	}
	
	// throws out of bounds
	public void movePiece(Move move) {
		
		_board[move.end.col][move.end.row] = _board[move.start.col][move.start.row];
		_board[move.start.col][move.start.row] = Piece.Empty;
	}
}

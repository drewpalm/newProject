package MainPackage;

import java.util.*;

enum Color { white, black }
enum Type { king, queen, rook, bishop, knight, pawn }

public enum Piece {
	
	WhiteKing(Color.white, Type.king, 'K'),
	WhiteQueen(Color.white, Type.queen, 'Q'),
	WhiteRook(Color.white, Type.rook, 'R'),
	WhiteBishop(Color.white, Type.bishop, 'B'),
	WhiteKnight(Color.white, Type.knight, 'N'),
	WhitePawn(Color.white, Type.pawn, 'P'),
	BlackKing(Color.black, Type.king, 'k'),
	BlackQueen(Color.black, Type.queen, 'q'),
	BlackRook(Color.black, Type.rook, 'r'),
	BlackBishop(Color.black, Type.bishop, 'b'),
	BlackKnight(Color.black, Type.knight, 'n'),
	BlackPawn(Color.black, Type.pawn, 'p'),
	Empty(null, null, '?');
	
	Color color;
	Type type;
	char character;
	
	Piece(Color color, Type type, char character){
		this.color = color;
		this.type = type;
		this.character = character;
	}
	
	static Piece get(Color color, Type type) {
	
		Optional<Piece> result = Arrays.stream(Piece.values())
			.filter(x -> x.color == color && x.type == type)
			.findFirst();
		
		return result.isPresent() ? result.get() : null;
	}
}

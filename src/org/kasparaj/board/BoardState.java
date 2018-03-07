package org.kasparaj.board;

public interface BoardState {
	
	Tile getRelativeTile(Tile origin, Vector offset);
	
}

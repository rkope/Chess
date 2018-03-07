package org.kasparaj.pieces;

import java.util.HashSet;
import java.util.Set;

import org.kasparaj.board.BoardState;
import org.kasparaj.board.Tile;

public abstract class Piece {
	
	private Tile previousTile;
	private Tile currentTile;
	
	private Set<Tile> forwardrefs;
	
	public Piece() {
		previousTile = null;
		forwardrefs = new HashSet<>();
	}
	
	public abstract void registerBackreferences(BoardState boardState);

}

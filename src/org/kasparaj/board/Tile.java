package org.kasparaj.board;

import java.util.HashSet;
import java.util.Set;

import org.kasparaj.pieces.Piece;

public class Tile {
	
	private final Vector position;
	
	private Set<Piece> backref;
	
	public Tile(int x, int y) {
		this.position = new Vector(x, y);
		backref = new HashSet<>();
	}
	
	public Vector getPos() {
		return position;
	}
	
}

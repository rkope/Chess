package org.kasparaj.board;

import java.util.HashSet;
import java.util.Set;

import org.kasparaj.pieces.Piece;

public class Tile {
	
	private final Vector position;
	
	private Set<Piece> backrefs;
	
	public Tile(int x, int y) {
		this.position = new Vector(x, y);
		backrefs = new HashSet<>();
	}
	
	public Vector getPos() {
		return position;
	}
	
	public void registerBackref(Piece p) {
		backrefs.add(p);
	}
	
}

package org.kasparaj.board;

public class Vector {
	public final int x;
	public final int y;
	
	public Vector(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector add(Vector that) {
		return new Vector(this.x + that.x, this.y + that.y);
	}
	
}

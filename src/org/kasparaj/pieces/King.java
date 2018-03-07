package org.kasparaj.pieces;

import org.kasparaj.board.BoardState;

public class King extends Piece {
	
	private boolean canCastleKS;
	private boolean canCastleQS;
	
	public King() {
		canCastleKS = true;
		canCastleQS = true;
	}
	
	@Override
	public void registerBackreferences(BoardState boardState) {
		// TODO
	}
	
	public boolean canCastleKS() {
		return canCastleKS;
	}
	
	public void setCanCastleKS(boolean canCastleKS) {
		this.canCastleKS = canCastleKS;
	}
	
	public boolean canCastleQS() {
		return canCastleQS;
	}
	
	public void setCanCastleQS(boolean canCastleQS) {
		this.canCastleQS = canCastleQS;
	}
	
}

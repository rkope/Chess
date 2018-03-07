package org.kasparaj.pieces;

import org.kasparaj.board.BoardState;
import org.kasparaj.board.Tile;
import org.kasparaj.board.Vector;

public class King extends Piece {

	private boolean canCastleKS;
	private boolean canCastleQS;

	public King() {
		canCastleKS = true;
		canCastleQS = true;
	}

	@Override
	public void initLinks(BoardState boardState) {
		Tile currTile = this.getTile();
		for (int dx = -1; dx <= 1; dx++)
			for (int dy = -1; dy <= 1; dy++) {
				if (dx == 0 && dy == 0)
					break;
				Tile target = boardState.getRelativeTile(currTile, new Vector(dx, dy));
				if (target != null) {
					this.registerForwardref(target);
					target.registerBackref(this);
				}
			}
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

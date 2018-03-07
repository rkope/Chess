package org.kasparaj.board;

public class StandardBoardState implements BoardState {
	private Tile[][] board;
	
	public StandardBoardState() {
		board = new Tile[8][8];
		for (int x = 0; x < 8; x++)
			for (int y = 0; y < 8; y++)
				board[x][y] = new Tile(x, y);
	}
	
	@Override
	public Tile getRelativeTile(Tile origin, Vector offset) {
		return this.getTileAt(origin.getPos().add(offset));
	}
	
	protected Tile getTileAt(Vector pos) {
		return board[pos.x][pos.y];
	}
}

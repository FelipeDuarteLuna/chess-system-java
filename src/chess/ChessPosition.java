package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	//Construtor
	public ChessPosition(char column, int row) {
		if(column <'a' || column > 'h' || row < 1 || row > 8) {
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
	}
	
	//Getter's
	public char getColumn() {
		return this.column;
	}

	public int getRow() {
		return this.row;
	}
	
	//Method's
	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8- position.getRow());
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+this.column + this.row;
	}
}

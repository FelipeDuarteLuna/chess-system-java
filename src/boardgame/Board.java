package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece [][] pieces;
	
	//Consthutores
	public Board(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		
		this.rows = linhas;
		this.columns = colunas;
		pieces = new Piece[rows][columns];
	}

	//Getter's and Setter's
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	//Method's
	
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
		
	public void placePiece(Piece piece, Position position) {
		if( thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()]= piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return (row >= 0 && row < this.rows && column >= 0 && column < this.columns);
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(),position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}

}

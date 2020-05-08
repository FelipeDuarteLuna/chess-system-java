package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece [][] pieces;
	
	//Consthutores
	public Board(int linhas, int colunas) {
		this.rows = linhas;
		this.columns = colunas;
		pieces = new Piece[rows][columns];
	}

	//Getter's and Setter's
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	//Method's
	
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
		
	
	

}

package boardgame;

public class Position {
	
	private int row;
	private int column;
	
	//Construthores
	public Position() {
		
	}

	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	//Getter's e Setter's
	public void setRow(int linha) {
		this.row = linha;
	}
	
	public int getRow() {
		return this.row;
	}
	
	public void setColumn(int coluna) {
		this.column= coluna;
	}
	
	public int getColumn() {
		return this.column;
	}
	
	//MEthod's
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getRow() + ", " + this.getColumn();
	}

}

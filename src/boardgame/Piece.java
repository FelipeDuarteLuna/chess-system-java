package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
		
	//Consthutores
	public Piece(Board board) {
		this.board = board;
	}
	
	///Getter's
	protected Board getBoard() {
		return this.board;
	}
	
}

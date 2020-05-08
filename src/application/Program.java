package application;

import chess.ChessMatch;

public class Program {
	public static void main(String[]args) {
		
		System.out.println("Hello World !");
		/*
		Position pos = new Position(3, 5);
		
		System.out.println(pos.toString());
		
		Board tabuleiro = new Board(8, 8);*/
		
		ChessMatch partida = new ChessMatch();
		UI.printBoard(partida.getPieces());
	}
}

package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello World !");
		/*
		Position pos = new Position(3, 5);
		
		System.out.println(pos.toString());
		
		Board tabuleiro = new Board(8, 8);*/
		
		ChessMatch partida = new ChessMatch();
		while(true) {
			UI.printBoard(partida.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc) ;
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			//ChessPiece capturedPiece = ChessMatch.performChessMove(source, target);
			ChessPiece capturedPiece = partida.performChessMove(source, target);
		}
	}
}

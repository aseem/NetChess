package netchess.board;

import netchess.NCPosition;
import netchess.pieces.*;

public class NCBoard 
{
	private final int DEFAULT_SIZE = 8;
	private NCPosition[][] myBoard;
	private boolean isInCheck;
	private boolean isInCheckMate;
	
	// constructor
	public NCBoard()
	{
		this.myBoard = new NCPosition[DEFAULT_SIZE][DEFAULT_SIZE];
		this.isInCheck = false;
		this.isInCheck = false;
		this.init();
	}
	
	// initialize the board with the appropriate pieces in the right locations
	private void init()
	{
		int i = 0;
		int j = 0;
		
		for (i = 0; i < DEFAULT_SIZE; i++)
			for (i = 0; i < DEFAULT_SIZE; i++)
				myBoard[i][j] = new NCPosition(i,j);
	}
	
	public iNCPiece getPiece(NCPosition pos)
	{
		return null;
	}
	
	public boolean addPiece(NCPieceType piece, NCColor color, NCPosition pos)
	{
		return true;
	}
	
	public boolean removePiece(iNCPiece piece)
	{
		return true;
	}
	
	public boolean removePiece(NCPosition pos)
	{
		return true;
	}
	
	public boolean movePiece(iNCPiece piece, NCPosition newPos)
	{
		return true;
	}
	
	// TODO: method to return all possible legal moves for a piece
	// public getValidMoves(iNCPiece piece)
	
	public String toString()
	{
		// TODO: implement a print method here
		return "";
	}
}

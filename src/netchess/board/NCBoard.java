package netchess.board;

import netchess.board.pieces.NCPieceType;
import netchess.board.pieces.iNCPiece;


public class NCBoard 
{
	private final int DEFAULT_SIZE = 8;
	private NCSpace[][] myBoard;

	
	/* public constructor */
	public NCBoard()
	{
		this.myBoard = new NCSpace[DEFAULT_SIZE][DEFAULT_SIZE];
		this.init();
	}
	
	// initialize the board with the appropriate pieces in the right locations
	private void init()
	{
		int i = 0;
		int j = 0;
		
		for (i = 0; i < DEFAULT_SIZE; i++)
			for (i = 0; i < DEFAULT_SIZE; i++)
				myBoard[i][j] = new NCSpace(i,j);
	}
	
	/* returns the space at the given coordinates */
	public NCSpace getSpace(int row, int col)
	{
		if (row < DEFAULT_SIZE && col < DEFAULT_SIZE &&
				row >= 0 && col >= 0)
		{
			return (this.myBoard[row][col]);
		}
		else
			return null;
	}
	
	/* returns the piece at the given position */
	public iNCPiece getPiece(NCSpace pos)
	{
		return null;
	}
	
	/* places a piece on the provided space */
	public boolean addPiece(NCPieceType piece, NCColor color, NCSpace pos)
	{
		return true;
	}
	
	/* removes a piece from the provided space */
	public boolean removePiece(NCSpace pos)
	{
		return true;
	}
	
	/* moves a piece from one space to another
	 * validates that the move is legal 
	 */
	public boolean movePiece(NCSpace oldPos, NCSpace newPos)
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

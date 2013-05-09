package netchess.board.pieces;

import netchess.board.NCBoard;
import netchess.board.NCColor;
import netchess.board.NCSpace;


public abstract class NCPiece implements iNCPiece
{
	protected NCColor myColor;
	protected NCPieceType myType;
	protected boolean isActive;
	
	/* public constructor */
	public NCPiece(NCColor color, NCSpace pos)
	{
		this.myColor = color;
		this.isActive = true;
	}
	
	/* Change the type of piece */
	public void setType(NCPieceType type)
	{
		this.myType = type;
	}
	
	/* Get the type of piece */
	public NCPieceType getType()
	{
		return this.myType;
	}
	
	/* Get the color of the piece */
	public NCColor getColor()
	{
		return this.myColor;
	}
	
	// implemented by subclass
	public abstract boolean isValidMove(NCSpace pos, NCBoard board);
	
	// implemented by subclass
	public abstract String toString();
}

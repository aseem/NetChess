package netchess.pieces;

import netchess.NCPosition;
import netchess.board.NCBoard;

public abstract class NCPiece implements iNCPiece
{
	protected NCColor myColor;
	protected NCPieceType myType;
	protected NCPosition myPos;
	protected boolean isActive;
	
	public NCPiece(NCColor color, NCPosition pos)
	{
		this.myColor = color;
		this.myPos = pos;
		this.isActive = true;
	}
	
	public void setType(NCPieceType type)
	{
		this.myType = type;
	}
	
	public NCPieceType getType()
	{
		return this.myType;
	}
	
	public NCColor getColor()
	{
		return this.myColor;
	}
	
	public void setPosition(NCPosition pos)
	{
		// TODO: add basic validation of passed in position
		this.myPos = pos;
	}
	
	public NCPosition getPosition()
	{
		return this.myPos;
	}
	
	public boolean isActive()
	{
		return this.isActive;
	}
	
	public void remove()
	{
		this.isActive = false;
		this.myPos = null;
	}
	
	// implemented by subclass
	public abstract boolean isValidMove(NCPosition pos, NCBoard board);
	
	// implemented by subclass
	public abstract String toString();
}

package netchess;

import java.util.ArrayList;

public abstract class NCPiece implements iPiece
{
	private NCColor myColor;
	private NCPieceType myType;
	private String myPos;
	
	public NCPiece(NCColor color)
	{
		this.myColor = color;
	}
	
	public NCPieceType getType()
	{
		return this.myType;
	}
	
	public NCColor getColor()
	{
		return this.myColor;
	}
	
	public void setPosition(String pos)
	{
		// TODO: add basic validation of passed in position
		this.myPos = pos;
	}
	
	public String getPosition()
	{
		return this.myPos;
	}
	
	// implemented by subclass
	public abstract ArrayList<String> getPossibleMoves();
}

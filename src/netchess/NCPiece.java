package netchess;

public abstract class NCPiece implements iNCPiece
{
	private NCColor myColor;
	private NCPieceType myType;
	private String myPos;
	
	public NCPiece(NCColor color, String pos)
	{
		this.myColor = color;
		this.myPos = pos;
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
	public abstract void move(NCPosition newPos, NCBoard board);
	
	// implemented by subclass
	public abstract boolean isValidMove(NCPosition pos);
}

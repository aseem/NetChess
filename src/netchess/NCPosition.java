package netchess;

public class NCPosition 
{
	private boolean isFree;
	private String myPos;
	private iNCPiece myPiece;
	
	private static String convertPosition(int x, int y)
	{
		return "";
	}
	
	public NCPosition(int x, int y)
	{
		// TODO: validation for x, y
		this.myPos = convertPosition(x, y);
	}
	
	public String getPosition()
	{
		return this.myPos;
	}
	
	public boolean isFree()
	{
		return this.isFree;
	}
	
	public void addPiece(iNCPiece piece)
	{
		this.myPiece = piece;
		this.isFree = false;
	}
	
	public void removePiece()
	{
		this.myPiece = null;
		this.isFree = true;
	}
	
	public iNCPiece getPiece()
	{
		return this.myPiece;
	}
	
}

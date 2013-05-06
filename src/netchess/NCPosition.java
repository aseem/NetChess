package netchess;

import netchess.pieces.iNCPiece;

public class NCPosition 
{
	private boolean isFree;
	private String myPos;
	private iNCPiece myPiece;
	
	private static String convertPosition(int x, int y)
	{
		String row ="";
		String col = "";
		
		switch(x)
		{
			case 0:	row = "8";
					break;
			case 1: row = "7";
					break;
			case 2: row = "6";
					break;
			case 3: row = "5";
					break;
			case 4: row = "4";
					break;
			case 5: row = "3";
					break;
			case 6: row = "2";
					break;
			case 7: row = "1";
					break;
			default: row = null;
					break;
		}
		
		switch(y)
		{
			case 0:	col = "h";
					break;
			case 1: col = "g";
					break;
			case 2: col = "f";
					break;
			case 3: col = "e";
					break;
			case 4: col = "d";
					break;
			case 5: col = "c";
					break;
			case 6: col = "b";
					break;
			case 7: col = "a";
					break;
			default: col = null;
					break;
		}
		
		return (col + row);
	}
	
	public NCPosition(int x, int y)
	{
		// TODO: validation for x, y
		this.myPos = NCPosition.convertPosition(x, y);
		this.isFree = true;
		this.myPiece = null;
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
	
	public String toString()
	{
		return (this.myPos + "- " + this.myPiece.toString());
	}
	
}

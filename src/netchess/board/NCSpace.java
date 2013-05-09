package netchess.board;

import netchess.board.pieces.iNCPiece;


public class NCSpace
{
	private boolean isFree;
	private int myRow;
	private int myCol;
	private String myPos;
	private iNCPiece myPiece;
	
	/* static method to convert coordinates into chess notation. */
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
	
	/* constructor */
	public NCSpace(int x, int y)
	{
		// TODO: validation for x, y
		this.myPos = NCSpace.convertPosition(x, y);
		this.isFree = true;
		this.myPiece = null;
	}
	
	/* returns the row of the space */
	public int getRow()
	{
		return this.myRow;
	}
	
	/* returns the column of the space */
	public int getCol()
	{
		return this.myCol;
	}
	
	/* returns the position of the space in chess notation */
	public String getPosition()
	{
		return this.myPos;
	}
	
	/* tells the caller if the space is free */
	public boolean isFree()
	{
		return this.isFree;
	}
	
	/* puts a piece on the space */
	public void addPiece(iNCPiece piece)
	{
		this.myPiece = piece;
		this.isFree = false;
	}
	
	/* removes a piece from the space */
	public void removePiece()
	{
		this.myPiece = null;
		this.isFree = true;
	}
	
	/* get the piece that is on the space */
	public iNCPiece getPiece()
	{
		return this.myPiece;
	}
	
	/* toString() method */
	public String toString()
	{
		return (this.myPos + " - " + this.myPiece.toString());
	}
	
}

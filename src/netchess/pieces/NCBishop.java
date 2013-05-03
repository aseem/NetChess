package netchess.pieces;

import netchess.NCBoard;
import netchess.NCPosition;

public class NCBishop extends NCPiece
{
	public NCBishop(NCColor color, NCPosition pos)
	{
		super(color, pos);
		this.myType = NCPieceType.BISHOP;
	}
	
	@Override
	public boolean isValidMove(NCPosition pos, NCBoard board)
	{
		return true;
	}

	@Override
	public String toString() 
	{
		if (this.myColor == NCColor.WHITE)
			return "B";
		else
			return "b";
	}
}
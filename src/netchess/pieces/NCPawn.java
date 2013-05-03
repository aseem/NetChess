package netchess.pieces;

import netchess.NCBoard;
import netchess.NCPosition;

public class NCPawn extends NCPiece
{
	public NCPawn(NCColor color, NCPosition pos)
	{
		super(color, pos);
		this.myType = NCPieceType.PAWN;
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
			return "P";
		else
			return "p";
	}
}

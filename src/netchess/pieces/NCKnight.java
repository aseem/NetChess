package netchess.pieces;

import netchess.NCBoard;
import netchess.NCPosition;

public class NCKnight extends NCPiece
{
	public NCKnight(NCColor color, NCPosition pos)
	{
		super(color, pos);
		this.myType = NCPieceType.KNIGHT;
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
			return "N";
		else
			return "n";
	}
}
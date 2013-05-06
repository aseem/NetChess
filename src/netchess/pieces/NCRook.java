package netchess.pieces;

import netchess.NCPosition;
import netchess.board.NCBoard;

public class NCRook extends NCPiece
{
	public NCRook(NCColor color, NCPosition pos)
	{
		super(color, pos);
		this.myType = NCPieceType.ROOK;
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
			return "R";
		else
			return "r";
	}
}
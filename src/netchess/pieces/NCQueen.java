package netchess.pieces;

import netchess.NCPosition;
import netchess.board.NCBoard;

public class NCQueen extends NCPiece
{
	public NCQueen(NCColor color, NCPosition pos)
	{
		super(color, pos);
		this.myType = NCPieceType.QUEEN;
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
			return "Q";
		else
			return "q";
	}
}
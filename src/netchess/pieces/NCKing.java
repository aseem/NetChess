package netchess.pieces;

import netchess.NCPosition;
import netchess.board.NCBoard;

public class NCKing extends NCPiece
{
	public NCKing(NCColor color, NCPosition pos)
	{
		super(color, pos);
		this.myType = NCPieceType.KING;
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
			return "K";
		else
			return "k";
	}
}
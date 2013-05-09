package netchess.board.pieces;

import netchess.board.NCBoard;
import netchess.board.NCColor;
import netchess.board.NCSpace;


public class NCBishop extends NCPiece
{
	public NCBishop(NCColor color, NCSpace pos)
	{
		super(color, pos);
		this.myType = NCPieceType.BISHOP;
	}
	
	@Override
	public boolean isValidMove(NCSpace pos, NCBoard board)
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
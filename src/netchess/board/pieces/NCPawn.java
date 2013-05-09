package netchess.board.pieces;

import netchess.board.NCBoard;
import netchess.board.NCColor;
import netchess.board.NCSpace;


public class NCPawn extends NCPiece
{
	public NCPawn(NCColor color, NCSpace pos)
	{
		super(color, pos);
		this.myType = NCPieceType.PAWN;
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
			return "P";
		else
			return "p";
	}
}

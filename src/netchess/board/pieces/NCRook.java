package netchess.board.pieces;

import netchess.board.NCBoard;
import netchess.board.NCColor;
import netchess.board.NCSpace;


public class NCRook extends NCPiece
{
	public NCRook(NCColor color, NCSpace pos)
	{
		super(color, pos);
		this.myType = NCPieceType.ROOK;
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
			return "R";
		else
			return "r";
	}
}
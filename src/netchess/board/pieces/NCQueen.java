package netchess.board.pieces;

import netchess.board.NCBoard;
import netchess.board.NCColor;
import netchess.board.NCSpace;


public class NCQueen extends NCPiece
{
	public NCQueen(NCColor color, NCSpace pos)
	{
		super(color, pos);
		this.myType = NCPieceType.QUEEN;
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
			return "Q";
		else
			return "q";
	}
}
package netchess.board.pieces;

import netchess.board.NCBoard;
import netchess.board.NCColor;
import netchess.board.NCSpace;


public class NCKing extends NCPiece
{
	public NCKing(NCColor color, NCSpace pos)
	{
		super(color, pos);
		this.myType = NCPieceType.KING;
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
			return "K";
		else
			return "k";
	}
}
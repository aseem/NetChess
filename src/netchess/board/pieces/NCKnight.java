package netchess.board.pieces;

import netchess.board.NCBoard;
import netchess.board.NCColor;
import netchess.board.NCSpace;


public class NCKnight extends NCPiece
{
	public NCKnight(NCColor color, NCSpace pos)
	{
		super(color, pos);
		this.myType = NCPieceType.KNIGHT;
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
			return "N";
		else
			return "n";
	}
}
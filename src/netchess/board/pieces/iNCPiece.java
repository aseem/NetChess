package netchess.board.pieces;

import netchess.board.NCBoard;
import netchess.board.NCColor;
import netchess.board.NCSpace;


public interface iNCPiece 
{
	/* Change the type of piece */
	public void setType(NCPieceType type);
	
	/* Get the type of piece */
	public NCPieceType getType();
	
	/* Get the color of the piece */
	public NCColor getColor();
	
	/* Get a list of possible positions the piece can move to */
	public boolean isValidMove(NCSpace pos, NCBoard board);
	
	/* toString() method for printing */
	public String toString();
}

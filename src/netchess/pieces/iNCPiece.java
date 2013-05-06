package netchess.pieces;

import netchess.NCPosition;
import netchess.board.NCBoard;

public interface iNCPiece 
{
	/* Change the type of piece */
	public void setType(NCPieceType type);
	
	/* Get the type of piece */
	public NCPieceType getType();
	
	/* Get the color of the piece */
	public NCColor getColor();
	
	/* Set the position of the piece on the board */
	public void setPosition(NCPosition pos);
	
	/* Get the current position of the piece on the board */
	public NCPosition getPosition();
	
	/* Determine if the piece is still active in the game */
	public boolean isActive();
	
	/* Remove the piece from the board when it is captured */
	public void remove();
	
	/* Get a list of possible positions the piece can move to */
	public boolean isValidMove(NCPosition pos, NCBoard board);
	
	/* toString() method for printing */
	public String toString();
}

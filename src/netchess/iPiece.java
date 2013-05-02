package netchess;

import java.util.ArrayList;

public interface iPiece 
{
	/* Change the type of piece */
	public void setType(NCPieceType type);
	
	/* Get the type of piece */
	public NCPieceType getType();
	
	/* Get the color of the piece */
	public NCColor getColor();
	
	/* Set the position of the piece on the board */
	public void setPosition(String pos);
	
	/* Get the current position of the piece on the board */
	public String getPosition();
	
	/* Get a list of possible positions the piece can move to */
	public ArrayList<String> getPossibleMoves();
}

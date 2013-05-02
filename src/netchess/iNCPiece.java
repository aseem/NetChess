package netchess;

public interface iNCPiece 
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
	
	/* Moves the piece to specified location on the board */
	public void move(NCPosition newPos, NCBoard board);
	
	/* Get a list of possible positions the piece can move to */
	public boolean isValidMove(NCPosition pos);
}

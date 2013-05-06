package netchess;

import java.util.ArrayList;

import netchess.board.NCBoard;
import netchess.pieces.*;

public class NCPlayer 
{
	/* This should be a simple class
	 * that just keeps track of the number 
	 * of pieces of each type for the player.
	 * Also keep track of all the moves the player
	 * has made.
	 */
	private String myName;
	private NCColor myColor;
	private ArrayList<NCPawn> myPawns;
	private ArrayList<NCRook> myRooks;
	private ArrayList<NCKnight> myKnights;
	private ArrayList<NCBishop> myBishops;
	private ArrayList<NCQueen> myQueens;
	private NCKing myKing;
	
	public NCPlayer(NCColor color, String name)
	{
		this.myColor = color;
		this.myName = name;
		
		for (int i = 0; i < 8; i++)
			myPawns.add(new NCPawn(this.myColor, null));
	}
	
	private void init(ArrayList<iNCPiece> pieces, int numPieces)
	{
		
			
		
	}
	
	public iNCPiece getPiece(NCPosition position)
	{
		return null;
	}
	
	public boolean movePiece(iNCPiece piece, NCPosition newLocation, NCBoard board)
	{
		return true;
	}
	
	public void AddPiece(NCPieceType type)
	{
		
	}
	
	public void RemovePiece(iNCPiece piece)
	{
		
	}
}

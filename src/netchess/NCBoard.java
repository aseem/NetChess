package netchess;

public class NCBoard 
{
	private final int DEFAULT_SIZE = 8;
	private NCPosition[][] myBoard;
	
	public NCBoard()
	{
		this.myBoard = new NCPosition[DEFAULT_SIZE][DEFAULT_SIZE];
		this.init();
	}
	
	private void init()
	{
		int i = 0;
		int j = 0;
		
		for (i = 0; i < DEFAULT_SIZE; i++)
			for (i = 0; i < DEFAULT_SIZE; i++)
				myBoard[i][j] = new NCPosition(i,j);
	}
	
	public NCPosition getPosition(String pos)
	{
		return null;
	}
	
	public NCPosition getPosition(int row, int col)
	{
		return null;
	}
	
	public String toString()
	{
		// TODO: implement a print method here
		return "";
	}
}

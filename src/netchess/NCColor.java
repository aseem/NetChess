package netchess;

public enum NCColor 
{
	BLACK, WHITE;
	
	@Override public String toString()
	{
		//only capitalize the first letter
		String s = super.toString();
		return s.substring(0, 1) + s.substring(1).toLowerCase();
	}
}

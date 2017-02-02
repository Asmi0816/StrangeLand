package strange.model;

public class TheGame 
{
	private String storyString;
	private String leftChoice;
	private String rightChoice;
	
	public TheGame()
	{
		this.leftChoice = new String("Place holder");
		this.rightChoice = new String("Words here");
		this.storyString = new String ("What makes a story great?");
	}
	
	public String getRightChoice()
	{
		return rightChoice;
	}
	
	public String getLeftChoice()
	{
		return leftChoice;
	}
	
	public String getStoryString()
	{
		return storyString;
	}
	
	public void setRightChoice(String rightChoice)
	{
		this.rightChoice = rightChoice;
	}
	
	public void setLeftChoice(String leftChoice)
	{
		this.leftChoice = leftChoice;
	}
	
	public void setStoryString(String storyString)
	{
		this.storyString = storyString;
	}
	
}

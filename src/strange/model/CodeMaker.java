package strange.model;

public class CodeMaker 
{

	private String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private String encodedAlphabet = "";
	private String generateRandom;
	
	public String encodeMessage()
	{
		for(int i = 0; i < 25; i++)
		{
			
		}
		
		return encodedAlphabet;
	}
	
	private int randomMath()
	{
		int choiceNumber = 0;
		generateRandom = "";
		choiceNumber = (int)(Math.random() * 26);
		if(choiceNumber == 1)
		{
			if(encodedAlphabet.contains("a") == false)
			{
			encodedAlphabet += "a";	
			System.out.println(encodedAlphabet);
			}
		}
		return choiceNumber;
	}
	
	
	
}

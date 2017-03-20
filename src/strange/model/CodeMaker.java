package strange.model;

public class CodeMaker 
{

	private String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private String encodedAlphabet = "";
	private String generateRandom = "";
	private int choiceNumber;
	private int tracker = 0;
	
	public String encodeMessage()
	{
		for(int tracker = 0; tracker < 25; tracker++)
		{
			randomMath();
			generateCode();
			
		}
		
		return encodedAlphabet;
	}
	
	private int randomMath()
	{
		choiceNumber = (int)(Math.random() * 26);
		return choiceNumber;
	}
	
	private String generateCode()
	{
		if(choiceNumber == 0)
		{
			if(encodedAlphabet.contains("a") == false)
			{
				encodedAlphabet += "a";	
				System.out.println(encodedAlphabet);
			}
			else
			{
				tracker--;	
			}
		}
		if(choiceNumber == 1)
		{
			if(encodedAlphabet.contains("b") == false)
			{
				encodedAlphabet += "b";	
				System.out.println(encodedAlphabet);
			}
			else
			{
				tracker--;	
			}
		}
		if(choiceNumber == 2)
		{
			if(encodedAlphabet.contains("c") == false)
			{
				encodedAlphabet += "c";	
				System.out.println(encodedAlphabet);
			}
			else
			{
				tracker--;	
			}
		}
		if(choiceNumber == 3)
		{
			if(encodedAlphabet.contains("d") == false)
			{
				encodedAlphabet += "d";	
				System.out.println(encodedAlphabet);
			}
			else
			{
				tracker--;	
			}
		}
		
		return generateRandom;
	}
	
	
	
}

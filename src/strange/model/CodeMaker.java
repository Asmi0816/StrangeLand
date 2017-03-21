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
		for(tracker=0; tracker < 26; tracker++)
		{
			randomMath();
			generateCode();
			
		}
		System.out.println(alphabet);
		System.out.println(encodedAlphabet);
		return encodedAlphabet;
		
	}
	
	private int randomMath()
	{
		choiceNumber = (int)(Math.random() * 26);
		return choiceNumber;
	}
	
	private void generateCode()
	{
		if(encodedAlphabet.contains(alphabet.substring(choiceNumber, choiceNumber+1)) == false)
		{
			encodedAlphabet += alphabet.substring(choiceNumber, choiceNumber+1);	
		}
		else
		{
			tracker--;	
		}
	}
	
	private String secretMessage()
	{
		String [] words = {"Tyler", "is", "a", "rock", "Jacob", "plays", "MooMoo.io", "Issac", "makes", "music", "word"};
		return generateRandom;
	}
	
	
	
}

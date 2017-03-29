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
			secretMessage();
			
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
		String [] words = {"Tyler", "is", "a", "rock", "Jacob", "plays", "MooMooio", "Issac", "makes", "music", "word", "abandon", 
								"ability", "about", "scientific", "disagrees", "paint", "electrify", "loom", "every", "compose", "always",
									"investigate", "sense", "wild", "picture", "masterpeice", "from"};
		for(int index  = 0; index < 4; index++)
		{
			int random = (int)(Math.random()*28);
			generateRandom += words[random] + " ";
			System.out.println(generateRandom);
			
		}
		for(int search = 0; search < generateRandom.length(); search++)
		{
			char replaceChar = generateRandom.charAt(search);
			int reg = alphabet.indexOf(replaceChar);
			char finalChar = encodedAlphabet.charAt(reg);
			generateRandom.replace(replaceChar, finalChar);
			System.out.println(generateRandom);
			
		}
		
		return generateRandom;
	}
	
	
	
}

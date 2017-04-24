package strange.model;

public class CodeMaker 
{

	private String alphabet = "abcdefghijklmnopqrstuvwxyz";
	private String encodedAlphabet = "";
	private String generateRandom = "";
	String codeString = "";
	private int choiceNumber;
	private int tracker = 0;
	
	public String encodeMessage()
	{
		for(tracker=0; tracker < 26; tracker++)
		{
			randomMath();
			generateCode();
		}
		
		secretMessage();
		System.out.println(alphabet);
		System.out.println(encodedAlphabet);
		System.out.println(generateRandom);
		System.out.println(codeString);
		return encodedAlphabet;
		
	}
	
	private int randomMath()
	{
		choiceNumber = (int)(Math.random() * 26);
		return choiceNumber;
	}
	
	private void generateCode()
	{
		if(!encodedAlphabet.contains(alphabet.substring(choiceNumber, choiceNumber+1)))
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
		String [] words = {"tyler", "is", "a", "rock", "jacob", "plays", "moomooio", "issac", "makes", "music", "word", "abandon", 
								"ability", "about", "scientific", "disagrees", "paint", "electrify", "loom", "every", "compose", "always",
									"investigate", "sense", "wild", "picture", "masterpeice", "from"};
		
		
		for(int index  = 0; index < 4; index++)
		{
			if(index != 3)
			{
			int random = (int)(Math.random()*28);
			generateRandom += words[random] + " ";
			}
			else
			{
				int random = (int)(Math.random()*28);
				generateRandom += words[random];
			}
			
			
		}
		for(int search = 0; search < generateRandom.length(); search++)
		{
			if(!(generateRandom.charAt(search) == (' ')))
			{
			char replaceChar = generateRandom.charAt(search);
			int reg = alphabet.indexOf(replaceChar);
			char finalChar = encodedAlphabet.charAt(reg);
			codeString += generateRandom.substring(search, search +1).replace(replaceChar, finalChar);
			
			}
			else
			{
			codeString += "_";
			}
			
		}
		
		return codeString;
	}
	
	
	
}

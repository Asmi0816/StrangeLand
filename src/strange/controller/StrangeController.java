package strange.controller;
import strange.view.StrangeFrame;
import strange.model.CodeMaker;

public class StrangeController
{
	private StrangeFrame baseFrame;
	private CodeMaker logicController;
	
	public StrangeController()
	{
		logicController = new CodeMaker();
		baseFrame = new StrangeFrame(this);
		
	}
	public void start()
	{
		logicController.encodeMessage();
	}
	
	public String gameMessage()
	{
		return logicController.encodeMessage();
	}
	public String neededResponce()
	{
		return logicController.neededResponce();
	}
	
	public void waitFor2()
	{
		try
		{
		    Thread.sleep(1500);
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
	}
}

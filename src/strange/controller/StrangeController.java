package strange.controller;
import strange.view.StrangeFrame;
import strange.model.CodeMaker;

public class StrangeController
{
	private StrangeFrame baseFrame;
	private CodeMaker logicController;
	public void start()
	{
		baseFrame = new StrangeFrame(this);
		logicController.encodeMessage();
		
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

package strange.controller;
import strange.view.StrangeFrame;

public class StrangeController
{
	private StrangeFrame baseFrame;
	public void start()
	{
		baseFrame = new StrangeFrame(this);
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

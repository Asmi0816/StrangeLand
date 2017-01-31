package strange.controller;
import strange.view.StrangeFrame;

public class StrangeController
{
	private StrangeFrame baseFrame;
	public void start()
	{
		baseFrame = new StrangeFrame(this);
	}
}

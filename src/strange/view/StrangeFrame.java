package strange.view;
import javax.swing.*;
import java.awt.Dimension;
import strange.controller.StrangeController;
import strange.view.StrangePanel;

public class StrangeFrame extends JFrame
{
	private StrangeController baseController;
	private StrangePanel basePanel;
	public StrangeFrame(StrangeController baseController)
	{
		super();
		this.baseController = baseController;
		basePanel = new StrangePanel(baseController);
		
		setupFrame();
	}
	
	public void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setResizable(false);
		this.setSize(new Dimension(1080,720));
		this.setTitle("Strange Land");
		this.setVisible(true);
	}
}

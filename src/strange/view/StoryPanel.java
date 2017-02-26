package strange.view;
import javax.swing.*;
import strange.controller.StrangeController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

public class StoryPanel extends JPanel
{
	private SpringLayout baseLayout;
	private JLabel newsLabel;
	private JLabel firstLabel;
	private JLabel firstChoice1;
	private JLabel firstChoice2;
	

	private StrangeController baseController;
	
	public StoryPanel(StrangeController baseController)
	{
		super();
		this.baseLayout = new SpringLayout();
		this.firstLabel = new JLabel("... fun!' They said, 'nothing could ever go wrong!' they said.");
		this.baseController = baseController;
		this.newsLabel = new JLabel("<html>This is a mix of the two games Reigns and LifeLine both amazing. <br>You will have text show up on the screen and you press buttons to affect the story.<br> Press either button to start the game.<html>");
		
		setupPanel();
		setupLayout();
		
	}
	
	

	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(newsLabel);
		this.add(firstLabel);
	}
	
	public void setupLayout()
	{
		firstLabel.setVisible(false);
		baseLayout.putConstraint(SpringLayout.NORTH, firstLabel, 60, SpringLayout.NORTH, newsLabel);
	}
	public JLabel getNewsLabel() 
	{
		return newsLabel;
	}

	public void setNewsLabel(JLabel newsLabel) 
	{
		this.newsLabel = newsLabel;
	}
	
	public JLabel getFirstLabel() {
		return firstLabel;
	}



	public void setFirstLabel(JLabel firstLabel) {
		this.firstLabel = firstLabel;
	}
	
}

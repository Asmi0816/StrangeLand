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
	private JLabel startUp;
	private JLabel startUp1;
	private JLabel startUp2;
	private JLabel firstLabel;
	private JLabel firstChoice1;
	private JLabel firstChoice2;
	private StrangeController baseController;
	
	public StoryPanel(StrangeController baseController)
	{
		super();
		setBackground(new Color(0, 0, 0));
		this.baseLayout = new SpringLayout();
		
		this.baseController = baseController;
		this.newsLabel = new JLabel("<html>This is a mix of the two games Reigns and LifeLine both amazing. <br>You will have text show up on the screen and you press buttons to affect the story.<br> Press either button to start the game.<html>");
		
		this.startUp = new JLabel("Booting up...");
	
		this.startUp1 = new JLabel("Logging in...");
		
		this.startUp2 = new JLabel("receving signal...");
		
		this.firstLabel = new JLabel("... fun!' They said, 'nothing could ever go wrong!' they said.");
		
		this.firstChoice1 = new JLabel("Who is this?");
		
		this.firstChoice2 = new JLabel("I'm Michael Larson. Are you the person I'm supposed to contact in a time of emergency?");
		
		
		setupPanel();
		setupLayout();
		
	}


	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(400, 1200));
		this.add(newsLabel);
		this.add(startUp);
		this.add(startUp1);
		this.add(startUp2);
		this.add(firstLabel);
		this.add(firstChoice1);
		this.add(firstChoice2);
	}
	
	public void setupLayout()
	{
		firstLabel.setVisible(false);
		firstChoice1.setVisible(false);
		firstChoice2.setVisible(false);
		startUp.setVisible(false);
		startUp1.setVisible(false);
		startUp2.setVisible(false);
		baseLayout.putConstraint(SpringLayout.NORTH, firstLabel, 600, SpringLayout.NORTH, newsLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstChoice1, 40, SpringLayout.NORTH, firstLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstChoice2, 40, SpringLayout.NORTH, firstLabel);
		newsLabel.setForeground(new Color(124, 252, 0));
		startUp.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, startUp, 525, SpringLayout.NORTH, newsLabel);
		startUp1.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, startUp1, 550, SpringLayout.NORTH, newsLabel);
		startUp2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, startUp2, 575, SpringLayout.NORTH, newsLabel);
		firstLabel.setForeground(new Color(124, 252, 0));
		firstChoice1.setForeground(new Color(124, 252, 0));
		firstChoice2.setForeground(new Color(124, 252, 0));
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
	
	public JLabel getFirstChoice1() {
		return firstChoice1;
	}



	public void setFirstChoice1(JLabel firstChoice1) {
		this.firstChoice1 = firstChoice1;
	}



	public JLabel getFirstChoice2() {
		return firstChoice2;
	}



	public void setFirstChoice2(JLabel firstChoice2) {
		this.firstChoice2 = firstChoice2;
	}
	
	public JLabel getStartUp() {
		return startUp;
	}


	public void setStartUp(JLabel startUp) {
		this.startUp = startUp;
	}


	public JLabel getStartUp1() {
		return startUp1;
	}


	public void setStartUp1(JLabel startUp1) {
		this.startUp1 = startUp1;
	}


	public JLabel getStartUp2() {
		return startUp2;
	}


	public void setStartUp2(JLabel startUp2) {
		this.startUp2 = startUp2;
	}


}

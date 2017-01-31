package strange.view;
import javax.swing.*;
import strange.controller.StrangeController;
import java.awt.Event.*;
import java.awt.Color;
import java.awt.Dimension;

public class StrangePanel extends JPanel
{
	private StrangeController baseController;
	private JButton rightButton;
	private JButton leftButton;
	private SpringLayout baseLayout;
	private JTextField storyBox;
	private ImageIcon backGround;
	
	public StrangePanel(StrangeController baseController)
	{
		this.baseController = baseController;
		this.rightButton = new JButton("This is a spot you can press to affect the game.");
		this.leftButton = new JButton("This is a spot you can press to affect the game.");
		this.baseLayout = new SpringLayout();
		this.storyBox = new JTextField(5);
		this.backGround = new ImageIcon();
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.DARK_GRAY);
		
		
		this.add(leftButton);
		this.add(rightButton);
		this.add(storyBox);
		
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		
	}
}

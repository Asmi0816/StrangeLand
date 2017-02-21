package strange.view;
import javax.swing.*;
import strange.controller.StrangeController;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;


public class StrangePanel extends JPanel
{
	private StrangeController baseController;
	private SpringLayout baseLayout;
	private int health;
	private int food;
	private int water;
	private int level;
	private JScrollPane labelPane;
	private JButton rightButton;
	private JButton leftButton;
	private JLabel strangeLabel;
	private JLabel mapLabel;
	private JLabel storyBox;
	private JLabel foodLabel;
	private JLabel healthLabel;
	private JLabel waterLabel;
	private JLabel foodStatus;
	private JLabel healthStatus;
	private JLabel waterStatus;
	private ImageIcon strangeGround;
	private ImageIcon userMap;
	private ImageIcon newsPaper;
	
	
	public StrangePanel(StrangeController baseController)
	{
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.rightButton = new JButton("This is a spot you can press to affect the game.");
		this.leftButton = new JButton("This is a spot you can press to affect the game.");
		this.storyBox = new JLabel("<html>This is a mix of the two games Reigns and LifeLine both amazing. <br>You will have text show up on the screen and you press buttons to affect the story.<br> Press either button to start the game.<html>");
		baseLayout.putConstraint(SpringLayout.SOUTH, storyBox, -275, SpringLayout.SOUTH, this);
		this.strangeLabel = new JLabel();
		//this.mapLabel = new JLabel();
		this.healthLabel = new JLabel("HEALTH: ");
		this.foodLabel = new JLabel("FOOD: ");
		this.waterLabel = new JLabel("WATER: ");
		this.strangeGround = new ImageIcon(getClass().getResource("/strange/view/images/mountainBackdrop.jpg"));
		this.newsPaper = new ImageIcon(getClass().getResource("/strange/view/images/SSWaveForm1.png"));
		//this.userMap = new ImageIcon(getClass().getResource("/strange/view/images/Map.jpg"));
		health = 50;
		water = 100;
		food = 100;
		level = 0;
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.add(leftButton);
		
		this.add(rightButton);
		this.add(storyBox);
		this.add(healthLabel);
		this.add(foodLabel);
		this.add(waterLabel);
		//this.mapLabel = new JLabel();
		//this.add(mapLabel);
		//mapLabel.setIcon(userMap);
		this.add(strangeLabel);
		strangeLabel.setIcon(strangeGround);
		
	}
	
	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, rightButton, 0, SpringLayout.NORTH, leftButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, rightButton, 0, SpringLayout.SOUTH, leftButton);
		storyBox.setFont(new Font("AR DARLING", Font.PLAIN, 16));
		baseLayout.putConstraint(SpringLayout.SOUTH, storyBox, -275, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, rightButton, 707, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, leftButton, 500, SpringLayout.NORTH, this);
		waterLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		baseLayout.putConstraint(SpringLayout.NORTH, storyBox, 30, SpringLayout.NORTH, this);
		healthLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		foodLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
	
		baseLayout.putConstraint(SpringLayout.NORTH, foodLabel, 200, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, foodLabel, 75, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, waterLabel, 80, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, healthLabel, 140, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, healthLabel, 75, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, waterLabel, 75, SpringLayout.WEST, this);
		strangeLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		baseLayout.putConstraint(SpringLayout.EAST, rightButton, -50, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, leftButton, -707, SpringLayout.EAST, this);
		leftButton.setFont(new Font("AR CENA", Font.PLAIN, 17));
		rightButton.setFont(new Font("AR CENA", Font.PLAIN, 17));
		baseLayout.putConstraint(SpringLayout.NORTH, strangeLabel, 12, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, strangeLabel, 12, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, leftButton, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, strangeLabel, -12, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, strangeLabel, -12, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, storyBox, 200, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, storyBox, -200, SpringLayout.EAST, this);
		storyBox.setHorizontalAlignment(SwingConstants.CENTER);
	}
	
	public void setupListeners()
	{
		rightButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				if(level == 0)
				{
				storyBox.setIcon(newsPaper);
				rightButton.setText("Continue");
				leftButton.setText("Continue");
				level++;
				}
			}

		});
		
		leftButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				
				rightButton.setText("Continue");
				leftButton.setText("Continue");
			}

		});
	}
}
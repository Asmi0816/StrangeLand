package strange.view;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

import strange.controller.StrangeController;


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
	private StoryPanel storyPanel;
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
		this.strangeLabel = new JLabel();
		this.labelPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		this.storyPanel = new StoryPanel(baseController);
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
		this.add(labelPane);
		this.add(rightButton);
		labelPane.setViewportView(storyPanel);
		labelPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
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
		baseLayout.putConstraint(SpringLayout.WEST, rightButton, 707, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, leftButton, 500, SpringLayout.NORTH, this);
		waterLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		healthLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		foodLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		baseLayout.putConstraint(SpringLayout.NORTH, labelPane, 100, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, labelPane, -300, SpringLayout.SOUTH, this);
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
		baseLayout.putConstraint(SpringLayout.NORTH, labelPane, 50, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, labelPane, 350, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, labelPane, -25, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, labelPane, -300, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, strangeLabel, 12, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, strangeLabel, 12, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, leftButton, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, strangeLabel, -12, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, strangeLabel, -12, SpringLayout.EAST, this);
		
	}
	
	public void setupListeners()
	{
		rightButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				if(level == 0)
				{
				storyPanel.getNewsLabel().setIcon(newsPaper);
				storyPanel.getNewsLabel().setText("");
				rightButton.setText("Continue");
				leftButton.setText("Continue");
				level++;
				}
				
				else if(level == 1)
				{
					storyPanel.getFirstLabel().setVisible(true);
					rightButton.setText("Who is this?");
					leftButton.setText("Well was it fun?");
					level++;
				}
				else if(level == 2)
				{
					storyPanel.getFirstChoice2().setVisible(true);
					rightButton.setText("");
					leftButton.setText("");
					level++;
				}
			}

		});
		
		leftButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				
				if(level == 0)
				{
				storyPanel.getNewsLabel().setIcon(newsPaper);
				storyPanel.getNewsLabel().setText("");
				rightButton.setText("Continue");
				leftButton.setText("Continue");
				level++;
				}
				
				else if(level == 1)
				{
					storyPanel.getFirstLabel().setVisible(true);
					rightButton.setText("Who is this?");
					leftButton.setText("Well was it fun?");
					level++;
				}
				
				else if(level == 2)
				{
					storyPanel.getFirstChoice1().setVisible(true);
					rightButton.setText("");
					leftButton.setText("");
					
					level++;
				}
			}

		});
	}
}
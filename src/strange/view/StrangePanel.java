package strange.view;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import javax.swing.SpringLayout;
import javax.swing.Timer;

import strange.controller.StrangeController;


public class StrangePanel extends JPanel
{
	private StrangeController baseController;
	private SpringLayout baseLayout;
	private Timer waitTimer;
	private int health;
	private int food;
	private int water;
	private String level;
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
		this.storyPanel = new StoryPanel(baseController);
		this.baseLayout = new SpringLayout();
		this.rightButton = new JButton("Right button");
		this.leftButton = new JButton("Left button");
		this.strangeLabel = new JLabel();
		this.labelPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
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
		level = "";
		setupPanel();
		setupLayout();
		setupTimer();
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
	
	public void setupTimer()
	{
		try
    	{
    		
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:/Users/Arick Smith/Music/MySong.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        }
    	catch(Exception ex) {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();
        }
		
		Timer songRepeat = new Timer(1000 * 125, new ActionListener() 
		{
		    public void actionPerformed(ActionEvent e) 
		    {
		    	
		    	try
		    	{
		    		
		            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:/Users/Arick Smith/Music/MySong.wav").getAbsoluteFile());
		            Clip clip = AudioSystem.getClip();
		            clip.open(audioInputStream);
		            clip.start();
		        }
		    	catch(Exception ex) {
		            System.out.println("Error with playing sound.");
		            ex.printStackTrace();
		        }
		    }
		});
		
		songRepeat.start();
	}
	
	public void setupListeners()
	{
		rightButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				if(level.equals(""))
				{
				storyPanel.getNewsLabel().setIcon(newsPaper);
				storyPanel.getNewsLabel().setText("");
				rightButton.setText("Continue");
				leftButton.setText("Continue");
				level = level + "1";
				}
				
				else if(level.equals("1"))
				{
					Thread thread = new Thread(new Runnable() {
						@Override
						public void run() {
							storyPanel.getStartUp().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStartUp1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStartUp2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getFirstLabel().setVisible(true);
							rightButton.setText("Who is this?");
							leftButton.setText("Well was it fun?");
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("11"))
				{
					storyPanel.getFirstChoice2().setVisible(true);
					rightButton.setText("Yes what happened to you?");
					leftButton.setText("No way! I think a problem would acctually happen!");
					level = level + "1";
				}
				
				else if(level.equals("111"))
				{
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_2().setVisible(true);
							rightButton.setText("Tell me what's around you");
							leftButton.setText("Whether I do or not doesn't matter anymore");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("1111"))
				{
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_4().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_5().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_6().setVisible(true);
							rightButton.setText("Slow down what ocean?");
							leftButton.setText("Calm down we need to get busy if we are to save you.");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("11111"))
				{
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_7().setVisible(true);
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							storyPanel.getStory1_8().setVisible(true);
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							storyPanel.getStory1_9().setVisible(true);
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							storyPanel.getStory1_10().setVisible(true);
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							storyPanel.getStory1_11().setVisible(true);
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							storyPanel.getStory1_12().setVisible(true);
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							storyPanel.getStory1_13().setVisible(true);
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							storyPanel.getStory1_14().setVisible(true);
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							storyPanel.getStory1_15().setVisible(true);
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							storyPanel.getStory1_16().setVisible(true);
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							baseController.waitFor2();
							storyPanel.getStory1_17().setVisible(true);
							
							rightButton.setText("Are you hurt?");
							leftButton.setText("Are you alive?");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("111111"))
				{
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_18().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_19().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_20().setVisible(true);
							baseController.waitFor2();
							rightButton.setText("Do you have any gear to patch the wound?");
							leftButton.setText("How late is it now?");
							
						}
					});
					thread.start();
					level = level + "1";
				}
			}

		});
		
		leftButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				
				if(level.equals(""))
				{
				storyPanel.getNewsLabel().setIcon(newsPaper);
				storyPanel.getNewsLabel().setText("");
				rightButton.setText("Continue");
				leftButton.setText("Continue");
				level = level + "1";
				}
				
				else if(level.equals("1"))
				{
					Thread thread = new Thread(new Runnable() {
						@Override
						public void run() {
							storyPanel.getStartUp().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStartUp1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStartUp2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getFirstLabel().setVisible(true);
							rightButton.setText("Who is this?");
							leftButton.setText("Well was it fun?");
						}
					});
					thread.start();
					level = level + "1";
				}
				
				else if(level.equalsIgnoreCase("11"))
				{
					storyPanel.getFirstChoice1().setVisible(true);
					rightButton.setText("Anthony Hawkins");
					leftButton.setText("No one of interest.");
					
					level = level + "0";
				}
				else if (level.equals("110"))
				{
					Thread thread = new Thread(new Runnable() {
						@Override
						public void run() {
							storyPanel.getOpeningStory().setVisible(true);
							baseController.waitFor2();
							storyPanel.getOpeningStory2().setVisible(true);
							baseController.waitFor2();
							repaint();
							rightButton.setText("Awww, c'mon we're making a connection.");
							leftButton.setText(" Alright cool it, I'm the only one here.");
						}
					});
					thread.start();
					level = level + "0";
				}
				else if (level.equals(1100))
				{
					Thread thread = new Thread(new Runnable() {
						@Override
						public void run() {
							storyPanel.getOpeningStory3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getOpeningStory4().setVisible(true);
							baseController.waitFor2();
							repaint();
							rightButton.setText("What happened to you?");
							leftButton.setText("Yes, I have a rough idea of how to get you out.");
						}
					});
					thread.start();
					level = level + "0";
				}
			}

		});
		
		
	}
}
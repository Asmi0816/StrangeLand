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
		
		Timer songRepeat = new Timer(1000 * 127, new ActionListener() 
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
					leftButton.setText("No way! It's not my job!");
					level = level + "1";
				}
				else if(level.equalsIgnoreCase("110"))
				{
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_122().setVisible(true);
							rightButton.setText("Nice to meet you too.");
							leftButton.setText("How's it going");
					
					
						}
					});
					thread.start();
					level = "111";
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
							leftButton.setText("Calm down, if we are to save you.");
							
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
							leftButton.setText("Just Ignore it.");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				
				else if(level.equals("1111111"))
				{
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_21().setVisible(true);
							rightButton.setText("Rip your shirt off to bandage that cut.");
							leftButton.setText("Just ignore it.");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				
				
				else if(level.equals("11111111"))
				{
					health = health + 20;
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_22().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_23().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_24().setVisible(true);
							baseController.waitFor2();
							rightButton.setText("Grab some wood and build a fire!");
							leftButton.setText("Grab stones that were exposed to the sun!");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				
				else if(level.equals("111111111"))
				{
					health = health + 20;
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory7_1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory7_2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory7_3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory7_4().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory7_5().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory7_6().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory7_7().setVisible(true);
							rightButton.setText("Didn't listen ending");
							leftButton.setText("Didn't listen ending");
							
						}
					});
					thread.start();
					level = "ddjdj";
				}
				else if(level.equals("1111111110"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_28().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_29().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_30().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_31().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_32().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_33().setVisible(true);
							baseController.waitFor2();
							rightButton.setText("Ditch the rocks.");
							leftButton.setText("Could get cold you should keep carrying a few.");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("11111111101"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							
							storyPanel.getStory8_1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_4().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_5().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_6().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_7().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_8().setVisible(true);
							baseController.waitFor2();
							rightButton.setText("Senseless abandonment ending");
							leftButton.setText("Senseless abandonment ending");
							
						}
					});
					thread.start();
					level = "fmef";
				}
				else if(level.equals("111111111010"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							
							storyPanel.getStory8_1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_4().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_5().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_6().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_7().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_8().setVisible(true);
							baseController.waitFor2();
							rightButton.setText("Senseless abandonment ending");
							leftButton.setText("Senseless abandonment ending");
							
						}
					});
					thread.start();
					level = "fmef";
				}
				else if(level.equals("1111111110100"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							
							storyPanel.getStory8_1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_4().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_5().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_6().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_7().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory8_8().setVisible(true);
							baseController.waitFor2();
							rightButton.setText("Senseless abandonment ending");
							leftButton.setText("Senseless abandonment ending");
							
						}
					});
					thread.start();
					level = "fmef";
				}
				
				else if(level.equals("11111111101000"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_63().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_64().setVisible(true);
							baseController.waitFor2();
							rightButton.setText("Okay, sounds good.");
							leftButton.setText("No, I don't trust it go around.");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				
				else if(level.equals("1111111110100010") )
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory9_1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory9_2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory9_3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory9_4().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory9_5().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory9_6().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory9_7().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory9_8().setVisible(true);
							
							rightButton.setText("Wanderer ending");
							leftButton.setText("Wanderer ending");
							
						}
					});
					thread.start();
					level = "1ef";
				}
				else if(level.equals("111111111010001"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_65().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_66().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_67().setVisible(true);
							rightButton.setText("No, I don't trust it go around.");
							leftButton.setText("What's inside of it?");
							
						}
					});
					thread.start();
					level = level + "0";
				}
				else if(level.equals("11111111101000101"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_71().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_72().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_73().setVisible(true);
							rightButton.setText("Probably nothing to worry about.");
							leftButton.setText("Look for a weapon.");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("111111111010001011"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_74().setVisible(true);
							rightButton.setText("Don't eat the fruit.");
							leftButton.setText("Eat the fruit.");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("11111111101000101110"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_78().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_79().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_80().setVisible(true);
							rightButton.setText("Just leave the cave.");
							leftButton.setText("Can you break anything?");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("111111111010001011101"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							
							storyPanel.getStory1_81().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_82().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_83().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_84().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_85().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_86().setVisible(true);
							rightButton.setText("How close is it to night?");
							leftButton.setText("Do you see a way out?");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("11111111101000101110110"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_89().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_90().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_91().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_92().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_93().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_94().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_95().setVisible(true);
							rightButton.setText("That means survivors, Build a fire!");
							leftButton.setText("Move towards the hole, you could be in danger.");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("111111111010001011101101"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_96().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_97().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_98().setVisible(true);
							
							rightButton.setText("Rub two sticks together");
							leftButton.setText("Make a bow drill.");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("111111111010001011101101100"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							
							storyPanel.getStory1_104().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_105().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_106().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_107().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_108().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_109().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_110().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_111().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_112().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_113().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_114().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_115().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_116().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_117().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_118().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_119().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_120().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_121().setVisible(true);
							
							rightButton.setText("The end");
							leftButton.setText("The end");
							
						}
					});
					thread.start();
					
				}
				else if(level.equals("111110"))
				{
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory3_6().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory3_7().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory3_8().setVisible(true);
							
							
							rightButton.setText("Eat them.");
							leftButton.setText("Don't eat them.");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("1111101"))
				{
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory4_1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory4_2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory4_3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory4_4().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory4_5().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory4_6().setVisible(true);
							baseController.waitFor2();
							
							rightButton.setText("Poison Ending");
							leftButton.setText("Poison Ending");
							
						}
					});
					thread.start();
					
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
				else if (level.equals("110") || leftButton.getText().equals("No way! It's not my job!"))
				{
					Thread thread = new Thread(new Runnable() {
						@Override
						public void run() {
							storyPanel.getOpeningStory().setVisible(true);
							baseController.waitFor2();
							
							storyPanel.getOpeningStory3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getOpeningStory4().setVisible(true);
							baseController.waitFor2();
							rightButton.setText("Lamest ending");
							leftButton.setText("Lamest ending");
						}
					});
					thread.start();
					level = "end";
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
				else if(level.equals("111111111"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_25().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_26().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_27().setVisible(true);
							baseController.waitFor2();
							rightButton.setText("I agree. Start moving towards the mountains tonight.");
							leftButton.setText("I think you should get some sleep.");
							
						}
					});
					thread.start();
					level = level + "0";
				}
				else if(level.equals("1111111110"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory7_1().setVisible(true);
							baseController.waitFor2();
							
							storyPanel.getStory7_4().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory7_5().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory7_6().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory7_7().setVisible(true);
							rightButton.setText("Didn't listen ending");
							leftButton.setText("Didn't listen ending");
							
						}
					});
					thread.start();
					level = "ddjdj";
				}
				else if(level.equals("11111111101"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_34().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_35().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_36().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_37().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_38().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_39().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_40().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_41().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_42().setVisible(true);
							baseController.waitFor2();
							rightButton.setText("Fine ditch the rock and run to the mountain");
							leftButton.setText("Sit down and take a break");
							
						}
					});
					thread.start();
					level = level + "0";
				}
				else if(level.equals("111111111010"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_43().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_44().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_45().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_46().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_47().setVisible(true);
							rightButton.setText("Forget the rock and run to the mountain.");
							leftButton.setText("Keep the rock move to the mountain.");
							
						}
					});
					thread.start();
					level = level + "0";
				}
				else if(level.equals("1111111110100"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_48().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_49().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_50().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_51().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_52().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_53().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_54().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_55().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_56().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_57().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_58().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_59().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_60().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_61().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_62().setVisible(true);
							rightButton.setText("Yha I'm here.");
							leftButton.setText("Thank goodness you're alive!");
							
						}
					});
					thread.start();
					level = level + "0";
				}
				else if(level.equals("11111111101000"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_63().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_64().setVisible(true);
							baseController.waitFor2();
							rightButton.setText("Okay, sounds good.");
							leftButton.setText("No, I don't trust it go around.");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("1111111110100010"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_68().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_69().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_70().setVisible(true);
							rightButton.setText("You should look for food.");
							leftButton.setText("Just pass through.");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("1111111110100010111"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_75().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_76().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_77().setVisible(true);
							rightButton.setText("Keep looking around.");
							leftButton.setText("Just leave the cave.");
							
						}
					});
					thread.start();
					level = level + "0";
				}
				else if(level.equals("1111111110100010111011"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_87().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_88().setVisible(true);
							rightButton.setText("Go to one of the closest wrecks.");
							leftButton.setText("Move towards the hole.");
							
						}
					});
					thread.start();
					level = level + "0";
				}
				else if(level.equals("1111111110100010111011011"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory1_99().setVisible(true);
							
							
							rightButton.setText("Blow on it hard.");
							leftButton.setText("Put it in a little bit of leaves and blow");
							
						}
					});
					thread.start();
					level = level + "0";
				}
				
				else if(level.equals("11111111101000101110110110"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							
							storyPanel.getStory1_100().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_101().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_102().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory1_103().setVisible(true);
							
							rightButton.setText("Make it a bon fire.");
							leftButton.setText("Keep it small.");
							
						}
					});
					thread.start();
					level = level + "0";
				}
				
				else if(leftButton.getText().contains("Whether I do or not doesn't matter anymore"))
				{
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory2_1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory2_2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory2_3().setVisible(true);
							rightButton.setText("Slow down what ocean?");
							leftButton.setText("Calm down, If we are to save you.");
							
						}
					});
					thread.start();
					level = "11111";
				}
				
				else if(level.equals("11111"))
				{
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory3_1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory3_2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory3_3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory3_4().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory3_5().setVisible(true);
							
							rightButton.setText("You should hunt for some food.");
							leftButton.setText("Is there anything else around you?");
							
						}
					});
					thread.start();
					level = level + "0";
				}
				else if(level.equals("1111101"))
				{
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory3_9().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory3_10().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory3_11().setVisible(true);
							
							
							rightButton.setText("Do you have any gear to patch the wound?");
							leftButton.setText("You should look for equipment.");
							
						}
					});
					thread.start();
					level = "1111111";
				}
				
				else if(level.equals("1111111"))
				{
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory6_1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory6_2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory6_3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory6_4().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory6_5().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory6_6().setVisible(true);
							
							
							rightButton.setText("No gear ending");
							leftButton.setText("No gear ending");
							
						}
					});
					thread.start();
					level = "ss";
				}
				
				else if(level.equals("111110"))
				{
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory5_1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory5_2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory5_3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory5_4().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory5_5().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory5_6().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory5_7().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory5_8().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory5_9().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory5_10().setVisible(true);
							rightButton.setText("Rip your shirt off to bandage that cut.");
							leftButton.setText("Just ignore it.");
							
						}
					});
					thread.start();
					level = "11111111";
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
				else if(leftButton.getText().equals("Just ignore it."))
				{
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory6_1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory6_2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory6_3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory6_4().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory6_5().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory6_6().setVisible(true);
							
							rightButton.setText("The lazy ending");
							leftButton.setText("The lazy ending");
							
						}
					});
					thread.start();
					level = level + "1";
				}
				else if(level.equals("1111111110100010") )
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory9_1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory9_2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory9_3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory9_4().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory9_5().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory9_6().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory9_7().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory9_8().setVisible(true);
							
							rightButton.setText("Wanderer ending");
							leftButton.setText("Wanderer ending");
							
						}
					});
					thread.start();
					level = "1ef";
				}
				else if(level.equals("11111111101000101"))
				{
					
					Thread thread = new Thread(new Runnable() 
					{
						@Override
						public void run() 
						{
							storyPanel.getStory10_1().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory10_2().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory10_3().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory10_4().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory10_5().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory10_6().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory10_7().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory10_8().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory10_9().setVisible(true);
							baseController.waitFor2();
							storyPanel.getStory10_10().setVisible(true);
							rightButton.setText("Out of your control ending");
							leftButton.setText("Out of your control ending");
							
						}
					});
					thread.start();
					level = level + "1";
				}
			}
			

		});
		
		
	}
}
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
	private JLabel openingStory;
	private JLabel openingStory2;
	private JLabel openingStory3;
	private JLabel openingStory4;
	private JLabel story1_1;
	private JLabel story1_2;
	private JLabel story1_3;
	private JLabel story1_4;
	private JLabel story1_5;
	private JLabel story1_6;
	private JLabel story1_7;
	private JLabel story1_8;
	private JLabel story1_9;
	private JLabel story1_10;
	private JLabel story1_11;
	private JLabel story1_12;
	private JLabel story1_13;
	private JLabel story1_14;
	private JLabel story1_15;
	private JLabel story1_16;
	private JLabel story1_17;
	private JLabel story1_18;
	private JLabel story1_19;
	private JLabel story1_20;
	private JLabel story1_21;
	private JLabel story1_22;
	private JLabel story1_23;
	private JLabel story1_24;
	private JLabel story1_25;
	private JLabel story1_26;
	private JLabel story1_27;
	private JLabel story1_28;
	

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
		this.openingStory = new JLabel("Great.");
		this.openingStory2 = new JLabel("Hey, can you get a less sarcastic moron to help me?");
		this.openingStory3 = new JLabel("I'm going to die out here with a useless idiot leading me to my doom.");
		this.openingStory4 = new JLabel("Hey, do you acctually know how to get me out of this mess?");
		this.story1_1 = new JLabel("Fantastic! I have been trying to get someone to answer my hails for hours.");
		this.story1_2 = new JLabel("Do you have any clue how to get me out of this horrible situation?");
		this.story1_3 = new JLabel("All that is around me for about a mile is sand and rocks.");
		this.story1_4 = new JLabel("There are some mountains in the distance.");
		this.story1_5 = new JLabel("Ocean...");
		this.story1_6 = new JLabel("Where's the ocean!");
		this.story1_7 = new JLabel("While I was on the U.S. WaveForm. We were heading towards the alleged 'mysterious electromagnetic readings'.");
		this.story1_8 = new JLabel("But as we got closer and closer to the signal more and more instruments went off-line.");
		this.story1_9 = new JLabel("This was something we prepared for though knowing that the systems would be affected.");
		this.story1_10 = new JLabel("But even our backups began to fail inexplicably.");
		this.story1_11 = new JLabel("The sun began to rise with a beutiful orange hues in the sky.");
		this.story1_12 = new JLabel("Then a old adage came to mind, 'Red sky in the morning, sailors take warning. Red sky at night, sailors delight.'" );
		this.story1_13 = new JLabel("Lo and behold, there was truth in this saying. Because not 3 hours later, dark, menicing clouds blotted out the sun.");
		this.story1_14 = new JLabel("A heavy downpour began and everyone on board rushed to strap things down so they wern't lost in the wind.");
		this.story1_15 = new JLabel("As we were distracted, a massive rouge wave ploughed into the side of the ship.");
		this.story1_16 = new JLabel("I was knocked off my feet and slamed into the gaurd rail, slipping underneath and into the cold water below.");
		this.story1_17 = new JLabel("I must have drifted to shore unconsious, but now that I look back, there should be water around me but there's nothing.");
		
		
		
		
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
		this.add(openingStory);
		this.add(openingStory2);
		this.add(openingStory3);
		this.add(openingStory4);
		this.add(story1_1);
		this.add(story1_2);
		this.add(story1_3);
		this.add(story1_4);
		this.add(story1_5);
		this.add(story1_6);
		this.add(story1_7);
		this.add(story1_8);
		this.add(story1_9);
		this.add(story1_10);
		this.add(story1_11);
		this.add(story1_12);
		this.add(story1_13);
		this.add(story1_14);
		this.add(story1_15);
		this.add(story1_16);
		this.add(story1_17);
		
		
	}
	
	public void setupLayout()
	{
		firstLabel.setVisible(false);
		firstChoice1.setVisible(false);
		firstChoice2.setVisible(false);
		startUp.setVisible(false);
		startUp1.setVisible(false);
		startUp2.setVisible(false);
		openingStory.setVisible(false);
		openingStory2.setVisible(false);
		openingStory3.setVisible(false);
		openingStory4.setVisible(false);
		story1_1.setVisible(false);
		story1_2.setVisible(false);
		story1_3.setVisible(false);
		story1_4.setVisible(false);
		story1_5.setVisible(false);
		story1_6.setVisible(false);
		story1_7.setVisible(false);
		story1_8.setVisible(false);
		story1_9.setVisible(false);
		story1_10.setVisible(false);
		story1_11.setVisible(false);
		story1_12.setVisible(false);
		story1_13.setVisible(false);
		story1_14.setVisible(false);
		story1_15.setVisible(false);
		story1_16.setVisible(false);
		story1_17.setVisible(false);
		baseLayout.putConstraint(SpringLayout.NORTH, firstLabel, 600, SpringLayout.NORTH, newsLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstChoice1, 40, SpringLayout.NORTH, firstLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstChoice2, 40, SpringLayout.NORTH, firstLabel);
		newsLabel.setForeground(new Color(124, 252, 0));
		startUp.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, startUp, 525, SpringLayout.NORTH, newsLabel);
		startUp1.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, openingStory, 20, SpringLayout.NORTH, firstChoice2);
		openingStory.setForeground(new Color(124, 252, 0));
		openingStory2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, startUp1, 550, SpringLayout.NORTH, newsLabel);
		startUp2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, openingStory2, 20, SpringLayout.NORTH, openingStory);
		baseLayout.putConstraint(SpringLayout.NORTH, startUp2, 575, SpringLayout.NORTH, newsLabel);
		firstLabel.setForeground(new Color(124, 252, 0));
		firstChoice1.setForeground(new Color(124, 252, 0));
		firstChoice2.setForeground(new Color(124, 252, 0));
		openingStory3.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, openingStory3, 20, SpringLayout.NORTH, openingStory2);
		openingStory4.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, openingStory4, 20, SpringLayout.NORTH, openingStory3);
		baseLayout.putConstraint(SpringLayout.NORTH, story1_1, 20, SpringLayout.NORTH, firstChoice2);
		story1_1.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_2, 20, SpringLayout.NORTH, story1_1);
		story1_2.setForeground(new Color(124, 252, 0));
		story1_3.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_3, 20, SpringLayout.NORTH, story1_2);
		story1_4.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_4, 20, SpringLayout.NORTH, story1_3);
		story1_5.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_5, 20, SpringLayout.NORTH, story1_4);
		story1_6.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_6, 20, SpringLayout.NORTH, story1_5);
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

	public JLabel getOpeningStory() {
		return openingStory;
	}


	public void setOpeningStory(JLabel openingStory) {
		this.openingStory = openingStory;
	}


	public JLabel getOpeningStory2() {
		return openingStory2;
	}


	public void setOpeningStory2(JLabel openingStory2) {
		this.openingStory2 = openingStory2;
	}


	public JLabel getOpeningStory3() {
		return openingStory3;
	}


	public void setOpeningStory3(JLabel openingStory3) {
		this.openingStory3 = openingStory3;
	}


	public JLabel getOpeningStory4() {
		return openingStory4;
	}


	public void setOpeningStory4(JLabel openingStory4) {
		this.openingStory4 = openingStory4;
	}

	public JLabel getStory1_1() {
		return story1_1;
	}


	public void setStory1_1(JLabel story1_1) {
		this.story1_1 = story1_1;
	}


	public JLabel getStory1_2() {
		return story1_2;
	}


	public void setStory1_2(JLabel story1_2) {
		this.story1_2 = story1_2;
	}


	public JLabel getStory1_3() {
		return story1_3;
	}


	public void setStory1_3(JLabel story1_3) {
		this.story1_3 = story1_3;
	}


	public JLabel getStory1_4() {
		return story1_4;
	}


	public void setStory1_4(JLabel story1_4) {
		this.story1_4 = story1_4;
	}


	public JLabel getStory1_5() {
		return story1_5;
	}


	public void setStory1_5(JLabel story1_5) {
		this.story1_5 = story1_5;
	}


	public JLabel getStory1_6() {
		return story1_6;
	}


	public void setStory1_6(JLabel story1_6) {
		this.story1_6 = story1_6;
	}


	public JLabel getStory1_7() {
		return story1_7;
	}


	public void setStory1_7(JLabel story1_7) {
		this.story1_7 = story1_7;
	}

	public JLabel getStory1_8() {
		return story1_8;
	}


	public void setStory1_8(JLabel story1_8) {
		this.story1_8 = story1_8;
	}


	public JLabel getStory1_9() {
		return story1_9;
	}


	public void setStory1_9(JLabel story1_9) {
		this.story1_9 = story1_9;
	}


	public JLabel getStory1_10() {
		return story1_10;
	}


	public void setStory1_10(JLabel story1_10) {
		this.story1_10 = story1_10;
	}


	public JLabel getStory1_11() {
		return story1_11;
	}


	public void setStory1_11(JLabel story1_11) {
		this.story1_11 = story1_11;
	}


	public JLabel getStory1_12() {
		return story1_12;
	}


	public void setStory1_12(JLabel story1_12) {
		this.story1_12 = story1_12;
	}


	public JLabel getStory1_13() {
		return story1_13;
	}


	public void setStory1_13(JLabel story1_13) {
		this.story1_13 = story1_13;
	}


	public JLabel getStory1_14() {
		return story1_14;
	}


	public void setStory1_14(JLabel story1_14) {
		this.story1_14 = story1_14;
	}


	public JLabel getStory1_15() {
		return story1_15;
	}


	public void setStory1_15(JLabel story1_15) {
		this.story1_15 = story1_15;
	}


	public JLabel getStory1_16() {
		return story1_16;
	}


	public void setStory1_16(JLabel story1_16) {
		this.story1_16 = story1_16;
	}


	public JLabel getStory1_17() {
		return story1_17;
	}


	public void setStory1_17(JLabel story1_17) {
		this.story1_17 = story1_17;
	}


	public JLabel getStory1_18() {
		return story1_18;
	}


	public void setStory1_18(JLabel story1_18) {
		this.story1_18 = story1_18;
	}


	public JLabel getStory1_19() {
		return story1_19;
	}


	public void setStory1_19(JLabel story1_19) {
		this.story1_19 = story1_19;
	}


	public JLabel getStory1_20() {
		return story1_20;
	}


	public void setStory1_20(JLabel story1_20) {
		this.story1_20 = story1_20;
	}


	public JLabel getStory1_21() {
		return story1_21;
	}


	public void setStory1_21(JLabel story1_21) {
		this.story1_21 = story1_21;
	}


	public JLabel getStory1_22() {
		return story1_22;
	}


	public void setStory1_22(JLabel story1_22) {
		this.story1_22 = story1_22;
	}


	public JLabel getStory1_23() {
		return story1_23;
	}


	public void setStory1_23(JLabel story1_23) {
		this.story1_23 = story1_23;
	}


	public JLabel getStory1_24() {
		return story1_24;
	}


	public void setStory1_24(JLabel story1_24) {
		this.story1_24 = story1_24;
	}


	public JLabel getStory1_25() {
		return story1_25;
	}


	public void setStory1_25(JLabel story1_25) {
		this.story1_25 = story1_25;
	}


	public JLabel getStory1_26() {
		return story1_26;
	}


	public void setStory1_26(JLabel story1_26) {
		this.story1_26 = story1_26;
	}


	public JLabel getStory1_27() {
		return story1_27;
	}


	public void setStory1_27(JLabel story1_27) {
		this.story1_27 = story1_27;
	}


	public JLabel getStory1_28() {
		return story1_28;
	}


	public void setStory1_28(JLabel story1_28) {
		this.story1_28 = story1_28;
	}

}

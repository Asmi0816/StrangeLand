package strange.view;
import javax.swing.*;
import strange.controller.StrangeController;
import strange.model.CodeMaker;

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
	private JLabel story1_29;
	private JLabel story1_30;
	private JLabel story1_31;
	private JLabel story1_32;
	private JLabel story1_33;
	private JLabel story1_34;
	private JLabel story1_35;
	private JLabel story1_36;
	private JLabel story1_37;
	private JLabel story1_38;
	private JLabel story1_39;
	private JLabel story1_40;
	private JLabel story1_41;
	private JLabel story1_42;
	private JLabel story1_43;
	private JLabel story1_44;
	private JLabel story1_45;
	private JLabel story1_46;
	private JLabel story1_47;
	private JLabel story1_48;
	private JLabel story1_49;
	private JLabel story1_50;
	private JLabel story1_51;
	private JLabel story1_52;
	private JLabel story1_53;
	private JLabel story1_54;
	private JLabel story1_55;
	private JLabel story1_56;
	private JLabel story1_57;
	private JLabel story1_58;
	private JLabel story1_59;
	private JLabel story1_60;
	private JLabel story1_61;
	private JLabel story1_62;
	private JLabel story1_63;
	private JLabel story1_64;
	private JLabel story1_65;
	private JLabel story1_66;
	private JLabel story1_67;
	private JLabel story1_68;
	private JLabel story1_69;
	private JLabel story1_70;
	private JLabel story1_71;
	private JLabel story1_72;
	private JLabel story1_73;
	private JLabel story1_74;
	private JLabel story1_75;
	private JLabel story1_76;
	private JLabel story1_77;
	private JLabel story1_78;
	private JLabel story1_79;
	private JLabel story1_80;
	private JLabel story1_81;
	private JLabel story1_82;
	private JLabel story1_83;
	private JLabel story1_84;
	private JLabel story1_85;
	private JLabel story1_86;
	private JLabel story1_87;
	private JLabel story1_88;
	private JLabel story1_89;
	private JLabel story1_90;
	private JLabel story1_91;
	private JLabel story1_92;
	private JLabel story1_93;
	private JLabel story1_94;
	private JLabel story1_95;
	private JLabel story1_96;
	private JLabel story1_97;
	private JLabel story1_98;
	private JLabel story1_99;
	private JLabel story1_100;
	private JLabel story1_101;
	private JLabel story1_102;
	private JLabel story1_103;
	private JLabel story1_104;
	private JLabel story1_105;
	private JLabel story1_106;
	private JLabel story1_107;
	private JLabel story1_108;
	private JLabel story1_109;
	private JLabel story1_110;
	private JLabel story1_111;
	private JLabel story1_112;
	private JLabel story1_113;
	private JLabel story1_114;
	private JLabel story1_115;
	private JLabel story1_116;
	private JLabel story1_117;
	private JLabel story1_118;
	private JLabel story1_119;
	private JLabel story1_120;
	private JLabel story1_121;
	private JLabel story1_122;
	private JLabel story2_1;
	private JLabel story2_2;
	private JLabel story2_3;
	private JLabel story3_1;
	private JLabel story3_2;
	private JLabel story3_3;
	private JLabel story3_4;
	private JLabel story3_5;
	private JLabel story3_6;
	private JLabel story3_7;
	private JLabel story3_8;
	private JLabel story3_9;
	private JLabel story3_10;
	private JLabel story3_11;
	private JLabel story4_1;
	private JLabel story4_2;
	private JLabel story4_3;
	private JLabel story4_4;
	private JLabel story4_5;
	private JLabel story4_6;
	private JLabel story5_1;
	private JLabel story5_2;
	private JLabel story5_3;
	private JLabel story5_4;
	private JLabel story5_5;
	private JLabel story5_6;
	private JLabel story5_7;
	private JLabel story5_8;
	private JLabel story5_9;
	private JLabel story5_10;
	private JLabel story6_1;
	private JLabel story6_2;
	private JLabel story6_3;
	private JLabel story6_4;
	private JLabel story6_5;
	private JLabel story6_6;
	private JLabel story7_1;
	private JLabel story7_2;
	private JLabel story7_3;
	private JLabel story7_4;
	private JLabel story7_5;
	private JLabel story7_6;
	private JLabel story7_7;
	private JLabel story8_1;
	private JLabel story8_2;
	private JLabel story8_3;
	private JLabel story8_4;
	private JLabel story8_5;
	private JLabel story8_6;
	private JLabel story8_7;
	private JLabel story8_8;
	private JLabel story9_1;
	private JLabel story9_2;
	private JLabel story9_3;
	private JLabel story9_4;
	private JLabel story9_5;
	private JLabel story9_6;
	private JLabel story9_7;
	private JLabel story9_8;
	private JLabel story10_1;
	private JLabel story10_2;
	private JLabel story10_3;
	private JLabel story10_4;
	private JLabel story10_5;
	private JLabel story10_6;
	private JLabel story10_7;
	private JLabel story10_8;
	private JLabel story10_9;
	private JLabel story10_10;
	private JLabel story11_1;
	private JLabel story11_2;
	private JLabel story11_3;
	private JLabel story11_4;
	private JLabel story11_5;
	private JLabel story11_6;
	private JLabel story11_7;
	private JLabel story12_1;
	private JLabel story12_2;
	private JLabel story12_3;
	private JLabel story13_1;
	private JLabel story13_2;
	private JLabel story13_3;
	private JLabel story13_4;
	private JLabel story13_5;
	private JLabel story13_6;
	private JLabel story13_7;
	private JLabel story13_8;
	private JLabel story13_9;
	private JLabel story13_10;
	private JLabel baseEnd1;
	private JLabel baseEnd2;
	private JLabel baseEnd3;
	private JLabel baseEnd4;
	private JLabel baseEnd5;
	private JLabel baseEnd6;
	private JLabel baseEnd7;
	private JLabel baseEnd8;
	
	
	private JTextField userAnswer;
	






	


	private JTextArea computerMessage;
	private JTextArea endGame;


	private StrangeController baseController;
	
	public StoryPanel(StrangeController baseController)
	{
		super();
		setBackground(new Color(0, 0, 0));
		this.baseLayout = new SpringLayout();
		this.baseController = baseController;
		
		this.newsLabel = new JLabel("<html>This is a mix of two games: Reigns and LifeLine...both amazing. <br>You will have text show up on the screen and you press buttons to affect the story.<br> Press either button to start the game.<html>");
		this.startUp = new JLabel("Booting up...");
		this.startUp1 = new JLabel("Logging in...");
		this.startUp2 = new JLabel("Receiving signal...");
		this.firstLabel = new JLabel("\"Fun! Nothing could ever go wrong!\" they said.");
		this.firstChoice1 = new JLabel("Who is this?");
		
		this.firstChoice2 = new JLabel("I'm Michael Larson. Are you the person I'm supposed to contact in an emergency?");
		this.openingStory = new JLabel("Great.");
		this.openingStory2 = new JLabel("Hey, can you get a less sarcastic moron to help me?");
		this.openingStory3 = new JLabel("I'm going to die out here with a useless idiot leading me to my doom.");
	
		this.openingStory4 = new JLabel("Hey, I think I can probably get out of this on my own. Nice talking to ya.");
		this.story1_1 = new JLabel("Fantastic! I have been trying to get someone to answer my hails for hours.");
		this.story1_2 = new JLabel("Do you have any clue how to get me out of this horrible situation?");
		this.story1_3 = new JLabel("All that is around me for about a mile is sand and rocks.");
		this.story1_4 = new JLabel("There are some mountains in the distance.");
		this.story1_5 = new JLabel("Ocean...");
		this.story1_6 = new JLabel("Where's the ocean?");
		this.story1_7 = new JLabel("While I was on the U.S. WaveForm, we were heading towards the alleged 'mysterious electromagnetic readings'.");
		this.story1_8 = new JLabel("But as we got closer and closer to the signal more and more instruments went off-line.");
		this.story1_9 = new JLabel("This was something we prepared for, though, knowing that the systems would be affected.");
		this.story1_10 = new JLabel("But even our backups began to fail.");
		this.story1_11 = new JLabel("The sun began to rise. I know it sounds silly to say this now, but it was the most amazing orange I've ever seen.");
		this.story1_12 = new JLabel("Then an old adage came to mind, 'Red sky in the morning, sailors take warning. Red sky at night, sailors delight.'" );
		this.story1_13 = new JLabel("Lo and behold, there was truth in this saying. Because not 3 hours later, dark, menacing clouds blotted out the sun.");
		this.story1_14 = new JLabel("A heavy downpour began and everyone on board rushed to strap things down so they weren't lost in the wind.");
		this.story1_15 = new JLabel("As we were distracted, a massive rogue wave plowed into the side of the ship.");
		this.story1_16 = new JLabel("I was knocked off my feet and slammed into the guard rail, slipping underneath and into the cold water below.");
		this.story1_17 = new JLabel("I must have drifted to shore unconscious, but now that I look back, there should be water around me. There's nothing.");
		this.story1_18 = new JLabel("I got a gash on my side but it doesn't seem life-threatening.");
		this.story1_19 = new JLabel("As far as broken bones...");
		this.story1_20 = new JLabel("Don't have any as far as I can tell.");
		this.story1_21 = new JLabel("No, all I have is the raincoat suit I was wearing and my clothes underneath.");
		this.story1_22 = new JLabel("Alright, feeling better already!");
		this.story1_23 = new JLabel("But I must have been out for a long time. It's almost dark out.");
		this.story1_24 = new JLabel("Actually... It's getting dark really fast! I probably have a few seconds of daylight left.");
		this.story1_25 = new JLabel("Alright,");
		this.story1_26 = new JLabel("These rocks feel warm to the touch.");
		this.story1_27 = new JLabel("They should be good for tonight but we are going to have to come up with a more long-term solutuion.");
		this.story1_28 = new JLabel("Yeah, sounds like the start of a plan.");
		this.story1_29 = new JLabel("I was out cold for most of the day anyway.");
		this.story1_30 = new JLabel("...");
		this.story1_31 = new JLabel("You know I have been walking for about 5 minutes now.");
		this.story1_32 = new JLabel("And these rocks are actually very heavy.");
		this.story1_33 = new JLabel("Should I drop them and just keep going?");
		this.story1_34 = new JLabel("I'm going to drop all the smaller ones and keep the biggest one.");
		this.story1_35 = new JLabel("But I really don't think I need it.");
		this.story1_36 = new JLabel("...");
		this.story1_37 = new JLabel("...");
		this.story1_38 = new JLabel("Okay... not to sound ungrateful for your advice.");
		this.story1_39 = new JLabel("(because I am grateful for your advice.)");
		this.story1_40 = new JLabel("But this rock, warm as it may be, isn't doing any good.");
		this.story1_41 = new JLabel("All it does is weigh me down and wear me out.");
		this.story1_42 = new JLabel("Can I please just drop it?");
		this.story1_43 = new JLabel("Fine, I'll do as you ask.");
		this.story1_44 = new JLabel("...");
		this.story1_45 = new JLabel("Wow, it just dropped in temperature a lot.");
		this.story1_46 = new JLabel("Like a lot, a lot.");
		this.story1_47 = new JLabel("This rock is warm but not warm enough...");
		this.story1_48 = new JLabel("Alright, I'm going to head to what looks like a cave on the side of the mountain.");
		this.story1_49 = new JLabel("but it's getting even colder and I'm not getting any closer to the cave it seems...");
		this.story1_50 = new JLabel("It's just...");
		this.story1_51 = new JLabel("so...");
		this.story1_52 = new JLabel("cold.");
		this.story1_53 = new JLabel("*thud*");
		this.story1_54 = new JLabel("...");
		this.story1_55 = new JLabel("...");
		this.story1_56 = new JLabel("...");
		this.story1_57 = new JLabel("...");
		this.story1_58 = new JLabel("...");
		this.story1_59 = new JLabel("Wha... What happened?");
		this.story1_60 = new JLabel("It's day!");
		this.story1_61 = new JLabel("Must have passed out from the cold.");
		this.story1_62 = new JLabel("Are you there?");
		this.story1_63 = new JLabel("I'm going to keep heading for the mountain cave.");
		this.story1_64 = new JLabel("Hopefully there is something good that I can use or at least protection from the cold.");
		this.story1_65 = new JLabel("Alright, I'm almost there and this isn't just some cave in the mountains.");
		this.story1_66 = new JLabel("This thing is almost the size of the mountain and it's not a cave.");
		this.story1_67 = new JLabel("It's like it was a giant structure.");
		this.story1_68 = new JLabel("Okay, there are huge statues of people.");
		this.story1_69 = new JLabel("As well as hundreds of houses on the side of the cave walls.");
		this.story1_70 = new JLabel("A lot of this stuff looks ancient, but made with the precision of modern tools.");
		this.story1_71 = new JLabel("Alright, I am pretty hungry and I could use some food and supplies.");
		this.story1_72 = new JLabel("You know, as I'm going from room to room looking for supplies");
		this.story1_73 = new JLabel("I'm noticing it looks like whoever was living here got out in a hurry.");
		this.story1_74 = new JLabel("Okay, I found what looks like a pear tree of some sort.");
		this.story1_75 = new JLabel("It tastes way better than a pear!");
		this.story1_76 = new JLabel("I'm going to eat as many as possible and then carry some with me for later.");
		this.story1_77 = new JLabel("I'm going to finish looking around here and continue on.");
		this.story1_78 = new JLabel("So, I finished looking around and it was a lot of the same.");
		this.story1_79 = new JLabel("Amazing, old, ground breaking, discovery mind you.");
		this.story1_80 = new JLabel("But nothing else to help me survive.");
		this.story1_81 = new JLabel("I made it out of the cave and there is something incredible here.");
		this.story1_82 = new JLabel("Wrecks,");
		this.story1_83 = new JLabel("hundreds of boat wrecks all in this bowl of mountains.");
		this.story1_84 = new JLabel("Some look like they date back hunders of years. Columbus era kindof stuff is here,");
		this.story1_85 = new JLabel("all of them wrecked in the center lake.");
		this.story1_86 = new JLabel("Actually, there are planes! Planes are also wrecked on the sides of this bowl.");
		this.story1_87 = new JLabel("Yes, there is another cave like the one I went through on the other side of the bowl.");
		this.story1_88 = new JLabel("But it's about another mile.");
		this.story1_89 = new JLabel("Alright there's an airplane nearby and it looks fairly recent.");
		this.story1_90 = new JLabel("...");
		this.story1_91 = new JLabel("Okay it took a little while but I made it.");
		this.story1_92 = new JLabel("And there was something stange about it.");
		this.story1_93 = new JLabel("It is completely destroyed, but the inside and outside have been stripped of everything.");
		this.story1_94 = new JLabel("Even things that wouldn't seem needed.");
		this.story1_95 = new JLabel("The storage compartment doors have been taken.");
		this.story1_96 = new JLabel("Alright, at least there's wood to start a fire.");
		this.story1_97 = new JLabel("Okay, I found some leaves, wood, and string.");
		this.story1_98 = new JLabel("What now I never started a fire in the wild.");
		this.story1_99 = new JLabel("Okay I got a spark what should I do now?");
		this.story1_100 = new JLabel("Right, got the small fire and I was wondering.");
		this.story1_101 = new JLabel("Should I make it be a bonfire or a small fire?");
		this.story1_102 = new JLabel("The bon fire would attract attention from possible survivors...");
		this.story1_103 = new JLabel("but what if the survivors are hostile?");
		this.story1_104 = new JLabel("This fire is huge!");
		this.story1_105 = new JLabel("Alright, now all that's left to do is wait.");
		this.story1_106 = new JLabel("*snap*");
		this.story1_107 = new JLabel("Wai...");
		this.story1_108 = new JLabel("*thud*");
		this.story1_109 = new JLabel("...");
		this.story1_110 = new JLabel("...");
		this.story1_111 = new JLabel("...");
		this.story1_112 = new JLabel("...");
		this.story1_113 = new JLabel("(whisper)Hey I just got jummped from behind while watching my fire.");
		this.story1_114 = new JLabel("and now I woke up in a strange government looking facility.");
		this.story1_115 = new JLabel("Almost every survivor who has crashed in the bermuda triangle is here.");
		this.story1_116 = new JLabel("I'm stuck in a cell. Please when the boat arrives...");
		this.story1_117 = new JLabel("*Hey you!*");
		this.story1_118 = new JLabel("Tell them to look for me!");
		this.story1_119 = new JLabel("*thud*");
		this.story1_120 = new JLabel("Signal lost...");
		this.story1_121 = new JLabel("Closing connection.");
		this.story1_122 = new JLabel("Nice to meet you.");
		this.story2_1 = new JLabel("Yeah, sounds depressing. But after the storm I guess this will be the best possible situation.");
		this.story2_2 = new JLabel("Surrounded with sand and rocks.");
		this.story2_3 = new JLabel("Wait, there's no ocean!");
		this.story3_1 = new JLabel("Alright, I should let you know that I have a gash on my side.");
		this.story3_2 = new JLabel("Probably not life threatening, but I'm not a doctor.");
		this.story3_3 = new JLabel("Okay, I don't have much time the sun is a little close to setting.");
		this.story3_4 = new JLabel("There's not a lot to work with around me.");
		this.story3_5 = new JLabel("But there's enough to make do.");
		this.story3_6 = new JLabel("Before I was talking with you,");
		this.story3_7 = new JLabel("I already found these black colored berries on the ground.");
		this.story3_8 = new JLabel("But I don't know if I should eat them.");
		this.story3_9 = new JLabel("Probably the best move.");
		this.story3_10 = new JLabel("I'm not all that hungry anyway.");
		this.story3_11 = new JLabel("But the wound is hurting fairly badly.");
		this.story4_1 = new JLabel("Well they taste fine.");
		this.story4_2 = new JLabel("*cough*");
		this.story4_3 = new JLabel("*cough* *cough* *cough*");
		this.story4_4 = new JLabel("-VITALS FAILING-");
		this.story4_5 = new JLabel("-VITALS LOST-");
		this.story4_6 = new JLabel("-CLOSING CONNECTION-");
		this.story5_1 = new JLabel("Nothing is really here.");
		this.story5_2 = new JLabel("This land really only comprises of rocks and sand");
		this.story5_3 = new JLabel("There are some ominous mountains");
		this.story5_4 = new JLabel("But they're about a mile away.");
		this.story5_5 = new JLabel("LITERALLY nothing else is here.");
		this.story5_6 = new JLabel("I will try and dig around for some supplies.");
		this.story5_7 = new JLabel("...");
		this.story5_8 = new JLabel("...");
		this.story5_9 = new JLabel("Nothing is on this stupid island!");
		this.story5_10 = new JLabel("And my side hurts like none other!");
		this.story6_1 = new JLabel("Alright, I'll try my best to cope with it.");
		this.story6_2 = new JLabel("*thud*");
		this.story6_3 = new JLabel("Shoot! I triped and slammed my side into a razor sharp rock.");
		this.story6_4 = new JLabel("And I'm bleeding a lot like I'm going to die a lot.");
		this.story6_5 = new JLabel("And it's all your fault!");
		this.story6_6 = new JLabel("CONNECTION TERMINATED");
		this.story7_1 = new JLabel("So I searched for wood all this time...");
		this.story7_2 = new JLabel("And I don't think you were listening when I said.");
		this.story7_3 = new JLabel("'All there is is SAND and ROCKS'");
		this.story7_4 = new JLabel("So there is no fire. Not to mention that I can't see and rocks because the sun set.");
		this.story7_5 = new JLabel("Plus it just got so cold that I am literally having my vision dim from the cold.");
		this.story7_6 = new JLabel("And I have one thing to say. System.. Shut... Down....");
		this.story7_7 = new JLabel("CLOSING CONNECTION");
		this.story8_1 = new JLabel("I dropped the rocks and I'm going to walk a little ways.");
		this.story8_2 = new JLabel("I can't really see anything right now it's all just black.");
		this.story8_3 = new JLabel("Wow");
		this.story8_4 = new JLabel("The temperature just dropped a lot.");
		this.story8_5 = new JLabel("It's so cold my breath is literally turning to ice and falling to the ground.");
		this.story8_6 = new JLabel("It's so cold...");
		this.story8_7 = new JLabel("I can't move...");
		this.story8_8 = new JLabel("END COMMUNICATION");
		this.story9_1 = new JLabel("Okay I've been walking the perimeter and I am getting really thirsty.");
		this.story9_2 = new JLabel("And I can't get back to the mountain pass.");
		this.story9_3 = new JLabel("I don't see any source of water...");
		this.story9_4 = new JLabel("I can't beleive that I got stuck in the desert to come so far.");
		this.story9_5 = new JLabel("...Just to die.");
		this.story9_6 = new JLabel("*sobbing*");
		this.story9_7 = new JLabel("DISCONNECTING");
		this.story9_8 = new JLabel("HAVE A GOOD DAY");
		this.story10_1 = new JLabel("Probably good to get through as fast as possible.");
		this.story10_2 = new JLabel("Who knows what kind of desieses are here.");
		this.story10_3 = new JLabel("And by the looks of this place it was abandoned in a hurry.");
		this.story10_4 = new JLabel("Wait there is some symbol on the ground.");
		this.story10_5 = new JLabel("It's a mark that looks like a 'Y' but with weird caligraphy");
		this.story10_6 = new JLabel("I'm going to get closer to investigate.");
		this.story10_7 = new JLabel("*click*");
		this.story10_8 = new JLabel("HARPOONS SHOT OUT OF THE WALLS KILLING HIM");
		this.story10_9 = new JLabel("(He should have seen that one coming)");
		this.story10_10 = new JLabel("SHUTTING DOWN");
		this.story11_1 = new JLabel("Okay I found what looks like a spear of some sort.");
		this.story11_2 = new JLabel("And I'm running out of here because where I found it was where skeletons were piled.");
		this.story11_3 = new JLabel("*thud*");
		this.story11_4 = new JLabel("Hey so I just tripped down the stairs and landed on the spear in my rush to get out.");
		this.story11_5 = new JLabel("VITALS FAILING");
		this.story11_6 = new JLabel("Just thought I would say thanks for your help.");
		this.story11_7 = new JLabel("COMMUNICATION DISCONNECTED.");
		this.story12_1 = new JLabel("Yhea, propably poisonous.");
		this.story12_2 = new JLabel("But I am hungry...");
		this.story12_3 = new JLabel("Really hungry...");
		this.story13_1 = new JLabel("Okay on of the huge statues looks like it could topple easily.");
		this.story13_2 = new JLabel("...");
		this.story13_3 = new JLabel("Okay I'm going to have to climb to the top to push the head.");
		this.story13_4 = new JLabel("1... 2... 3! *grinding stone sound*");
		this.story13_5 = new JLabel("*boom*");
		this.story13_6 = new JLabel("*screaming*");
		this.story13_7 = new JLabel("Hey I don't know what I was thinking but when it fell, I fell");
		this.story13_8 = new JLabel("And I landed on the broken shards of rock below and I'm bleeding out badly.");
		this.story13_9 = new JLabel("Well at least I Destroyed priceless artifacts befor I died.s");
		this.story13_10 = new JLabel("SYSTEM SHUTTING DOWN");
		this.baseEnd1 = new JLabel("Thanks! I was probably going to faint from holding these things.");
		this.baseEnd2 = new JLabel("Alright I'm at the base of the mountain and it's getting really cold.");
		this.baseEnd3 = new JLabel("Wait... There's a light coming from the bushes up a little higher I'm going to investigate...");
		this.baseEnd4 = new JLabel("Alright I made it to the light and there is a door ajar, should I go in?");
		this.baseEnd5 = new JLabel("Okay I'm in and am going to run down this long corridor");
		this.baseEnd6 = new JLabel("...");
		this.baseEnd7 = new JLabel("Hey, I found something weird... It's a computer room with huge vault doors on one side.");
		this.baseEnd8 = new JLabel("There's a lot of server looking things but one computer that says: ");
		this.computerMessage = new JTextArea(baseController.gameMessage());
		this.endGame = new JTextArea("Computer Access Accepted \n DEFENCES GOING OFFLINE \n CLOAKING GOING OFFLINE \n DESTROYING ALL EVIDENCE \n \"Hey you there?\" \n "
				+ "\"There's a count down and I can't get off the island\" \n  \"I hope you find a way to tell the world what has happened here today.\" \n END STORY");
		
		this.userAnswer = new JTextField(20);
		
		
		
		
		
		
		setupPanel();
		setupLayout();
		
	}


	

	


	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(400, 8000));
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
		this.add(story1_18);
		this.add(story1_19);
		this.add(story1_20);
		this.add(story1_21);
		this.add(story1_22);
		this.add(story1_23);
		this.add(story1_24);
		this.add(story1_25);
		this.add(story1_26);
		this.add(story1_27);
		this.add(story1_28);
		this.add(story1_29);
		this.add(story1_30);
		this.add(story1_31);
		this.add(story1_32);
		this.add(story1_33);
		this.add(story1_34);
		this.add(story1_35);
		this.add(story1_36);
		this.add(story1_37);
		this.add(story1_38);
		this.add(story1_39);
		this.add(story1_40);
		this.add(story1_41);
		this.add(story1_42);
		this.add(story1_43);
		this.add(story1_44);
		this.add(story1_45);
		this.add(story1_46);
		this.add(story1_47);
		this.add(story1_48);
		this.add(story1_49);
		this.add(story1_50);
		this.add(story1_51);
		this.add(story1_52);
		this.add(story1_53);
		this.add(story1_54);
		this.add(story1_55);
		this.add(story1_56);
		this.add(story1_57);
		this.add(story1_58);
		this.add(story1_59);
		this.add(story1_60);
		this.add(story1_61);
		this.add(story1_62);
		this.add(story1_63);
		this.add(story1_64);
		this.add(story1_65);
		this.add(story1_66);
		this.add(story1_67);
		this.add(story1_68);
		this.add(story1_69);
		this.add(story1_70);
		this.add(story1_71);
		this.add(story1_72);
		this.add(story1_73);
		this.add(story1_74);
		this.add(story1_75);
		this.add(story1_76);
		this.add(story1_77);
		this.add(story1_78);
		this.add(story1_79);
		this.add(story1_80);
		this.add(story1_81);
		this.add(story1_82);
		this.add(story1_83);
		this.add(story1_84);
		this.add(story1_85);
		this.add(story1_86);
		this.add(story1_87);
		this.add(story1_88);
		this.add(story1_89);
		this.add(story1_90);
		this.add(story1_91);
		this.add(story1_92);
		this.add(story1_93);
		this.add(story1_94);
		this.add(story1_95);
		this.add(story1_96);
		this.add(story1_97);
		this.add(story1_98);
		this.add(story1_99);
		this.add(story1_100);
		this.add(story1_101);
		this.add(story1_102);
		this.add(story1_103);
		this.add(story1_104);
		this.add(story1_105);
		this.add(story1_106);
		this.add(story1_107);
		this.add(story1_108);
		this.add(story1_109);
		this.add(story1_110);
		this.add(story1_111);
		this.add(story1_112);
		this.add(story1_113);
		this.add(story1_114);
		this.add(story1_115);
		this.add(story1_116);
		this.add(story1_117);
		this.add(story1_118);
		this.add(story1_119);
		this.add(story1_120);
		this.add(story1_121);
		this.add(story1_122);
		this.add(story2_1);
		this.add(story2_2);
		this.add(story2_3);
		this.add(story3_1);
		this.add(story3_2);
		this.add(story3_3);
		this.add(story3_4);
		this.add(story3_5);
		this.add(story3_6);
		this.add(story3_7);
		this.add(story3_8);
		this.add(story3_9);
		this.add(story3_10);
		this.add(story3_11);
		this.add(story4_1);
		this.add(story4_2);
		this.add(story4_3);
		this.add(story4_4);
		this.add(story4_5);
		this.add(story4_6);
		this.add(story5_1);
		this.add(story5_2);
		this.add(story5_3);
		this.add(story5_4);
		this.add(story5_5);
		this.add(story5_6);
		this.add(story5_7);
		this.add(story5_8);
		this.add(story5_9);
		this.add(story5_10);
		this.add(story6_1);
		this.add(story6_2);
		this.add(story6_3);
		this.add(story6_4);
		this.add(story6_5);
		this.add(story6_6);
		this.add(story7_1);
		this.add(story7_2);
		this.add(story7_3);
		this.add(story7_4);
		this.add(story7_5);
		this.add(story7_6);
		this.add(story7_7);
		this.add(story8_1);
		this.add(story8_2);
		this.add(story8_3);
		this.add(story8_4);
		this.add(story8_5);
		this.add(story8_6);
		this.add(story8_7);
		this.add(story8_8);
		this.add(story9_1);
		this.add(story9_2);
		this.add(story9_3);
		this.add(story9_4);
		this.add(story9_5);
		this.add(story9_6);
		this.add(story9_7);
		this.add(story9_8);
		this.add(story10_1);
		this.add(story10_2);
		this.add(story10_3);
		this.add(story10_4);
		this.add(story10_5);
		this.add(story10_6);
		this.add(story10_7);
		this.add(story10_8);
		this.add(story10_9);
		this.add(story10_10);
		this.add(story11_1);
		this.add(story11_2);
		this.add(story11_3);
		this.add(story11_4);
		this.add(story11_5);
		this.add(story11_6);
		this.add(story11_7);
		this.add(story12_1);
		this.add(story12_2);
		this.add(story12_3);
		this.add(story13_1);
		this.add(story13_2);
		this.add(story13_3);
		this.add(story13_4);
		this.add(story13_5);
		this.add(story13_6);
		this.add(story13_7);
		this.add(story13_8);
		this.add(story13_9);
		this.add(story13_10);
		
		
		this.add(baseEnd1);
		this.add(baseEnd2);
		this.add(baseEnd3);
		this.add(baseEnd4);
		this.add(baseEnd5);
		this.add(baseEnd6);
		this.add(baseEnd7);
		this.add(baseEnd8);
		this.add(computerMessage);
		this.add(userAnswer);
		this.add(endGame);
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
		endGame.setVisible(false);
		baseEnd1.setVisible(false);
		baseEnd2.setVisible(false);
		baseEnd3.setVisible(false);
		baseEnd4.setVisible(false);
		baseEnd5.setVisible(false);
		baseEnd6.setVisible(false);
		baseEnd7.setVisible(false);
		baseEnd8.setVisible(false);
		computerMessage.setVisible(false);
		userAnswer.setVisible(false);
		
		
		
		
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
		story1_18.setVisible(false);
		story1_19.setVisible(false);
		story1_20.setVisible(false);
		story1_21.setVisible(false);
		story1_22.setVisible(false);
		story1_23.setVisible(false);
		story1_24.setVisible(false);
		story1_25.setVisible(false);
		story1_26.setVisible(false);
		story1_27.setVisible(false);
		story1_28.setVisible(false);
		story1_29.setVisible(false);
		story1_30.setVisible(false);
		story1_31.setVisible(false);
		story1_32.setVisible(false);
		story1_33.setVisible(false);
		story1_34.setVisible(false);
		story1_35.setVisible(false);
		story1_36.setVisible(false);
		story1_37.setVisible(false);
		story1_38.setVisible(false);
		story1_39.setVisible(false);
		story1_40.setVisible(false);
		story1_41.setVisible(false);
		story1_42.setVisible(false);
		story1_43.setVisible(false);
		story1_44.setVisible(false);
		story1_45.setVisible(false);
		story1_46.setVisible(false);
		story1_47.setVisible(false);
		story1_48.setVisible(false);
		story1_49.setVisible(false);
		story1_50.setVisible(false);
		story1_51.setVisible(false);
		story1_52.setVisible(false);
		story1_53.setVisible(false);
		story1_54.setVisible(false);
		story1_55.setVisible(false);
		story1_56.setVisible(false);
		story1_57.setVisible(false);
		story1_58.setVisible(false);
		story1_59.setVisible(false);
		story1_60.setVisible(false);
		story1_61.setVisible(false);
		story1_62.setVisible(false);
		story1_63.setVisible(false);
		story1_64.setVisible(false);
		story1_65.setVisible(false);
		story1_66.setVisible(false);
		story1_67.setVisible(false);
		story1_68.setVisible(false);
		story1_69.setVisible(false);
		story1_70.setVisible(false);
		story1_71.setVisible(false);
		story1_72.setVisible(false);
		story1_73.setVisible(false);
		story1_74.setVisible(false);
		story1_75.setVisible(false);
		story1_76.setVisible(false);
		story1_77.setVisible(false);
		story1_78.setVisible(false);
		story1_79.setVisible(false);
		story1_80.setVisible(false);
		story1_81.setVisible(false);
		story1_82.setVisible(false);
		story1_83.setVisible(false);
		story1_84.setVisible(false);
		story1_85.setVisible(false);
		story1_86.setVisible(false);
		story1_87.setVisible(false);
		story1_88.setVisible(false);
		story1_89.setVisible(false);
		story1_90.setVisible(false);
		story1_91.setVisible(false);
		story1_92.setVisible(false);
		story1_93.setVisible(false);
		story1_94.setVisible(false);
		story1_95.setVisible(false);
		story1_96.setVisible(false);
		story1_97.setVisible(false);
		story1_98.setVisible(false);
		story1_99.setVisible(false);
		story1_100.setVisible(false);
		story1_101.setVisible(false);
		story1_102.setVisible(false);
		story1_103.setVisible(false);
		story1_104.setVisible(false);
		story1_105.setVisible(false);
		story1_106.setVisible(false);
		story1_107.setVisible(false);
		story1_108.setVisible(false);
		story1_109.setVisible(false);
		story1_110.setVisible(false);
		story1_111.setVisible(false);
		story1_112.setVisible(false);
		story1_113.setVisible(false);
		story1_114.setVisible(false);
		story1_115.setVisible(false);
		story1_116.setVisible(false);
		story1_117.setVisible(false);
		story1_118.setVisible(false);
		story1_119.setVisible(false);
		story1_120.setVisible(false);
		story1_121.setVisible(false);
		story1_122.setVisible(false);
		story2_1.setVisible(false);
		story2_2.setVisible(false);
		story2_3.setVisible(false);
		story3_1.setVisible(false);
		story3_3.setVisible(false);
		story3_2.setVisible(false);
		story3_4.setVisible(false);
		story3_5.setVisible(false);
		story3_6.setVisible(false);
		story3_7.setVisible(false);
		story3_8.setVisible(false);
		story3_9.setVisible(false);
		story3_10.setVisible(false);
		story3_11.setVisible(false);
		story4_1.setVisible(false);
		story4_3.setVisible(false);
		story4_2.setVisible(false);
		story4_4.setVisible(false);
		story4_5.setVisible(false);
		story4_6.setVisible(false);
		story5_1.setVisible(false);
		story5_3.setVisible(false);
		story5_2.setVisible(false);
		story5_4.setVisible(false);
		story5_5.setVisible(false);
		story5_6.setVisible(false);
		story5_7.setVisible(false);
		story5_8.setVisible(false);
		story5_9.setVisible(false);
		story5_10.setVisible(false);
		story6_1.setVisible(false);
		story6_3.setVisible(false);
		story6_2.setVisible(false);
		story6_4.setVisible(false);
		story6_5.setVisible(false);
		story6_6.setVisible(false);
		story7_1.setVisible(false);
		story7_3.setVisible(false);
		story7_2.setVisible(false);
		story7_4.setVisible(false);
		story7_5.setVisible(false);
		story7_6.setVisible(false);
		story7_7.setVisible(false);
		story8_1.setVisible(false);
		story8_3.setVisible(false);
		story8_2.setVisible(false);
		story8_4.setVisible(false);
		story8_5.setVisible(false);
		story8_6.setVisible(false);
		story8_7.setVisible(false);
		story8_8.setVisible(false);
		story9_1.setVisible(false);
		story9_2.setVisible(false);
		story9_3.setVisible(false);
		story9_4.setVisible(false);
		story9_5.setVisible(false);
		story9_6.setVisible(false);
		story9_7.setVisible(false);
		story9_8.setVisible(false);
		story10_1.setVisible(false);
		story10_2.setVisible(false);
		story10_3.setVisible(false);
		story10_4.setVisible(false);
		story10_5.setVisible(false);
		story10_6.setVisible(false);
		story10_7.setVisible(false);
		story10_8.setVisible(false);
		story10_9.setVisible(false);
		story10_10.setVisible(false);
		story11_1.setVisible(false);
		story11_2.setVisible(false);
		story11_3.setVisible(false);
		story11_4.setVisible(false);
		story11_5.setVisible(false);
		story11_6.setVisible(false);
		story11_7.setVisible(false);
		story12_1.setVisible(false);
		story12_3.setVisible(false);
		story12_2.setVisible(false);
		story13_1.setVisible(false);
		story13_2.setVisible(false);
		story13_3.setVisible(false);
		story13_4.setVisible(false);
		story13_5.setVisible(false);
		story13_6.setVisible(false);
		story13_7.setVisible(false);
		story13_8.setVisible(false);
		story13_9.setVisible(false);
		story13_10.setVisible(false);
	
		
		story1_122.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, openingStory3, 20, SpringLayout.NORTH, openingStory);
		baseLayout.putConstraint(SpringLayout.NORTH, story1_122, 20, SpringLayout.NORTH, firstChoice1);

		baseLayout.putConstraint(SpringLayout.NORTH, firstChoice1, 20, SpringLayout.NORTH, firstLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, firstLabel, 600, SpringLayout.NORTH, newsLabel);
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
		baseLayout.putConstraint(SpringLayout.NORTH, story6_1, 20, SpringLayout.NORTH, story1_22);

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
		story1_7.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_7, 20, SpringLayout.NORTH, story1_6);
		story1_8.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_8, 20, SpringLayout.NORTH, story1_7);
		story1_9.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_9, 20, SpringLayout.NORTH, story1_8);
		story1_10.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_10, 20, SpringLayout.NORTH, story1_9);
		story1_11.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_11, 20, SpringLayout.NORTH, story1_10);
		story1_12.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_12, 20, SpringLayout.NORTH, story1_11);
		story1_13.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_13, 20, SpringLayout.NORTH, story1_12);
		story1_14.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_14, 20, SpringLayout.NORTH, story1_13);
		story1_15.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_15, 20, SpringLayout.NORTH, story1_14);
		story1_16.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_16, 20, SpringLayout.NORTH, story1_15);
		story1_17.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_17, 20, SpringLayout.NORTH, story1_16);
		story1_18.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_18, 20, SpringLayout.NORTH, story1_17);
		story1_19.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_19, 20, SpringLayout.NORTH, story1_18);
		story1_20.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_20, 20, SpringLayout.NORTH, story1_19);
		baseLayout.putConstraint(SpringLayout.NORTH, story1_21, 20, SpringLayout.NORTH, story1_20);
		story1_21.setForeground(new Color(124, 252, 0));
		story1_22.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_22, 20, SpringLayout.NORTH, story1_21);
		story1_23.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story5_1, 20, SpringLayout.NORTH, story3_5);

		baseLayout.putConstraint(SpringLayout.NORTH, story1_23, 20, SpringLayout.NORTH, story1_22);
		story1_24.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_24, 20, SpringLayout.NORTH, story1_23);
		story1_25.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_25, 20, SpringLayout.NORTH, story1_24);
		story1_26.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_26, 20, SpringLayout.NORTH, story1_25);
		story1_27.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_27, 20, SpringLayout.NORTH, story1_26);
		story1_28.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_28, 20, SpringLayout.NORTH, story1_27);
		story1_29.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_29, 20, SpringLayout.NORTH, story1_28);
		story1_30.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_30, 20, SpringLayout.NORTH, story1_29);
		story1_31.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_31, 20, SpringLayout.NORTH, story1_30);
		story1_32.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_32, 20, SpringLayout.NORTH, story1_31);
		story1_33.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_33, 20, SpringLayout.NORTH, story1_32);
		story1_34.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_34, 20, SpringLayout.NORTH, story1_33);
		story1_35.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_35, 20, SpringLayout.NORTH, story1_34);
		story1_36.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_36, 20, SpringLayout.NORTH, story1_35);
		story1_37.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_37, 20, SpringLayout.NORTH, story1_36);
		story1_38.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_38, 20, SpringLayout.NORTH, story1_37);
		story1_39.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_39, 20, SpringLayout.NORTH, story1_38);
		story1_40.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_40, 20, SpringLayout.NORTH, story1_39);
		story1_41.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_41, 20, SpringLayout.NORTH, story1_40);
		story1_42.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_42, 20, SpringLayout.NORTH, story1_41);
		story1_43.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_43, 20, SpringLayout.NORTH, story1_42);
		story1_44.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_44, 20, SpringLayout.NORTH, story1_43);
		story1_45.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story3_1, 20, SpringLayout.NORTH, story1_6);

		baseLayout.putConstraint(SpringLayout.NORTH, story1_45, 20, SpringLayout.NORTH, story1_44);
		story1_46.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_46, 20, SpringLayout.NORTH, story1_45);
		story1_47.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_47, 20, SpringLayout.NORTH, story1_46);
		story1_48.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_48, 20, SpringLayout.NORTH, story1_47);
		story1_49.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_49, 20, SpringLayout.NORTH, story1_48);
		story1_50.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_50, 20, SpringLayout.NORTH, story1_49);
		story1_51.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_51, 20, SpringLayout.NORTH, story1_50);
		story1_52.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_52, 20, SpringLayout.NORTH, story1_51);
		story1_53.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_53, 20, SpringLayout.NORTH, story1_52);
		story1_54.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_54, 20, SpringLayout.NORTH, story1_53);
		story1_55.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_55, 20, SpringLayout.NORTH, story1_54);
		story1_56.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_56, 20, SpringLayout.NORTH, story1_55);
		story1_57.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_57, 20, SpringLayout.NORTH, story1_56);
		story1_58.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_58, 20, SpringLayout.NORTH, story1_57);
		story1_59.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_59, 20, SpringLayout.NORTH, story1_58);
		story1_60.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_60, 20, SpringLayout.NORTH, story1_59);
		story1_61.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_61, 20, SpringLayout.NORTH, story1_60);
		story1_62.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_62, 20, SpringLayout.NORTH, story1_61);
		story1_63.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_63, 20, SpringLayout.NORTH, story1_62);
		story1_64.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_64, 20, SpringLayout.NORTH, story1_63);
		baseLayout.putConstraint(SpringLayout.NORTH, story7_1, 20, SpringLayout.NORTH, story1_29);

		story1_65.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_65, 20, SpringLayout.NORTH, story1_64);
		story1_66.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_66, 20, SpringLayout.NORTH, story1_65);
		story1_67.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_67, 20, SpringLayout.NORTH, story1_66);
		story1_68.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_68, 20, SpringLayout.NORTH, story1_67);
		story1_69.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_69, 20, SpringLayout.NORTH, story1_68);
		story1_70.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_70, 20, SpringLayout.NORTH, story1_69);
		story1_71.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_71, 20, SpringLayout.NORTH, story1_70);
		story1_72.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_72, 20, SpringLayout.NORTH, story1_71);
		story1_73.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_73, 20, SpringLayout.NORTH, story1_72);
		story1_74.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_74, 20, SpringLayout.NORTH, story1_73);
		story1_75.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_75, 20, SpringLayout.NORTH, story1_74);
		story1_76.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_76, 20, SpringLayout.NORTH, story1_75);
		story1_77.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_77, 20, SpringLayout.NORTH, story1_76);
		story1_78.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_78, 20, SpringLayout.NORTH, story1_77);
		story1_79.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_79, 20, SpringLayout.NORTH, story1_78);
		story1_80.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_80, 20, SpringLayout.NORTH, story1_79);
		story1_81.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_81, 20, SpringLayout.NORTH, story1_80);
		story1_82.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_82, 20, SpringLayout.NORTH, story1_81);
		story1_83.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_83, 20, SpringLayout.NORTH, story1_82);
		story1_84.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_84, 20, SpringLayout.NORTH, story1_83);
		story1_85.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_85, 20, SpringLayout.NORTH, story1_84);
		story1_86.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_86, 20, SpringLayout.NORTH, story1_85);
		story1_87.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_87, 20, SpringLayout.NORTH, story1_86);
		story1_88.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_88, 20, SpringLayout.NORTH, story1_87);
		story1_89.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_89, 20, SpringLayout.NORTH, story1_88);
		story1_90.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_90, 20, SpringLayout.NORTH, story1_89);
		story1_91.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_91, 20, SpringLayout.NORTH, story1_90);
		story1_92.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_92, 20, SpringLayout.NORTH, story1_91);
		story1_93.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_93, 20, SpringLayout.NORTH, story1_92);
		story1_94.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_94, 20, SpringLayout.NORTH, story1_93);
		story1_95.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_95, 20, SpringLayout.NORTH, story1_94);
		story1_96.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_96, 20, SpringLayout.NORTH, story1_95);
		story1_97.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_97, 20, SpringLayout.NORTH, story1_96);
		story1_98.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_98, 20, SpringLayout.NORTH, story1_97);
		story1_99.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_99, 20, SpringLayout.NORTH, story1_98);
		story1_100.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_100, 20, SpringLayout.NORTH, story1_99);
		baseLayout.putConstraint(SpringLayout.NORTH, story10_1, 20, SpringLayout.NORTH, story1_72);

		story1_101.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_101, 20, SpringLayout.NORTH, story1_100);
		story1_102.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_102, 20, SpringLayout.NORTH, story1_101);
		story1_103.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_103, 20, SpringLayout.NORTH, story1_102);
		story1_104.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_104, 20, SpringLayout.NORTH, story1_103);
		story1_105.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_105, 20, SpringLayout.NORTH, story1_104);
		story1_106.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_106, 20, SpringLayout.NORTH, story1_105);
		story1_107.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_107, 20, SpringLayout.NORTH, story1_106);
		story1_108.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story8_1, 20, SpringLayout.NORTH, story1_48);

		baseLayout.putConstraint(SpringLayout.NORTH, story1_108, 20, SpringLayout.NORTH, story1_107);
		story1_109.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_109, 20, SpringLayout.NORTH, story1_108);
		story1_110.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_110, 20, SpringLayout.NORTH, story1_109);
		story1_111.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_111, 20, SpringLayout.NORTH, story1_110);
		story1_112.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_112, 20, SpringLayout.NORTH, story1_111);
		story1_113.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_113, 20, SpringLayout.NORTH, story1_112);
		story1_114.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_114, 20, SpringLayout.NORTH, story1_113);
		story1_115.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_115, 20, SpringLayout.NORTH, story1_114);
		story1_116.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_116, 20, SpringLayout.NORTH, story1_115);
		story1_117.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_117, 20, SpringLayout.NORTH, story1_116);
		story1_118.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_118, 20, SpringLayout.NORTH, story1_117);
		story11_1.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story11_1, 20, SpringLayout.NORTH, story1_73);
		story11_2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story11_2, 20, SpringLayout.NORTH, story11_1);
		story11_3.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story11_3, 20, SpringLayout.NORTH, story11_2);
		story11_4.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story11_4, 20, SpringLayout.NORTH, story11_3);
		story11_5.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story11_5, 20, SpringLayout.NORTH, story11_4);
		story11_6.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story11_6, 20, SpringLayout.NORTH, story11_5);
		story11_7.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story11_7, 20, SpringLayout.NORTH, story11_6);
		story1_119.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_119, 20, SpringLayout.NORTH, story1_118);
		story1_120.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_120, 20, SpringLayout.NORTH, story1_119);
		story1_121.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story1_121, 20, SpringLayout.NORTH, story1_120);
		story2_1.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story2_1, 20, SpringLayout.NORTH, story1_2);
		story2_2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story2_2, 20, SpringLayout.NORTH, story2_1);
		story2_3.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story2_3, 20, SpringLayout.NORTH, story2_2);
		story3_1.setForeground(new Color(124, 252, 0));
		story3_2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story3_2, 20, SpringLayout.NORTH, story3_1);
		story3_3.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story3_3, 20, SpringLayout.NORTH, story3_2);
		story3_4.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story3_4, 20, SpringLayout.NORTH, story3_3);
		story3_5.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story3_5, 20, SpringLayout.NORTH, story3_4);
		story3_6.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story3_6, 20, SpringLayout.NORTH, story3_5);
		story3_7.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story3_7, 20, SpringLayout.NORTH, story3_6);
		story3_8.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story3_8, 20, SpringLayout.NORTH, story3_7);
		story3_9.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story3_9, 20, SpringLayout.NORTH, story3_8);
		story3_10.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story3_10, 20, SpringLayout.NORTH, story3_9);
		story3_11.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story3_11, 20, SpringLayout.NORTH, story3_10);
		story4_1.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story4_1, 20, SpringLayout.NORTH, story3_8);
		story4_2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story4_2, 20, SpringLayout.NORTH, story4_1);
		story4_3.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story4_3, 20, SpringLayout.NORTH, story4_2);
		story4_4.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story4_4, 20, SpringLayout.NORTH, story4_3);
		story4_5.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story4_5, 20, SpringLayout.NORTH, story4_4);
		story4_6.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story4_6, 20, SpringLayout.NORTH, story4_5);
		story5_1.setForeground(new Color(124, 252, 0));
		story5_2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story5_2, 20, SpringLayout.NORTH, story5_1);
		story5_3.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story5_3, 20, SpringLayout.NORTH, story5_2);
		story5_4.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story5_4, 20, SpringLayout.NORTH, story5_3);
		story5_5.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story5_5, 20, SpringLayout.NORTH, story5_4);
		story5_6.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story5_6, 20, SpringLayout.NORTH, story5_5);
		story5_7.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story5_7, 20, SpringLayout.NORTH, story5_6);
		story5_8.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story5_8, 20, SpringLayout.NORTH, story5_7);
		story5_9.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story5_9, 20, SpringLayout.NORTH, story5_8);
		story5_10.setForeground(new Color(124, 252, 0));
		story8_8.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story8_8, 20, SpringLayout.NORTH, story8_7);
		baseLayout.putConstraint(SpringLayout.NORTH, story5_10, 20, SpringLayout.NORTH, story5_9);
		story6_1.setForeground(new Color(124, 252, 0));
		story6_2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story6_2, 20, SpringLayout.NORTH, story6_1);
		story6_3.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story6_3, 20, SpringLayout.NORTH, story6_2);
		story6_4.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story6_4, 20, SpringLayout.NORTH, story6_3);
		story6_5.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story6_5, 20, SpringLayout.NORTH, story6_4);
		story6_6.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story6_6, 20, SpringLayout.NORTH, story6_5);
		story7_1.setForeground(new Color(124, 252, 0));
		story7_2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story7_2, 20, SpringLayout.NORTH, story7_1);
		story7_3.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story7_3, 20, SpringLayout.NORTH, story7_2);
		story7_4.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story7_4, 20, SpringLayout.NORTH, story7_3);
		story7_5.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story7_5, 20, SpringLayout.NORTH, story7_4);
		story7_6.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story7_6, 20, SpringLayout.NORTH, story7_5);
		story7_7.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story7_7, 20, SpringLayout.NORTH, story7_6);
		story8_1.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story9_1, 20, SpringLayout.NORTH, story1_67);

		story8_2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story8_2, 20, SpringLayout.NORTH, story8_1);
		story8_3.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story8_3, 20, SpringLayout.NORTH, story8_2);
		story8_4.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story8_4, 20, SpringLayout.NORTH, story8_3);
		story8_5.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story8_5, 20, SpringLayout.NORTH, story8_4);
		story8_6.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story8_6, 20, SpringLayout.NORTH, story8_5);
		story8_7.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story8_7, 20, SpringLayout.NORTH, story8_6);
		story9_1.setForeground(new Color(124, 252, 0));
		story9_2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story9_2, 20, SpringLayout.NORTH, story9_1);
		story9_3.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story9_3, 20, SpringLayout.NORTH, story9_2);
		story9_4.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story9_4, 20, SpringLayout.NORTH, story9_3);
		story9_5.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story9_5, 20, SpringLayout.NORTH, story9_4);
		story9_6.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story9_6, 20, SpringLayout.NORTH, story9_5);
		story9_7.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story9_7, 20, SpringLayout.NORTH, story9_6);
		story9_8.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story9_8, 20, SpringLayout.NORTH, story9_7);
		story10_1.setForeground(new Color(124, 252, 0));
		story10_2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story10_2, 20, SpringLayout.NORTH, story10_1);
		story10_3.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story10_3, 20, SpringLayout.NORTH, story10_2);
		story10_4.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story10_4, 20, SpringLayout.NORTH, story10_3);
		story10_5.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story10_5, 20, SpringLayout.NORTH, story10_4);
		story10_6.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story10_6, 20, SpringLayout.NORTH, story10_5);
		story10_7.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story10_7, 20, SpringLayout.NORTH, story10_6);
		story10_8.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story10_8, 20, SpringLayout.NORTH, story10_7);
		story10_9.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story10_9, 20, SpringLayout.NORTH, story10_8);
		story10_10.setForeground(new Color(124, 252, 0));
		story13_1.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story13_1, 20, SpringLayout.NORTH, story1_80);
		story13_2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story13_2, 20, SpringLayout.NORTH, story13_1);
		story13_3.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story13_3, 20, SpringLayout.NORTH, story13_2);
		story13_4.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story13_4, 20, SpringLayout.NORTH, story13_3);
		story13_5.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story13_5, 20, SpringLayout.NORTH, story13_4);
		story13_6.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story13_6, 20, SpringLayout.NORTH, story13_5);
		story13_7.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story13_7, 20, SpringLayout.NORTH, story13_6);
		story13_8.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story13_8, 20, SpringLayout.NORTH, story13_7);
		story13_9.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story13_9, 20, SpringLayout.NORTH, story13_8);
		story13_10.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, story13_10, 20, SpringLayout.NORTH, story13_9);
		baseLayout.putConstraint(SpringLayout.NORTH, story10_10, 20, SpringLayout.NORTH, story10_9);
		
		baseEnd1.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, baseEnd1, 20, SpringLayout.NORTH, story1_33);
		baseEnd4.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, baseEnd4, 20, SpringLayout.NORTH, baseEnd3);
		baseEnd2.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, baseEnd2, 20, SpringLayout.NORTH, baseEnd1);
		baseEnd3.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, baseEnd3, 20, SpringLayout.NORTH, baseEnd2);
		baseEnd8.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, baseEnd8, 20, SpringLayout.NORTH, baseEnd7);
		baseEnd7.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, baseEnd7, 20, SpringLayout.NORTH, baseEnd6);
		baseEnd5.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, baseEnd5, 20, SpringLayout.NORTH, baseEnd4);
		baseEnd6.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, baseEnd6, 20, SpringLayout.NORTH, baseEnd5);
		computerMessage.setForeground(new Color(124, 252, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, computerMessage, 20, SpringLayout.NORTH, baseEnd8);
		computerMessage.setBackground(new Color(0, 0, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, userAnswer, 60, SpringLayout.NORTH, computerMessage);
		endGame.setForeground(new Color(124, 252, 0));
		endGame.setBackground(new Color(0, 0, 0));
		baseLayout.putConstraint(SpringLayout.NORTH, endGame, 30, SpringLayout.NORTH, userAnswer);
	}
	
	public void reset()
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
		story1_18.setVisible(false);
		story1_19.setVisible(false);
		story1_20.setVisible(false);
		story1_21.setVisible(false);
		story1_22.setVisible(false);
		story1_23.setVisible(false);
		story1_24.setVisible(false);
		story1_25.setVisible(false);
		story1_26.setVisible(false);
		story1_27.setVisible(false);
		story1_28.setVisible(false);
		story1_29.setVisible(false);
		story1_30.setVisible(false);
		story1_31.setVisible(false);
		story1_32.setVisible(false);
		story1_33.setVisible(false);
		story1_34.setVisible(false);
		story1_35.setVisible(false);
		story1_36.setVisible(false);
		story1_37.setVisible(false);
		story1_38.setVisible(false);
		story1_39.setVisible(false);
		story1_40.setVisible(false);
		story1_41.setVisible(false);
		story1_42.setVisible(false);
		story1_43.setVisible(false);
		story1_44.setVisible(false);
		story1_45.setVisible(false);
		story1_46.setVisible(false);
		story1_47.setVisible(false);
		story1_48.setVisible(false);
		story1_49.setVisible(false);
		story1_50.setVisible(false);
		story1_51.setVisible(false);
		story1_52.setVisible(false);
		story1_53.setVisible(false);
		story1_54.setVisible(false);
		story1_55.setVisible(false);
		story1_56.setVisible(false);
		story1_57.setVisible(false);
		story1_58.setVisible(false);
		story1_59.setVisible(false);
		story1_60.setVisible(false);
		story1_61.setVisible(false);
		story1_62.setVisible(false);
		story1_63.setVisible(false);
		story1_64.setVisible(false);
		story1_65.setVisible(false);
		story1_66.setVisible(false);
		story1_67.setVisible(false);
		story1_68.setVisible(false);
		story1_69.setVisible(false);
		story1_70.setVisible(false);
		story1_71.setVisible(false);
		story1_72.setVisible(false);
		story1_73.setVisible(false);
		story1_74.setVisible(false);
		story1_75.setVisible(false);
		story1_76.setVisible(false);
		story1_77.setVisible(false);
		story1_78.setVisible(false);
		story1_79.setVisible(false);
		story1_80.setVisible(false);
		story1_81.setVisible(false);
		story1_82.setVisible(false);
		story1_83.setVisible(false);
		story1_84.setVisible(false);
		story1_85.setVisible(false);
		story1_86.setVisible(false);
		story1_87.setVisible(false);
		story1_88.setVisible(false);
		story1_89.setVisible(false);
		story1_90.setVisible(false);
		story1_91.setVisible(false);
		story1_92.setVisible(false);
		story1_93.setVisible(false);
		story1_94.setVisible(false);
		story1_95.setVisible(false);
		story1_96.setVisible(false);
		story1_97.setVisible(false);
		story1_98.setVisible(false);
		story1_99.setVisible(false);
		story1_100.setVisible(false);
		story1_101.setVisible(false);
		story1_102.setVisible(false);
		story1_103.setVisible(false);
		story1_104.setVisible(false);
		story1_105.setVisible(false);
		story1_106.setVisible(false);
		story1_107.setVisible(false);
		story1_108.setVisible(false);
		story1_109.setVisible(false);
		story1_110.setVisible(false);
		story1_111.setVisible(false);
		story1_112.setVisible(false);
		story1_113.setVisible(false);
		story1_114.setVisible(false);
		story1_115.setVisible(false);
		story1_116.setVisible(false);
		story1_117.setVisible(false);
		story1_118.setVisible(false);
		story1_119.setVisible(false);
		story1_120.setVisible(false);
		story1_121.setVisible(false);
		story1_122.setVisible(false);
		story2_1.setVisible(false);
		story2_2.setVisible(false);
		story2_3.setVisible(false);
		story3_1.setVisible(false);
		story3_3.setVisible(false);
		story3_2.setVisible(false);
		story3_4.setVisible(false);
		story3_5.setVisible(false);
		story3_6.setVisible(false);
		story3_7.setVisible(false);
		story3_8.setVisible(false);
		story3_9.setVisible(false);
		story3_10.setVisible(false);
		story3_11.setVisible(false);
		story4_1.setVisible(false);
		story4_3.setVisible(false);
		story4_2.setVisible(false);
		story4_4.setVisible(false);
		story4_5.setVisible(false);
		story4_6.setVisible(false);
		story5_1.setVisible(false);
		story5_3.setVisible(false);
		story5_2.setVisible(false);
		story5_4.setVisible(false);
		story5_5.setVisible(false);
		story5_6.setVisible(false);
		story5_7.setVisible(false);
		story5_8.setVisible(false);
		story5_9.setVisible(false);
		story5_10.setVisible(false);
		story6_1.setVisible(false);
		story6_3.setVisible(false);
		story6_2.setVisible(false);
		story6_4.setVisible(false);
		story6_5.setVisible(false);
		story6_6.setVisible(false);
		story7_1.setVisible(false);
		story7_3.setVisible(false);
		story7_2.setVisible(false);
		story7_4.setVisible(false);
		story7_5.setVisible(false);
		story7_6.setVisible(false);
		story7_7.setVisible(false);
		story8_1.setVisible(false);
		story8_3.setVisible(false);
		story8_2.setVisible(false);
		story8_4.setVisible(false);
		story8_5.setVisible(false);
		story8_6.setVisible(false);
		story8_7.setVisible(false);
		story8_8.setVisible(false);
		story9_1.setVisible(false);
		story9_2.setVisible(false);
		story9_3.setVisible(false);
		story9_4.setVisible(false);
		story9_5.setVisible(false);
		story9_6.setVisible(false);
		story9_7.setVisible(false);
		story9_8.setVisible(false);
		story10_1.setVisible(false);
		story10_2.setVisible(false);
		story10_3.setVisible(false);
		story10_4.setVisible(false);
		story10_5.setVisible(false);
		story10_6.setVisible(false);
		story10_7.setVisible(false);
		story10_8.setVisible(false);
		story10_9.setVisible(false);
		story10_10.setVisible(false);
		story11_1.setVisible(false);
		story11_2.setVisible(false);
		story11_3.setVisible(false);
		story11_4.setVisible(false);
		story11_5.setVisible(false);
		story11_6.setVisible(false);
		story11_7.setVisible(false);
		story12_1.setVisible(false);
		story12_3.setVisible(false);
		story12_2.setVisible(false);
		endGame.setVisible(false);
		baseEnd1.setVisible(false);
		baseEnd2.setVisible(false);
		baseEnd3.setVisible(false);
		baseEnd4.setVisible(false);
		baseEnd5.setVisible(false);
		baseEnd6.setVisible(false);
		baseEnd7.setVisible(false);
		baseEnd8.setVisible(false);
		computerMessage.setVisible(false);
		userAnswer.setVisible(false);
	}

	public JLabel getStory3_1() {
		return story3_1;
	}

	public void setStory3_1(JLabel story3_1) {
		this.story3_1 = story3_1;
	}

	public JLabel getStory3_2() {
		return story3_2;
	}

	public void setStory3_2(JLabel story3_2) {
		this.story3_2 = story3_2;
	}

	public JLabel getStory3_3() {
		return story3_3;
	}

	public void setStory3_3(JLabel story3_3) {
		this.story3_3 = story3_3;
	}

	public JLabel getStory3_4() {
		return story3_4;
	}

	public void setStory3_4(JLabel story3_4) {
		this.story3_4 = story3_4;
	}

	public JLabel getStory3_5() {
		return story3_5;
	}

	public void setStory3_5(JLabel story3_5) {
		this.story3_5 = story3_5;
	}

	public JLabel getStory3_6() {
		return story3_6;
	}

	public void setStory3_6(JLabel story3_6) {
		this.story3_6 = story3_6;
	}

	public JLabel getStory3_7() {
		return story3_7;
	}

	public void setStory3_7(JLabel story3_7) {
		this.story3_7 = story3_7;
	}

	public JLabel getStory3_8() {
		return story3_8;
	}

	public void setStory3_8(JLabel story3_8) {
		this.story3_8 = story3_8;
	}

	public JLabel getStory3_9() {
		return story3_9;
	}

	public void setStory3_9(JLabel story3_9) {
		this.story3_9 = story3_9;
	}

	public JLabel getStory3_10() {
		return story3_10;
	}

	public void setStory3_10(JLabel story3_10) {
		this.story3_10 = story3_10;
	}

	public JLabel getStory3_11() {
		return story3_11;
	}

	public void setStory3_11(JLabel story3_11) {
		this.story3_11 = story3_11;
	}

	public JLabel getNewsLabel() {
		return newsLabel;
	}

	public void setNewsLabel(JLabel newsLabel) {
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

	public JLabel getStory1_29() {
		return story1_29;
	}

	public void setStory1_29(JLabel story1_29) {
		this.story1_29 = story1_29;
	}

	public JLabel getStory1_30() {
		return story1_30;
	}

	public void setStory1_30(JLabel story1_30) {
		this.story1_30 = story1_30;
	}

	public JLabel getStory1_31() {
		return story1_31;
	}

	public void setStory1_31(JLabel story1_31) {
		this.story1_31 = story1_31;
	}

	public JLabel getStory1_32() {
		return story1_32;
	}

	public void setStory1_32(JLabel story1_32) {
		this.story1_32 = story1_32;
	}

	public JLabel getStory1_33() {
		return story1_33;
	}

	public void setStory1_33(JLabel story1_33) {
		this.story1_33 = story1_33;
	}

	public JLabel getStory1_34() {
		return story1_34;
	}

	public void setStory1_34(JLabel story1_34) {
		this.story1_34 = story1_34;
	}

	public JLabel getStory1_35() {
		return story1_35;
	}

	public void setStory1_35(JLabel story1_35) {
		this.story1_35 = story1_35;
	}

	public JLabel getStory1_36() {
		return story1_36;
	}

	public void setStory1_36(JLabel story1_36) {
		this.story1_36 = story1_36;
	}

	public JLabel getStory1_37() {
		return story1_37;
	}

	public void setStory1_37(JLabel story1_37) {
		this.story1_37 = story1_37;
	}

	public JLabel getStory1_38() {
		return story1_38;
	}

	public void setStory1_38(JLabel story1_38) {
		this.story1_38 = story1_38;
	}

	public JLabel getStory1_39() {
		return story1_39;
	}

	public void setStory1_39(JLabel story1_39) {
		this.story1_39 = story1_39;
	}

	public JLabel getStory1_40() {
		return story1_40;
	}

	public void setStory1_40(JLabel story1_40) {
		this.story1_40 = story1_40;
	}

	public JLabel getStory1_41() {
		return story1_41;
	}

	public void setStory1_41(JLabel story1_41) {
		this.story1_41 = story1_41;
	}

	public JLabel getStory1_42() {
		return story1_42;
	}

	public void setStory1_42(JLabel story1_42) {
		this.story1_42 = story1_42;
	}

	public JLabel getStory1_43() {
		return story1_43;
	}

	public void setStory1_43(JLabel story1_43) {
		this.story1_43 = story1_43;
	}

	public JLabel getStory1_44() {
		return story1_44;
	}

	public void setStory1_44(JLabel story1_44) {
		this.story1_44 = story1_44;
	}

	public JLabel getStory1_45() {
		return story1_45;
	}

	public void setStory1_45(JLabel story1_45) {
		this.story1_45 = story1_45;
	}

	public JLabel getStory1_46() {
		return story1_46;
	}

	public void setStory1_46(JLabel story1_46) {
		this.story1_46 = story1_46;
	}

	public JLabel getStory1_47() {
		return story1_47;
	}

	public void setStory1_47(JLabel story1_47) {
		this.story1_47 = story1_47;
	}

	public JLabel getStory1_48() {
		return story1_48;
	}

	public void setStory1_48(JLabel story1_48) {
		this.story1_48 = story1_48;
	}

	public JLabel getStory1_49() {
		return story1_49;
	}

	public void setStory1_49(JLabel story1_49) {
		this.story1_49 = story1_49;
	}

	public JLabel getStory1_50() {
		return story1_50;
	}

	public void setStory1_50(JLabel story1_50) {
		this.story1_50 = story1_50;
	}

	public JLabel getStory1_51() {
		return story1_51;
	}

	public void setStory1_51(JLabel story1_51) {
		this.story1_51 = story1_51;
	}

	public JLabel getStory1_52() {
		return story1_52;
	}

	public void setStory1_52(JLabel story1_52) {
		this.story1_52 = story1_52;
	}

	public JLabel getStory1_53() {
		return story1_53;
	}

	public void setStory1_53(JLabel story1_53) {
		this.story1_53 = story1_53;
	}

	public JLabel getStory1_54() {
		return story1_54;
	}

	public void setStory1_54(JLabel story1_54) {
		this.story1_54 = story1_54;
	}

	public JLabel getStory1_55() {
		return story1_55;
	}

	public void setStory1_55(JLabel story1_55) {
		this.story1_55 = story1_55;
	}

	public JLabel getStory1_68() {
		return story1_68;
	}

	public void setStory1_68(JLabel story1_68) {
		this.story1_68 = story1_68;
	}

	public JLabel getStory1_69() {
		return story1_69;
	}

	public void setStory1_69(JLabel story1_69) {
		this.story1_69 = story1_69;
	}

	public JLabel getStory1_56() {
		return story1_56;
	}

	public void setStory1_56(JLabel story1_56) {
		this.story1_56 = story1_56;
	}

	public JLabel getStory1_57() {
		return story1_57;
	}

	public void setStory1_57(JLabel story1_57) {
		this.story1_57 = story1_57;
	}

	public JLabel getStory1_58() {
		return story1_58;
	}

	public void setStory1_58(JLabel story1_58) {
		this.story1_58 = story1_58;
	}

	public JLabel getStory1_59() {
		return story1_59;
	}

	public void setStory1_59(JLabel story1_59) {
		this.story1_59 = story1_59;
	}

	public JLabel getStory1_60() {
		return story1_60;
	}

	public void setStory1_60(JLabel story1_60) {
		this.story1_60 = story1_60;
	}

	public JLabel getStory1_61() {
		return story1_61;
	}

	public void setStory1_61(JLabel story1_61) {
		this.story1_61 = story1_61;
	}

	public JLabel getStory1_62() {
		return story1_62;
	}

	public void setStory1_62(JLabel story1_62) {
		this.story1_62 = story1_62;
	}

	public JLabel getStory1_63() {
		return story1_63;
	}

	public void setStory1_63(JLabel story1_63) {
		this.story1_63 = story1_63;
	}

	public JLabel getStory1_64() {
		return story1_64;
	}

	public void setStory1_64(JLabel story1_64) {
		this.story1_64 = story1_64;
	}

	public JLabel getStory1_65() {
		return story1_65;
	}

	public void setStory1_65(JLabel story1_65) {
		this.story1_65 = story1_65;
	}

	public JLabel getStory1_66() {
		return story1_66;
	}

	public void setStory1_66(JLabel story1_66) {
		this.story1_66 = story1_66;
	}

	public JLabel getStory1_67() {
		return story1_67;
	}

	public void setStory1_67(JLabel story1_67) {
		this.story1_67 = story1_67;
	}

	public JLabel getStory1_70() {
		return story1_70;
	}

	public void setStory1_70(JLabel story1_70) {
		this.story1_70 = story1_70;
	}

	public JLabel getStory1_71() {
		return story1_71;
	}

	public void setStory1_71(JLabel story1_71) {
		this.story1_71 = story1_71;
	}

	public JLabel getStory1_72() {
		return story1_72;
	}

	public void setStory1_72(JLabel story1_72) {
		this.story1_72 = story1_72;
	}

	public JLabel getStory1_73() {
		return story1_73;
	}

	public void setStory1_73(JLabel story1_73) {
		this.story1_73 = story1_73;
	}

	public JLabel getStory1_74() {
		return story1_74;
	}

	public void setStory1_74(JLabel story1_74) {
		this.story1_74 = story1_74;
	}

	public JLabel getStory1_75() {
		return story1_75;
	}

	public void setStory1_75(JLabel story1_75) {
		this.story1_75 = story1_75;
	}

	public JLabel getStory1_76() {
		return story1_76;
	}

	public void setStory1_76(JLabel story1_76) {
		this.story1_76 = story1_76;
	}

	public JLabel getStory1_77() {
		return story1_77;
	}

	public void setStory1_77(JLabel story1_77) {
		this.story1_77 = story1_77;
	}

	public JLabel getStory1_78() {
		return story1_78;
	}

	public void setStory1_78(JLabel story1_78) {
		this.story1_78 = story1_78;
	}

	public JLabel getStory1_79() {
		return story1_79;
	}

	public void setStory1_79(JLabel story1_79) {
		this.story1_79 = story1_79;
	}

	public JLabel getStory1_80() {
		return story1_80;
	}

	public void setStory1_80(JLabel story1_80) {
		this.story1_80 = story1_80;
	}

	public JLabel getStory1_81() {
		return story1_81;
	}

	public void setStory1_81(JLabel story1_81) {
		this.story1_81 = story1_81;
	}

	public JLabel getStory1_82() {
		return story1_82;
	}

	public void setStory1_82(JLabel story1_82) {
		this.story1_82 = story1_82;
	}

	public JLabel getStory1_83() {
		return story1_83;
	}

	public void setStory1_83(JLabel story1_83) {
		this.story1_83 = story1_83;
	}

	public JLabel getStory1_84() {
		return story1_84;
	}

	public void setStory1_84(JLabel story1_84) {
		this.story1_84 = story1_84;
	}

	public JLabel getStory1_85() {
		return story1_85;
	}

	public void setStory1_85(JLabel story1_85) {
		this.story1_85 = story1_85;
	}

	public JLabel getStory1_86() {
		return story1_86;
	}

	public void setStory1_86(JLabel story1_86) {
		this.story1_86 = story1_86;
	}

	public JLabel getStory1_87() {
		return story1_87;
	}

	public void setStory1_87(JLabel story1_87) {
		this.story1_87 = story1_87;
	}

	public JLabel getStory1_88() {
		return story1_88;
	}

	public void setStory1_88(JLabel story1_88) {
		this.story1_88 = story1_88;
	}

	public JLabel getStory1_89() {
		return story1_89;
	}

	public void setStory1_89(JLabel story1_89) {
		this.story1_89 = story1_89;
	}

	public JLabel getStory1_90() {
		return story1_90;
	}

	public void setStory1_90(JLabel story1_90) {
		this.story1_90 = story1_90;
	}

	public JLabel getStory1_91() {
		return story1_91;
	}

	public void setStory1_91(JLabel story1_91) {
		this.story1_91 = story1_91;
	}

	public JLabel getStory1_92() {
		return story1_92;
	}

	public void setStory1_92(JLabel story1_92) {
		this.story1_92 = story1_92;
	}

	public JLabel getStory1_93() {
		return story1_93;
	}

	public void setStory1_93(JLabel story1_93) {
		this.story1_93 = story1_93;
	}

	public JLabel getStory1_94() {
		return story1_94;
	}

	public void setStory1_94(JLabel story1_94) {
		this.story1_94 = story1_94;
	}

	public JLabel getStory1_95() {
		return story1_95;
	}

	public void setStory1_95(JLabel story1_95) {
		this.story1_95 = story1_95;
	}

	public JLabel getStory1_96() {
		return story1_96;
	}

	public void setStory1_96(JLabel story1_96) {
		this.story1_96 = story1_96;
	}

	public JLabel getStory1_97() {
		return story1_97;
	}

	public void setStory1_97(JLabel story1_97) {
		this.story1_97 = story1_97;
	}

	public JLabel getStory1_98() {
		return story1_98;
	}

	public void setStory1_98(JLabel story1_98) {
		this.story1_98 = story1_98;
	}

	public JLabel getStory1_99() {
		return story1_99;
	}

	public void setStory1_99(JLabel story1_99) {
		this.story1_99 = story1_99;
	}

	public JLabel getStory1_100() {
		return story1_100;
	}

	public void setStory1_100(JLabel story1_100) {
		this.story1_100 = story1_100;
	}

	public JLabel getStory1_101() {
		return story1_101;
	}

	public void setStory1_101(JLabel story1_101) {
		this.story1_101 = story1_101;
	}

	public JLabel getStory1_102() {
		return story1_102;
	}

	public void setStory1_102(JLabel story1_102) {
		this.story1_102 = story1_102;
	}

	public JLabel getStory1_103() {
		return story1_103;
	}

	public void setStory1_103(JLabel story1_103) {
		this.story1_103 = story1_103;
	}

	public JLabel getStory1_104() {
		return story1_104;
	}

	public void setStory1_104(JLabel story1_104) {
		this.story1_104 = story1_104;
	}

	public JLabel getStory1_105() {
		return story1_105;
	}

	public void setStory1_105(JLabel story1_105) {
		this.story1_105 = story1_105;
	}

	public JLabel getStory1_106() {
		return story1_106;
	}

	public void setStory1_106(JLabel story1_106) {
		this.story1_106 = story1_106;
	}

	public JLabel getStory1_107() {
		return story1_107;
	}

	public void setStory1_107(JLabel story1_107) {
		this.story1_107 = story1_107;
	}

	public JLabel getStory1_108() {
		return story1_108;
	}

	public void setStory1_108(JLabel story1_108) {
		this.story1_108 = story1_108;
	}

	public JLabel getStory1_109() {
		return story1_109;
	}

	public void setStory1_109(JLabel story1_109) {
		this.story1_109 = story1_109;
	}

	public JLabel getStory1_110() {
		return story1_110;
	}

	public void setStory1_110(JLabel story1_110) {
		this.story1_110 = story1_110;
	}

	public JLabel getStory1_111() {
		return story1_111;
	}

	public void setStory1_111(JLabel story1_111) {
		this.story1_111 = story1_111;
	}

	public JLabel getStory1_112() {
		return story1_112;
	}

	public void setStory1_112(JLabel story1_112) {
		this.story1_112 = story1_112;
	}

	public JLabel getStory1_113() {
		return story1_113;
	}

	public void setStory1_113(JLabel story1_113) {
		this.story1_113 = story1_113;
	}

	public JLabel getStory1_114() {
		return story1_114;
	}

	public void setStory1_114(JLabel story1_114) {
		this.story1_114 = story1_114;
	}

	public JLabel getStory1_115() {
		return story1_115;
	}

	public void setStory1_115(JLabel story1_115) {
		this.story1_115 = story1_115;
	}

	public JLabel getStory1_116() {
		return story1_116;
	}

	public void setStory1_116(JLabel story1_116) {
		this.story1_116 = story1_116;
	}

	public JLabel getStory1_117() {
		return story1_117;
	}

	public void setStory1_117(JLabel story1_117) {
		this.story1_117 = story1_117;
	}

	public JLabel getStory1_118() {
		return story1_118;
	}

	public void setStory1_118(JLabel story1_118) {
		this.story1_118 = story1_118;
	}

	public JLabel getStory1_119() {
		return story1_119;
	}

	public void setStory1_119(JLabel story1_119) {
		this.story1_119 = story1_119;
	}

	public JLabel getStory1_120() {
		return story1_120;
	}

	public void setStory1_120(JLabel story1_120) {
		this.story1_120 = story1_120;
	}

	public JLabel getStory1_121() {
		return story1_121;
	}

	public void setStory1_121(JLabel story1_121) {
		this.story1_121 = story1_121;
	}

	public JLabel getStory1_122() {
		return story1_122;
	}

	public void setStory1_122(JLabel story1_122) {
		this.story1_122 = story1_122;
	}

	public JLabel getStory2_1() {
		return story2_1;
	}

	public void setStory2_1(JLabel story2_1) {
		this.story2_1 = story2_1;
	}

	public JLabel getStory2_2() {
		return story2_2;
	}

	public void setStory2_2(JLabel story2_2) {
		this.story2_2 = story2_2;
	}

	public JLabel getStory2_3() {
		return story2_3;
	}

	public void setStory2_3(JLabel story2_3) {
		this.story2_3 = story2_3;
	}

	public JLabel getStory4_1() {
		return story4_1;
	}

	public void setStory4_1(JLabel story4_1) {
		this.story4_1 = story4_1;
	}

	public JLabel getStory4_2() {
		return story4_2;
	}

	public void setStory4_2(JLabel story4_2) {
		this.story4_2 = story4_2;
	}

	public JLabel getStory4_3() {
		return story4_3;
	}

	public void setStory4_3(JLabel story4_3) {
		this.story4_3 = story4_3;
	}

	public JLabel getStory4_4() {
		return story4_4;
	}

	public void setStory4_4(JLabel story4_4) {
		this.story4_4 = story4_4;
	}

	public JLabel getStory4_5() {
		return story4_5;
	}

	public void setStory4_5(JLabel story4_5) {
		this.story4_5 = story4_5;
	}

	public JLabel getStory4_6() {
		return story4_6;
	}

	public void setStory4_6(JLabel story4_6) {
		this.story4_6 = story4_6;
	}

	public JLabel getStory5_1() {
		return story5_1;
	}

	public void setStory5_1(JLabel story5_1) {
		this.story5_1 = story5_1;
	}

	public JLabel getStory5_2() {
		return story5_2;
	}

	public void setStory5_2(JLabel story5_2) {
		this.story5_2 = story5_2;
	}

	public JLabel getStory5_3() {
		return story5_3;
	}

	public void setStory5_3(JLabel story5_3) {
		this.story5_3 = story5_3;
	}

	public JLabel getStory5_4() {
		return story5_4;
	}

	public void setStory5_4(JLabel story5_4) {
		this.story5_4 = story5_4;
	}

	public JLabel getStory5_5() {
		return story5_5;
	}

	public void setStory5_5(JLabel story5_5) {
		this.story5_5 = story5_5;
	}

	public JLabel getStory5_6() {
		return story5_6;
	}

	public void setStory5_6(JLabel story5_6) {
		this.story5_6 = story5_6;
	}

	public JLabel getStory5_7() {
		return story5_7;
	}

	public void setStory5_7(JLabel story5_7) {
		this.story5_7 = story5_7;
	}

	public JLabel getStory5_8() {
		return story5_8;
	}

	public void setStory5_8(JLabel story5_8) {
		this.story5_8 = story5_8;
	}

	public JLabel getStory5_9() {
		return story5_9;
	}

	public void setStory5_9(JLabel story5_9) {
		this.story5_9 = story5_9;
	}

	public JLabel getStory5_10() {
		return story5_10;
	}

	public void setStory5_10(JLabel story5_10) {
		this.story5_10 = story5_10;
	}

	public JLabel getStory6_1() {
		return story6_1;
	}

	public void setStory6_1(JLabel story6_1) {
		this.story6_1 = story6_1;
	}

	public JLabel getStory6_2() {
		return story6_2;
	}

	public void setStory6_2(JLabel story6_2) {
		this.story6_2 = story6_2;
	}

	public JLabel getStory6_3() {
		return story6_3;
	}

	public void setStory6_3(JLabel story6_3) {
		this.story6_3 = story6_3;
	}

	public JLabel getStory6_4() {
		return story6_4;
	}

	public void setStory6_4(JLabel story6_4) {
		this.story6_4 = story6_4;
	}

	public JLabel getStory6_5() {
		return story6_5;
	}

	public void setStory6_5(JLabel story6_5) {
		this.story6_5 = story6_5;
	}

	public JLabel getStory6_6() {
		return story6_6;
	}

	public void setStory6_6(JLabel story6_6) {
		this.story6_6 = story6_6;
	}

	public JLabel getStory7_1() {
		return story7_1;
	}

	public void setStory7_1(JLabel story7_1) {
		this.story7_1 = story7_1;
	}

	public JLabel getStory7_2() {
		return story7_2;
	}

	public void setStory7_2(JLabel story7_2) {
		this.story7_2 = story7_2;
	}

	public JLabel getStory7_3() {
		return story7_3;
	}

	public void setStory7_3(JLabel story7_3) {
		this.story7_3 = story7_3;
	}

	public JLabel getStory7_4() {
		return story7_4;
	}

	public void setStory7_4(JLabel story7_4) {
		this.story7_4 = story7_4;
	}

	public JLabel getStory7_5() {
		return story7_5;
	}

	public void setStory7_5(JLabel story7_5) {
		this.story7_5 = story7_5;
	}

	public JLabel getStory7_6() {
		return story7_6;
	}

	public void setStory7_6(JLabel story7_6) {
		this.story7_6 = story7_6;
	}

	public JLabel getStory7_7() {
		return story7_7;
	}

	public void setStory7_7(JLabel story7_7) {
		this.story7_7 = story7_7;
	}

	public JLabel getStory8_1() {
		return story8_1;
	}

	public void setStory8_1(JLabel story8_1) {
		this.story8_1 = story8_1;
	}

	public JLabel getStory8_2() {
		return story8_2;
	}

	public void setStory8_2(JLabel story8_2) {
		this.story8_2 = story8_2;
	}

	public JLabel getStory8_3() {
		return story8_3;
	}

	public void setStory8_3(JLabel story8_3) {
		this.story8_3 = story8_3;
	}

	public JLabel getStory8_4() {
		return story8_4;
	}

	public void setStory8_4(JLabel story8_4) {
		this.story8_4 = story8_4;
	}

	public JLabel getStory8_5() {
		return story8_5;
	}

	public void setStory8_5(JLabel story8_5) {
		this.story8_5 = story8_5;
	}

	public JLabel getStory8_6() {
		return story8_6;
	}

	public void setStory8_6(JLabel story8_6) {
		this.story8_6 = story8_6;
	}

	public JLabel getStory8_7() {
		return story8_7;
	}

	public void setStory8_7(JLabel story8_7) {
		this.story8_7 = story8_7;
	}

	public JLabel getStory8_8() {
		return story8_8;
	}

	public void setStory8_8(JLabel story8_8) {
		this.story8_8 = story8_8;
	}

	public JLabel getStory9_1() {
		return story9_1;
	}

	public void setStory9_1(JLabel story9_1) {
		this.story9_1 = story9_1;
	}

	public JLabel getStory9_2() {
		return story9_2;
	}

	public void setStory9_2(JLabel story9_2) {
		this.story9_2 = story9_2;
	}

	public JLabel getStory9_3() {
		return story9_3;
	}

	public void setStory9_3(JLabel story9_3) {
		this.story9_3 = story9_3;
	}

	public JLabel getStory9_4() {
		return story9_4;
	}

	public void setStory9_4(JLabel story9_4) {
		this.story9_4 = story9_4;
	}

	public JLabel getStory9_5() {
		return story9_5;
	}

	public void setStory9_5(JLabel story9_5) {
		this.story9_5 = story9_5;
	}

	public JLabel getStory9_6() {
		return story9_6;
	}

	public void setStory9_6(JLabel story9_6) {
		this.story9_6 = story9_6;
	}

	public JLabel getStory9_7() {
		return story9_7;
	}

	public void setStory9_7(JLabel story9_7) {
		this.story9_7 = story9_7;
	}

	public JLabel getStory9_8() {
		return story9_8;
	}

	public void setStory9_8(JLabel story9_8) {
		this.story9_8 = story9_8;
	}

	public JLabel getStory10_1() {
		return story10_1;
	}

	public void setStory10_1(JLabel story10_1) {
		this.story10_1 = story10_1;
	}

	public JLabel getStory10_2() {
		return story10_2;
	}

	public void setStory10_2(JLabel story10_2) {
		this.story10_2 = story10_2;
	}

	public JLabel getStory10_3() {
		return story10_3;
	}

	public void setStory10_3(JLabel story10_3) {
		this.story10_3 = story10_3;
	}

	public JLabel getStory10_4() {
		return story10_4;
	}

	public void setStory10_4(JLabel story10_4) {
		this.story10_4 = story10_4;
	}

	public JLabel getStory10_5() {
		return story10_5;
	}

	public void setStory10_5(JLabel story10_5) {
		this.story10_5 = story10_5;
	}

	public JLabel getStory10_6() {
		return story10_6;
	}

	public void setStory10_6(JLabel story10_6) {
		this.story10_6 = story10_6;
	}

	public JLabel getStory10_7() {
		return story10_7;
	}

	public void setStory10_7(JLabel story10_7) {
		this.story10_7 = story10_7;
	}

	public JLabel getStory10_8() {
		return story10_8;
	}

	public void setStory10_8(JLabel story10_8) {
		this.story10_8 = story10_8;
	}

	public JLabel getStory10_9() {
		return story10_9;
	}

	public void setStory10_9(JLabel story10_9) {
		this.story10_9 = story10_9;
	}

	public JLabel getStory10_10() {
		return story10_10;
	}

	public void setStory10_10(JLabel story10_10) {
		this.story10_10 = story10_10;
	}

	public JLabel getStory11_1() {
		return story11_1;
	}

	public void setStory11_1(JLabel story11_1) {
		this.story11_1 = story11_1;
	}

	public JLabel getStory11_2() {
		return story11_2;
	}

	public void setStory11_2(JLabel story11_2) {
		this.story11_2 = story11_2;
	}

	public JLabel getStory11_3() {
		return story11_3;
	}

	public void setStory11_3(JLabel story11_3) {
		this.story11_3 = story11_3;
	}

	public JLabel getStory11_4() {
		return story11_4;
	}

	public void setStory11_4(JLabel story11_4) {
		this.story11_4 = story11_4;
	}

	public JLabel getStory11_5() {
		return story11_5;
	}

	public void setStory11_5(JLabel story11_5) {
		this.story11_5 = story11_5;
	}

	public JLabel getStory11_6() {
		return story11_6;
	}

	public void setStory11_6(JLabel story11_6) {
		this.story11_6 = story11_6;
	}

	public JLabel getStory11_7() {
		return story11_7;
	}

	public void setStory11_7(JLabel story11_7) {
		this.story11_7 = story11_7;
	}

	public JLabel getStory12_1() {
		return story12_1;
	}

	public void setStory12_1(JLabel story12_1) {
		this.story12_1 = story12_1;
	}

	public JLabel getStory12_2() {
		return story12_2;
	}

	public void setStory12_2(JLabel story12_2) {
		this.story12_2 = story12_2;
	}

	public JLabel getStory12_3() {
		return story12_3;
	}

	public void setStory12_3(JLabel story12_3) {
		this.story12_3 = story12_3;
	}

	public JLabel getStory13_1() {
		return story13_1;
	}

	public void setStory13_1(JLabel story13_1) {
		this.story13_1 = story13_1;
	}

	public JLabel getStory13_2() {
		return story13_2;
	}

	public void setStory13_2(JLabel story13_2) {
		this.story13_2 = story13_2;
	}

	public JLabel getStory13_3() {
		return story13_3;
	}

	public void setStory13_3(JLabel story13_3) {
		this.story13_3 = story13_3;
	}

	public JLabel getStory13_4() {
		return story13_4;
	}

	public void setStory13_4(JLabel story13_4) {
		this.story13_4 = story13_4;
	}

	public JLabel getStory13_5() {
		return story13_5;
	}

	public void setStory13_5(JLabel story13_5) {
		this.story13_5 = story13_5;
	}

	public JLabel getStory13_6() {
		return story13_6;
	}

	public void setStory13_6(JLabel story13_6) {
		this.story13_6 = story13_6;
	}

	public JLabel getStory13_7() {
		return story13_7;
	}

	public void setStory13_7(JLabel story13_7) {
		this.story13_7 = story13_7;
	}

	public JLabel getStory13_8() {
		return story13_8;
	}

	public void setStory13_8(JLabel story13_8) {
		this.story13_8 = story13_8;
	}

	public JLabel getStory13_9() {
		return story13_9;
	}

	public void setStory13_9(JLabel story13_9) {
		this.story13_9 = story13_9;
	}
	public JLabel getStory13_10() {
		return story13_10;
	}
	public void setStory13_10(JLabel story13_10) {
		this.story13_10 = story13_10;
	}
	public JLabel getBaseEnd1() {
		return baseEnd1;
	}
	public void setBaseEnd1(JLabel baseEnd1) {
		this.baseEnd1 = baseEnd1;
	}
	public JLabel getBaseEnd2() {
		return baseEnd2;
	}
	public void setBaseEnd2(JLabel baseEnd2) {
		this.baseEnd2 = baseEnd2;
	}
	public JLabel getBaseEnd3() {
		return baseEnd3;
	}
	public void setBaseEnd3(JLabel baseEnd3) {
		this.baseEnd3 = baseEnd3;
	}

	public JLabel getBaseEnd4() {
		return baseEnd4;
	}
	public void setBaseEnd4(JLabel baseEnd4) {
		this.baseEnd4 = baseEnd4;
	}

	public JLabel getBaseEnd5() {
		return baseEnd5;
	}

	public void setBaseEnd5(JLabel baseEnd5) {
		this.baseEnd5 = baseEnd5;
	}

	public JLabel getBaseEnd6() {
		return baseEnd6;
	}

	public void setBaseEnd6(JLabel baseEnd6) {
		this.baseEnd6 = baseEnd6;
	}

	public JLabel getBaseEnd7() {
		return baseEnd7;
	}

	public void setBaseEnd7(JLabel baseEnd7) {
		this.baseEnd7 = baseEnd7;
	}

	public JLabel getBaseEnd8() {
		return baseEnd8;
	}

	public void setBaseEnd8(JLabel baseEnd8) {
		this.baseEnd8 = baseEnd8;
	}
	public JTextArea getComputerMessage() {
		return computerMessage;
	}



	public JTextField getUserAnswer() {
		return userAnswer;
	}







	public void setUserAnswer(JTextField userAnswer) {
		this.userAnswer = userAnswer;
	}




	public void setComputerMessage(JTextArea computerMessage) {
		this.computerMessage = computerMessage;
	}
	public JTextArea getEndGame() {
		return endGame;
	}







	public void setEndGame(JTextArea endGame) {
		this.endGame = endGame;
	}


}

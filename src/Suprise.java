import java.util.ArrayList;

import javax.swing.JButton;

public class Suprise {
	
	private ArrayList<String> happyMessage = new ArrayList<String>();
	
	
	String first= "Hello, welcome to my calendar."
			+ "\nI have made some stuff for you."
			+ "\nI hope you will like it! PS!"
			+ "\nI am not pro. This is just 4 fun."
			+ "\nEnjoy - Have a nice day!!";
	String sec= "What to do, what to do? Well you can\n"
			+ "turn on the christmas music and relaxing\n"
			+ "With a cup of coffee;) - I will be back - kivi";
	String third= "Its Monday!!! Do you know what thats mean? New week\n"
			+ "new opportunities. Get out there and do something great\n"
			+ " for yourself!!!!! ";
	String fourth= "Today, I challenge you to smile at 3 strangers!\n"
			+ "Maybe you made them happy or you just creeped them out?";
	String fifth= " Watch the tedtalks with Shawn Achor - he talks\n"
			+ "about the happy secret to better work";
	String sixth= "Listen to \"Earth, Wind and Fire - September\",\n"
			+ "maybe you get happy and want to dance?";
	String seventh= "Think of 3 things that you are grateful for?\n"
			+ "It can be everything (what you ate today, did today etc.)";
	String eighth= "Well, some of you are wondering where I get my\n"
			+ "energy from? My secrets are: PEOPLE and LEARNING!!\n"
			+ "Lets learn something new today:DDD";
	String ninth = "Sometimes, I forget to thank the people who\n"
			+ "make my life so happy in so many ways. Sometimes,\n"
			+ "I forget to tell them how much I really do\n"
			+ "appreciate them for being an important part of my\n"
			+ "life. so thank YOU, all of you , just for being\n"
			+ "here for me!";
	String tenth= "Third Sunday in Advent, well what to do today? You\n"
			+ "can go out and enjoy the snow outside or say thank you\n"
			+ "to a friend? ";
	String eleventh= "U have standards! Remember dont plan to lower\n"
			+ "them for anybody.... including yourself ";
	String twelwth= "Random fact about kivi: I get sometimes hungover\n"
			+ "of just eating food which are high on sugar... Not good\n"
			+ "but you can eat some for me plz!";
	String thirtheenth= "What do you say to your crying sister? ----- Do you\n"
			+ "have a CRY SIS? :))))";
	String fourtheenth= "Listen to the song: Shakira - Try everything";
	String fiftheenth= "What is your plan for today? Are you planning on doing\n"
			+ "something fun? Or just stay at home and relax.\n"
			+ "Remember to take care of yourself!";
	String sixteenth= "There are so many beautiful reasons to be happy...\n"
			+ "can you think of three?";
	String seventeenth= " Last sunday in advent, remember to light 4 candle lights today.\n"
			+ "Make some hot cocoa and eat some gingerbreads. XoXo from your kivi";
	String eighteenth= "All I want for Christmas is _ _  _ _  _ _ _ _!!\n"
			+ "I challenge you to send a wish to someone special!";
	String nineteenth= "Friends make the Good times Better and the HARD times Easier!";
	String twenth= "Knock, Knock!\n"
			+ "- Who's there?\n"
			+ "Cows go.\n"
			+ "Cow go who?\n"
			+ "No, Silly.\nCows go MOOO!";
	String twentyFirst= "Hi, I hear you're good at algebra.....Will you replace\n"
			+ "my eX without asking Y?";
	String twentySecond= " If Al Gore tried his hand as a musician, what would his\n"
			+ "album be called? Algorithms.";
	String twentyThird= "One day left, are you excited? - The key to being happy is knowing\n"
			+ "you have the power to choose what to accept and what to let go";
	String twentyFourth= " Merry Christmas, I kivi wish you the best and remember\n"
			+ "to be grateful and have fun today! You deserve it!"; //kanskje legge til en film her eller noe
	
	public Suprise(){
		happyMessage.add(first);
		happyMessage.add(sec);
		happyMessage.add(third);
		happyMessage.add(fourth);
		happyMessage.add(fifth);
		happyMessage.add(sixth);
		happyMessage.add(seventh);
		happyMessage.add(eighth);
		happyMessage.add(ninth);
		happyMessage.add(tenth);
		happyMessage.add(eleventh);
		happyMessage.add(twelwth);
		happyMessage.add(thirtheenth);
		happyMessage.add(fourtheenth);
		happyMessage.add(fiftheenth);
		happyMessage.add(sixteenth);
		happyMessage.add(seventeenth);
		happyMessage.add(eighteenth);
		happyMessage.add(nineteenth);
		happyMessage.add(twenth);
		happyMessage.add(twentyFirst);
		happyMessage.add(twentySecond);
		happyMessage.add(twentyThird);
		happyMessage.add(twentyFourth);
	}
	
	public String getHappyMessage(int i){
		return happyMessage.get(i);
	}

}

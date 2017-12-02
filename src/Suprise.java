import java.util.ArrayList;

import javax.swing.JButton;

public class Suprise {
	
	ArrayList<String> happyMessage = new ArrayList<String>();
	
	String first= "Hello, welcome to my calendar. I have made some stuff to try to suprise you or cheer you up through this stressful time period";
	String sec= "What to do, what to do? Well you can start playing christmas music and just take a cup of coffee and relax ;) - I will be back - kivi";
	String third= "Its Monday people! Do you know what that means? New week new opportunities. Get out there and do something great for yourself!!!!! ";
	String fourth= "Today, I challenge you to smile at 3 strangers! Maybe you made them happy or you just creeped them out?";
	String fifth= " Watch the tedtalks with Shawn Achor - he talks about the happy secret to better work";
	String sixth= "Listen to \"Earth, Wind and Fire - September\", maybe you get happy and want to dance?";
	String seventh= "Think of 3 things that you are grateful for? It can be everything (what you ate today, did today, your parents etc.)";
	String eighth= "Well, some of you are wondering where I get my energy from? My secrets are: PEOPLE and LEARNING!! Lets learn something today:DDD";
	String ninth = "Sometimes, I forget to thank the people who make my life so happy in so many ways. Sometimes, I forget to tell them how much I really "
			+ "do appreciate them for being an important part of my life. so thank YOU, all of you , just for being here for me!";
	String tenth= "Third Sunday in Advent, well what to do today? You can go out and enjoy the snow outside or say thank you to a friend? ";
	String eleventh= "U have standards! Remember dont plan to lower them for anybody.... including yourself ";
	String twelwth= "Random fact about kivi: I get sometimes hungover of just eating food which are high on sugar... Not good but you can eat some for me plz!";
	String thirtheenth= "What do you say to your crying sister? ----- Do you have a CRY SIS? :))))";
	String fourtheenth= "Listen to the song: Shakira - Try everything";
	String fiftheenth= "What is your plan for today? Are you planning on doing something fun? Or just stay at home and relax - all things are legit. Remember to take care of yourself!";
	String sixteenth= "There are so many beautiful reasons to be happy... can you think of three?";
	String seventeenth= " Last sunday in advent, remember to light 4 candle lights today. Make some hot cocoa and eat some gingerbreads. XoXo from your kivi";
	String eighteenth= "All I want for Christmas is _ _  _ _  _ _ _ _!! I challenge you to send a wish to someone special!";
	String nineteenth= "Friends make the Good times Better and the HARD times Easier!";
	String twenth= "Knock, Knock! - Who's there? - Cows go. - Cow go who? - No, Silly. Cows go MOOO!";
	String twentyFirst= "Hi, I hear you're good at algebra.....Will you replace my eX without asking Y?";
	String twentySecond= " If Al Gore tried his hand as a musician, what would his album be called? Algorithms.";
	String twentyThird= "One day left, are you excited? - The key to being happy is knowing you have the power to choose what to accept and what to let go";
	String twentyFourth= " Merry Christmas, I kivi wish you the best and remember to be grateful and have fun today! You deserve it!"; //kanskje legge til en film her eller noe
	
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

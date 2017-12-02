import java.util.ArrayList;

import javax.swing.JButton;

public class DayButton {
	
	
	private JButton button1 = new JButton("1st Dec");
	private JButton button2 = new JButton("2nd Dec");
	private JButton button3 = new JButton("3rd Dec");
	private JButton button4 = new JButton("4th Dec");
	private JButton button5 = new JButton("5th Dec");
	private JButton button6 = new JButton("6th Dec");
	private JButton button7 = new JButton("7th Dec");
	private JButton button8 = new JButton("8th Dec");
	private JButton button9 = new JButton("9th Dec");
	private JButton button10 = new JButton("10th Dec");
	private JButton button11 = new JButton("11th Dec");
	private JButton button12 = new JButton("12th Dec");
	private JButton button13 = new JButton("13th Dec");
	private JButton button14 = new JButton("14th Dec");
	private JButton button15 = new JButton("15th Dec");
	private JButton button16 = new JButton("16th Dec");
	private JButton button17 = new JButton("17th Dec");
	private JButton button18 = new JButton("18th Dec");
	private JButton button19 = new JButton("19th Dec");
	private JButton button20 = new JButton("20th Dec");
	private JButton button21 = new JButton("21st Dec");
	private JButton button22 = new JButton("22nd Dec");
	private JButton button23 = new JButton("23rd Dec");
	private JButton button24 = new JButton("24th Dec");
	
	ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	public DayButton(){
		buttons.add(button1);
		buttons.add(button2);
		buttons.add(button3);
		buttons.add(button4);
		buttons.add(button5);
		buttons.add(button6);
		buttons.add(button7);
		buttons.add(button8);
		buttons.add(button9);
		buttons.add(button10);
		buttons.add(button11);
		buttons.add(button12);
		buttons.add(button13);
		buttons.add(button14);
		buttons.add(button15);
		buttons.add(button16);
		buttons.add(button17);
		buttons.add(button18);
		buttons.add(button19);
		buttons.add(button20);
		buttons.add(button21);
		buttons.add(button22);
		buttons.add(button23);
		buttons.add(button24);
	}
	
	public JButton getButton(int i){
		return buttons.get(i);
	}
	
}

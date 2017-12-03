
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
/**
 * @author Kv1402
 *
 */
	public class Console extends JFrame {
	
		static int helpCount;
		//creating a DayButton instance with arrays 
		DayButton buttons = new DayButton();
		Suprise messages = new Suprise();
		
		public Console(){
			super("Kivi's Christmas Calender");
		//create new panel with GridBagLayout manager
		JPanel newPanel = new JPanel(new GridBagLayout());
		
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.anchor = GridBagConstraints.WEST;
		constraints.insets = new Insets(10, 10,10, 10);
		
		//add the buttons
		int count=0;
		for (int i=0; i<4; i++){
			for(int j=0; j<6; j++){
				constraints.gridy = i;
				constraints.gridx = j;
				newPanel.add(buttons.getButton(count),constraints);
				//listen to button and check it its click then display
				buttons.getButton(count).addActionListener( new ActionListener(){
						public void actionPerformed(ActionEvent e) {
							if(("1st Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(0));
							}else if(("2nd Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(1));
							}else if(("3rd Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(2));
							}else if(("4th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(3));
							}else if(("5th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(4));
							}else if(("6th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(5));
							}else if(("7th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(6));
							}else if(("8th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(7));
							}else if(("9th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(8));
							}else if(("10th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(9));
							}else if(("11th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(10));
							}else if(("12th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(11));
							}else if(("13th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(12));
							}else if(("14th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(13));
							}else if(("15th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(14));
							}else if(("16th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(15));
							}else if(("17th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(16));
							}else if(("18th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(17));
							}else if(("19th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(18));
							}else if(("20th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(19));
							}else if(("21st Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(20));
							}else if(("22nd Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(21));
							}else if(("23rd Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(22));
							}else if(("24th Dec").equals(e.getActionCommand())){
								System.out.println(messages.getHappyMessage(23));
							}
						}
					});
				count++;
			}
		} 
		
		//set border for the panel
		newPanel.setBorder(BorderFactory.createTitledBorder(
			BorderFactory.createEtchedBorder(), "Calender"));
	
		//add the panel to the frame
		add(newPanel);
		pack();
		setLocationRelativeTo(null);
	
	}

		public static void main(String args[]){
		// set look and feel to the system look and feel
			try{
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception ex){
				ex.printStackTrace();
			}
			
			SwingUtilities.invokeLater(new Runnable(){
				public void run(){
					new Console().setVisible(true);
				}
			});
		}
	
}

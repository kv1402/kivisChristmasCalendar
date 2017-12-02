
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
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

	//lager button array som hentes fra klassen DayButton
	DayButton buttons = new DayButton();
	
	public Console(){
		super("Kivi's Christmas Calender");
		
	//createa new panel with GridBagLayout manager
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

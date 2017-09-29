package requirementX;

import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;

public class Panel1 extends JPanel {

	private static final long serialVersionUID = 1L;
	private JPanel introductionPanel;
	private JPanel explenationPanel;
	private JTextField dataSelected;
	private JTextField countdown;
	private JTextField grabbingData;
	
	private String selectedData; //this is never initialised or set as anything so it will always be null?????

	
	public Panel1() {	
	//setLayout(new GridLayout(5, 1));
    setLayout(new BorderLayout());
		
    add(introductionPanel(), BorderLayout.NORTH);
    add(dataSelected(), BorderLayout.CENTER);
    add(explanationPanel(), BorderLayout.SOUTH);
}

	
/**
* This method creates the introduction panel which welcomes 
* the user to the program. 		
* @return
*/
	private JPanel introductionPanel() {	
			introductionPanel = new JPanel(new GridLayout(3, 1));
//The introductionPanel has three JTextFields where the message to the user is written.
//This introduction need the Ripley method thing!!!!!!!!!!!!!!
			JTextField textField1 = new JTextField("Welcome to");
			JTextField textField2 = new JTextField("Please use the dates above to select a time period, ");
			JTextField textField3 = new JTextField("in order to begin analysing UFO sighting data");		
//The TextFields are set to be centred.		
		    textField1.setHorizontalAlignment(JTextField.CENTER);
		    textField2.setHorizontalAlignment(JTextField.CENTER);
		    textField3.setHorizontalAlignment(JTextField.CENTER);
//The background colour is set to be the same as the frame.	    
		    textField1.setBackground(null);
		    textField2.setBackground(null);
		    textField3.setBackground(null);
//The visible borders around the textFields are removed.    
		    textField1.setBorder(null);
		    textField2.setBorder(null);
		    textField3.setBorder(null);
			introductionPanel.add(textField1);
			introductionPanel.add(textField2);
			introductionPanel.add(textField3);
			return introductionPanel;
	}
	
/**
* This method creates a panel which encourages the user to start utilising
* the program.		
* @return
*/
	
	private JPanel explanationPanel() {
//The object of the Font class allows us to define our own style for the text.	
		Font font = new Font("BoldText", Font.BOLD, 12);			
		explenationPanel = new JPanel(new GridLayout(2, 1));
		JTextField textField1 = new JTextField("Please now interact with this data using the ");
		JTextField textField2 = new JTextField("buttons to the left and the right.");		    
//We set the text to be in our custom style.			
		textField1.setFont(font);
		textField2.setFont(font);
//The textfields are set to be centred.			
		textField1.setHorizontalAlignment(JTextField.CENTER);
	    textField2.setHorizontalAlignment(JTextField.CENTER);
//The background is set to be the same as the frame.
        textField1.setBackground(null);
	    textField2.setBackground(null);
//The visible borders are removed.		    
	    textField1.setBorder(null);
	    textField2.setBorder(null);	    
	    explenationPanel.add(textField1);
	    explenationPanel.add(textField2);		    
	    return explenationPanel;
	}


/**
* This method creates a textField which shows the time period the user has selected.		
* @return
*/
	private JTextField dataSelected() {
		dataSelected = new JTextField("You have selected the data from this period: " + selectedData);
		dataSelected.setHorizontalAlignment(JTextField.CENTER);
		dataSelected.setBackground(null);
		dataSelected.setBorder(null);
		
		return dataSelected;
	}

}

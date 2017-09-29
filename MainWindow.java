package requirementX;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

import requirementX.Panel1;
import requirementX.Statistics;

public class MainWindow extends JFrame {

	private int i; //used to represent an index in the ArrayList of panels in initWidgits and the actionlistener inner classes
	
	/**
	 * The constructor calls initWidgits()
	 */
	public MainWindow(){
		
		initWidgits();
		
	}
	
	private void initWidgits(){
		
		//ArrayList will be used to represent the JPanels that the buttons navigate through
		ArrayList<JPanel> panels = new ArrayList<JPanel>();
		
		//a new object of Panel1 is created
		Panel1 panel1 = new Panel1();
		//a new object of Statistics is created
		Statistics stats = new Statistics();
		
		//panel1 and stats are added to panels
		panels.add(panel1);
		panels.add(stats);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//i is initialised as 0
		i =0;
		
		//layout is made into a BorderLayout
		getContentPane().setLayout(new BorderLayout());
		
		//new JPanels are created
		
		JPanel jpCenter = new JPanel();
		JPanel jpWest= new JPanel();
		JPanel jpEast= new JPanel();
		JPanel jpSouth = new JPanel();

		//should be comboboxes
		JSpinner jsFrom = new JSpinner(new SpinnerDateModel());
		JSpinner jsTo = new JSpinner(new SpinnerDateModel());
		
		//trying to implement a combobox
		//String[] dateStrings = { "01/4/1944", "02/3/1987", "12/3/1973", "16/5/1999", "11/11/2011" };
		//JComboBox dateList = new JComboBox(dateStrings);
		//dateList.setSelectedIndex(4);
		//dateList.addActionListener(new ActionListener();
		
	
		
		/*dateList.addActionListener(new ActionListener()) {
 
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//get selected text from the combo box
				//compare the year (subtract)
				//ensure the date range is fine
					//else output error message. In dialogue. 
				
			}
		}*/

		jpCenter.setLayout(new BorderLayout());

		
		//jbLeft represents the button that makes the left panel appear
		JButton jbLeft = new JButton("<");

		jbLeft.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//this should check if there is a left panel
				//check validity of i
				//if so go to it
				//else don't
				jbLeft.addActionListener(this);
				if (i>0)	{
					i--;
					//jpCenter.add(((Panel1)panels.get(i)).getPanel());
					jpCenter.remove(panels.get(i+1));
					jpCenter.add(panels.get(i), BorderLayout.CENTER);
					System.out.println("Error check-left");
					pack();
				}
				
				
			}
		});
		JButton jbRight = new JButton(">");
		jbRight.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { 
				//this should check if there is a right panel
				//if so go to it
				//else don't
				jbRight.addActionListener(this);
				//check validity of i 
				if (panels.size()!=(i+1))	{
					i++;
					//jpCenter.add(((Panel1)panels.get(i)).getPanel());
					jpCenter.remove(panels.get(i-1));
					jpCenter.add(panels.get(i), BorderLayout.CENTER);
					//jpCenter=panels.get(i);
					System.out.println("Error check-right");
					
					pack();
				}
				
				
		
			
				
			}
		});


		jpCenter.add(panels.get(i));
		
		//buttons are added to the correct panels-ARE THEY? IS IT IN WEST/EAST PANEL OR IN SOUTH???????
		jpWest.add(jbLeft);
		jpEast.add(jbRight); 
		
		//jpNorth is added to the north etc.

		getContentPane().add(initNorth(), BorderLayout.NORTH);
		getContentPane().add(jpSouth, BorderLayout.SOUTH);
		getContentPane().add(jpEast, BorderLayout.EAST);
		getContentPane().add(jpWest, BorderLayout.WEST);
		getContentPane().add(jpCenter, BorderLayout.CENTER);

		
		jpSouth.add(jbLeft);
	
		JLabel jlLastSeen = new JLabel ("Last set of reported incidents: ");
		jpSouth.add(jlLastSeen);

		jpSouth.add(jbRight);

		
		pack();
		
	}
	
	private JPanel initNorth(){
		JPanel jpNorth = new JPanel();
		//jpNorth is given a FlowLayout
		jpNorth.setLayout(new FlowLayout(FlowLayout.RIGHT)); //is it supposed to be right or center? it loos weird when its to the right
		//a new JLlabel is added to the jpNorth
				jpNorth.add(new JLabel("From:"));

				//should be comboboxes?
				JSpinner jsFrom = new JSpinner(new SpinnerDateModel());
				JSpinner jsTo = new JSpinner(new SpinnerDateModel());
				
				//trying to implement a combobox-DO NOT DELETE THE COMMENTED OUT LINES!!!!
				//String[] dateStrings = { "01/4/1944", "02/3/1987", "12/3/1973", "16/5/1999", "11/11/2011" };
				//JComboBox dateList = new JComboBox(dateStrings);
				//JComboBox<Date> dateList = new JComboBox<Date>();
				//dateList.setSelectedIndex(4);
				/*dateList.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						//VALIDITY CHECK FOR TO/FROM EVENTUALLY
						
						
				
					
						
					}
				});
				jpNorth.add(dateList);*/
				jpNorth.add(jsFrom);
				
				//a new JLabel is added to jp North
				jpNorth.add(new JLabel("To:"));
				
				jpNorth.add(jsTo);
		return jpNorth;
	}
	 
	public static void main (String [] args){
	MainWindow thisFrame = new MainWindow();
		thisFrame.setVisible(true);
	}
}

/**
 * 
 */
package requirementX;

import java.awt.BorderLayout;
import java.awt.GridLayout;

/**
 * @authors Miriam Tamara Grodeland Aarag.
 *		Florence Anyakwo.
 *		Sharon Mazor.
 *		Funke Sowole.
 *
 */


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


//ideas for class:
/*
 * 1. maybe instead of having 4 separate methods for intialising JPanels, have 1 that takes a JPanel in and returns the updated version?
 * 2. figure out how to access the JLabels - maybe through creating fields?
 * 3. action listeners for buttons need to be created -controllers? could be accessible from mainwindow too possibly
 * 4. MVC needs to be held so talk to group about that
 * 5. where are the stats coming from?
 * 6. talk to group about which stat we should do?
 * 7. arraylist for panels (one for hoaxes, one for outside us etc.)
 * 8. topleft will be equal to the other panell after checking other 3 first
 * 
 * Changes made to panel1 by me:
 * 1. changed spelling of explanation
 * 2. added a question on selectedData: this is never initialised or set as anything so it will always be null?????
 * 
 * Problems with mainwindow:
 * 1. where do the buttons need to go? west and east or south (in which case why do i need west/east?)
 * 2. JSpinners or comboboxes in north?
 * 3. north has to be centered or aligned right?
 */

public class Statistics extends JPanel{
	
	private JPanel jpHoaxes;
	
	/**
	 * The contructor initialises the panel
	 */
	public Statistics(){
		
		//layout is set as a grid of 2 rows and 2 columns
		setLayout(new GridLayout(2,2));

		initHoaxes();
		//The 4 stat boxes are intialised and added to the panel
		add(initTopLeft());
		add(initTopRight());
		add(initBottomLeft());
		add(initBottomRight());
		//add(jpHoaxes); added just to check. should NOT have 5 boxes
		
	}
	
	private void initHoaxes(){ //actually should it be another panel or since only the title and center need to change just update those whenever it reaches it?
		//however if i am doing arraylist then it'll have to be an arraylist of either jpanel or jlabels so have either jpHoaxes or jlHoaxes (for the center and do setText for title? or even do setTxt for both and have an arraylist of possible stats names and set title by that and call an appropriate method for center.
		jpHoaxes = new JPanel();
		//title is created
		JLabel jlTitleTL=new JLabel("Hoaxes", SwingConstants.CENTER);

		jpHoaxes.setLayout(new BorderLayout());
		jpHoaxes.add(jlTitleTL, BorderLayout.NORTH);
		JButton jbBack =new JButton("<");
		jpHoaxes.add(jbBack, BorderLayout.WEST);
		JButton jbForward =new JButton(">");
		jpHoaxes.add(jbForward, BorderLayout.EAST);
		JLabel jlCenter = new JLabel("this will have to be worked out somehow?", SwingConstants.CENTER);
		jpHoaxes.add(jlCenter, BorderLayout.CENTER);	
		
	}
	
/**
 * This returns the top left stat box
 * @return jpTopLeft: The top left stat box
 */
	private JPanel initTopLeft(){
		
		//panel is created
		JPanel jpTopLeft=new JPanel();
		//title is created
		JLabel jlTitleTL=new JLabel("remember to change this to actual title1", SwingConstants.CENTER);

		jpTopLeft.setLayout(new BorderLayout());
		jpTopLeft.add(jlTitleTL, BorderLayout.NORTH);
		JButton jbBack1 =new JButton("<");
		jpTopLeft.add(jbBack1, BorderLayout.WEST);
		JButton jbForward1 =new JButton(">");
		jpTopLeft.add(jbForward1, BorderLayout.EAST);

		JLabel jlCenter1 = new JLabel("check1", SwingConstants.CENTER);
		
		jpTopLeft.add(jlCenter1, BorderLayout.CENTER);
		return jpTopLeft;
		
	}
	

	private JPanel initTopRight(){
		
		JPanel jpTopRight=new JPanel(); //new panel created to represent the top right stat box
		
		JLabel jlTitleTR=new JLabel("remember to change this to actual title2", SwingConstants.CENTER); //represents the stat title, centralised text
		
		jpTopRight.setLayout(new BorderLayout());
		jpTopRight.add(jlTitleTR, BorderLayout.NORTH);
		
		JButton jbBack2 =new JButton("<");
		jpTopRight.add(jbBack2, BorderLayout.WEST);
		
		JButton jbForward2 =new JButton(">");
		jpTopRight.add(jbForward2, BorderLayout.EAST);
		
	
		JLabel jlCenter2 = new JLabel("check2", SwingConstants.CENTER);
	
		jpTopRight.add(jlCenter2, BorderLayout.CENTER);
		
		return jpTopRight;
	}
	
	private JPanel initBottomLeft(){
		
		JPanel jpBottomLeft=new JPanel();
		
		JLabel jlTitleBL=new JLabel("remember to change this to actual title3", SwingConstants.CENTER);
		jpBottomLeft.setLayout(new BorderLayout());
		jpBottomLeft.add(jlTitleBL, BorderLayout.NORTH);
		
		JButton jbBack3 =new JButton("<");
		jpBottomLeft.add(jbBack3, BorderLayout.WEST);
		
		JButton jbForward3 =new JButton(">");
		
		jpBottomLeft.add(jbForward3, BorderLayout.EAST);
	
		JLabel jlCenter3 = new JLabel("check3", SwingConstants.CENTER);

		jpBottomLeft.add(jlCenter3, BorderLayout.CENTER);
	
		
		return jpBottomLeft;
	}

	private JPanel initBottomRight(){
		
		JPanel jpBottomRight=new JPanel();
		
		JLabel jlTitleBR=new JLabel("remember to change this to actual title4", SwingConstants.CENTER);
		
		jpBottomRight.setLayout(new BorderLayout());
		jpBottomRight.add(jlTitleBR, BorderLayout.NORTH);
		
		JButton jbBack4 =new JButton("<");
		jpBottomRight.add(jbBack4, BorderLayout.WEST);
		
		JButton jbForward4 =new JButton(">");
	
		jpBottomRight.add(jbForward4, BorderLayout.EAST);
		
		JLabel jlCenter4 = new JLabel("check4", SwingConstants.CENTER);
		
		jpBottomRight.add(jlCenter4, BorderLayout.CENTER);
	
		return jpBottomRight;
	}
	
	public static void main (String[] args){
		
		JFrame jf = new JFrame();
		Statistics stat = new Statistics();
		jf.add(stat);
		jf.pack();
		jf.setVisible(true);
	}
}

/**
 * 
 */
package requirementX.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

/**
 * @author ukmsh
 *
 */
public class LeftStat implements ActionListener { //might be easier to do an inner class like in mainwindow

 //need to decide in Statistics whether it will have an arraylist of JPanels, JLabels or Strings. Change Object to whatever i decide later
//or even a treemap of whatever i gave above to position so that i can get position and the index can increase	to get the next object???
	private ArrayList<Object> stats;
	private JPanel jpTL;
	private JPanel jpTR;
	private JPanel jpBL;
	private JPanel jpBR;
	/**
	 * will hape to tke in and assign the 4 main panels as well so that they can be compared so no two stats are the same on the screen
	 * problem is that its pass by value not reference???
	 */
	public LeftStat(ArrayList<Object> stats) { //need to decide in stats whether it will have an arraylist of JPanels, JLabels or Strings
		// TODO Auto-generated constructor stub
		this.stats=stats;
		
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

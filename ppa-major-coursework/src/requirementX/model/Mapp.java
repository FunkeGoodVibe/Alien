/**
 * 
 */
package requirementX;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import requirementX.model.ListOfSightings;
import requirementX.model.Model;
import api.ripley.Incident;
/**
 * @author florence
 *
 */
import api.ripley.Ripley;

public class Mapp extends JPanel{
	Ripley ripley1 = new Ripley("90tLI3CStdmyVD6ql2OMtA==","lBgm4pRs8QnVqL46EnH7ew==");
	JPanel image;
	private Model model;
	ImageIcon mainImage;
	private BufferedImage map;
	private BufferedImage imageGraphic;
	private ListOfSightings los;
	private JList<String> listSight;
	JLabel label1;

	private JList<Incident> jlSingleIncidentList;   //the JList of single incidents
	private JComboBox<String> losStrings;
	private JPanel orderIncidentsByPanel;
	private JFrame orderIncidentsFrame;
	
	public Mapp(Model model, ListOfSightings los) {
		
		this.model = model;
		this.los = los;
		
		try{
			map = ImageIO.read(new File("src/map of us.png"));
		}catch (IOException e)
		{		e.printStackTrace();
		System.out.println("no image");
		}
		try{
			imageGraphic = ImageIO.read(new File("src/ufographic.png"));
		}catch (IOException e){
			e.printStackTrace();
			System.out.println("got image");
		}
		
		stuff();

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(map, 0, 0, 500, 600, null);

		System.out.println("1");

		for ( Entry<String, Integer> state : model.getStates().entrySet() ) {
			if (state.getKey().equals("WA") && state.getValue()<50){
				g.drawImage(imageGraphic, 40,35, 15, 25, null, null);
			}
			else if (state.getKey().equals("WA") && state.getValue()>100){
				g.drawImage(imageGraphic, 40,35, 35, 30, null, null);
			}
			if (state.getKey().equals("MT") && state.getValue()<50){
				g.drawImage(imageGraphic, 110,60, 15, 25, null, null);
			}
			else if (state.getKey().equals("MT") && state.getValue()>100){
				g.drawImage(imageGraphic, 110,60, 35, 30, null, null);
			}
			if (state.getKey().equals("ND") && state.getValue()<50){
				g.drawImage(imageGraphic, 180,80, 15, 25, null, null);
			}
			else if (state.getKey().equals("ND") && state.getValue()>100){
				g.drawImage(imageGraphic, 180,80, 35, 30, null, null);
			}
			if (state.getKey().equals("MN") && state.getValue()<50){
				g.drawImage(imageGraphic, 230,100, 15, 25, null, null);
			}
			else if (state.getKey().equals("MN") && state.getValue()>100){
				g.drawImage(imageGraphic, 230,100, 35, 30, null, null);
			}
			if (state.getKey().equals("WI") && state.getValue()<50){
				g.drawImage(imageGraphic, 270, 135, 15, 25, null, null);
			}
			else if (state.getKey().equals("WI") && state.getValue()>100){
				g.drawImage(imageGraphic, 270, 135, 35, 30, null, null);
			}
			if (state.getKey().equals("MI") && state.getValue()<50){
				g.drawImage(imageGraphic, 315, 150, 15, 25, null, null);
			}
			else if (state.getKey().equals("MI") && state.getValue()>100){
				g.drawImage(imageGraphic, 315, 150, 35, 30, null, null);
			}
			if (state.getKey().equals("NY") && state.getValue()<50){
				g.drawImage(imageGraphic, 380, 140, 15, 25, null, null);
			}
			else if (state.getKey().equals("NY") && state.getValue()>100){
				g.drawImage(imageGraphic, 380, 140, 35, 30, null, null);
			}
			if (state.getKey().equals("ME") && state.getValue()<50){
				g.drawImage(imageGraphic, 420, 55, 15, 25, null, null);
			}
			else if (state.getKey().equals("ME") && state.getValue()>100){
				g.drawImage(imageGraphic,420, 55, 35, 25, null, null);
			}
			if (state.getKey().equals("NH") && state.getValue()<50){
				g.drawImage(imageGraphic, 370, 66, 15, 25, null, null);
			}
			else if (state.getKey().equals("NH") && state.getValue()>100){
				g.drawImage(imageGraphic,370, 66, 35, 30, null, null);
			}
			if (state.getKey().equals("ID") && state.getValue()<50){
				g.drawImage(imageGraphic, 70, 140, 15, 25, null, null);
			}
			else if (state.getKey().equals("ID") && state.getValue()>100){
				g.drawImage(imageGraphic,70, 140, 35, 30, null, null);
			}
			if (state.getKey().equals("OR") && state.getValue()<50){
				g.drawImage(imageGraphic, 30, 115, 15, 25, null, null);
			}
			else if (state.getKey().equals("OR") && state.getValue()>100){
				g.drawImage(imageGraphic,30, 115, 35, 30, null, null);
			}
			if (state.getKey().equals("WY") && state.getValue()<50){
				g.drawImage(imageGraphic, 130, 150, 15, 25, null, null);
			}
			else if (state.getKey().equals("WY") && state.getValue()>100){
				g.drawImage(imageGraphic, 130, 150, 35, 30, null, null);
			}
			if (state.getKey().equals("SD") && state.getValue()<50){
				g.drawImage(imageGraphic, 190, 150, 15, 25, null, null);
			}
			else if (state.getKey().equals("SD") && state.getValue()>100){
				g.drawImage(imageGraphic,190, 150, 35, 30, null, null);
			}
			if (state.getKey().equals("NE") && state.getValue()<50){
				g.drawImage(imageGraphic, 190, 208, 15, 25, null, null);
			}
			else if (state.getKey().equals("NE") && state.getValue()>100){
				g.drawImage(imageGraphic,190, 208, 35, 30, null, null);
			}
			if (state.getKey().equals("IA") && state.getValue()<50){
				g.drawImage(imageGraphic, 245, 200, 15, 25, null, null);
			}
			else if (state.getKey().equals("IA") && state.getValue()>100){
				g.drawImage(imageGraphic,245, 200, 35, 30, null, null);
			}
			if (state.getKey().equals("IL") && state.getValue()<50){
				g.drawImage(imageGraphic, 275, 220, 15, 25, null, null);
			}
			else if (state.getKey().equals("IL") && state.getValue()>100){
				g.drawImage(imageGraphic,275, 220, 35, 30, null, null);
			}
			if (state.getKey().equals("IN") && state.getValue()<50){
				g.drawImage(imageGraphic, 295, 220, 15, 25, null, null);
			}
			else if (state.getKey().equals("IN") && state.getValue()>100){
				g.drawImage(imageGraphic,295, 220, 35, 30, null, null);
			}
			if (state.getKey().equals("OH") && state.getValue()<50){
				g.drawImage(imageGraphic, 325, 220, 15, 25, null, null);
			}
			else if (state.getKey().equals("OH") && state.getValue()>100){
				g.drawImage(imageGraphic,325, 220, 35, 30, null, null);
			}
			if (state.getKey().equals("PA") && state.getValue()<50){
				g.drawImage(imageGraphic, 375, 190, 15, 25, null, null);
			}
			else if (state.getKey().equals("PA") && state.getValue()>100){
				g.drawImage(imageGraphic,375, 190, 35, 30, null, null);
			}
			
			//THERE IS 'CA' HERE. (20,250,15,25) 
			if (state.getKey().equals("CA") && state.getValue()<50){
				g.drawImage(imageGraphic, 20, 250, 15, 25, null, null);
			}
			else if (state.getKey().equals("CA") && state.getValue()>100){
				g.drawImage(imageGraphic,20, 250, 35, 30, null, null);
			}
			if (state.getKey().equals("NV") && state.getValue()<50){
				g.drawImage(imageGraphic, 54, 225, 15, 25, null, null);
			}
			else if (state.getKey().equals("NV") && state.getValue()>100){
				g.drawImage(imageGraphic,54, 225, 35, 30, null, null);
			}
			if (state.getKey().equals("UT") && state.getValue()<50){
				g.drawImage(imageGraphic, 94, 225, 35, 40, null, null);
			}
			else if (state.getKey().equals("UT") && state.getValue()>100){
				g.drawImage(imageGraphic,94, 225, 35, 30, null, null);
			}
			if (state.getKey().equals("CO") && state.getValue()<50){
				g.drawImage(imageGraphic, 140, 245, 15, 25, null, null);
			}
			else if (state.getKey().equals("CO") && state.getValue()>100){
				g.drawImage(imageGraphic,140, 245, 35, 30, null, null);
			}
			if (state.getKey().equals("KS") && state.getValue()<50){
				g.drawImage(imageGraphic, 200, 270, 15, 25, null, null);
			}
			else if (state.getKey().equals("KS") && state.getValue()>100){
				g.drawImage(imageGraphic,200, 270, 35, 30, null, null);
			}
			if (state.getKey().equals("MO") && state.getValue()<50){
				g.drawImage(imageGraphic,  250, 270, 15, 25, null, null);
			}
			else if (state.getKey().equals("MO") && state.getValue()>100){
				g.drawImage(imageGraphic, 250, 270, 35, 30, null, null);
			}
			if (state.getKey().equals("KY") && state.getValue()<50){
				g.drawImage(imageGraphic, 320, 285, 15, 25, null, null);
			}
			else if (state.getKey().equals("KY") && state.getValue()>100){
				g.drawImage(imageGraphic,320, 285, 35, 30, null, null);
			}
			if (state.getKey().equals("WV") && state.getValue()<50){
				g.drawImage(imageGraphic, 351, 245, 15, 25, null, null);
			}
			else if (state.getKey().equals("WV") && state.getValue()>100){
				g.drawImage(imageGraphic,351, 245, 35, 30, null, null);
			}
			if (state.getKey().equals("VA") && state.getValue()<50){
				g.drawImage(imageGraphic,  370, 265, 15, 25, null, null);
			}
			else if (state.getKey().equals("VA") && state.getValue()>100){
				g.drawImage(imageGraphic, 370, 265, 35, 30, null, null);
			}
			if (state.getKey().equals("NC") && state.getValue()<50){
				g.drawImage(imageGraphic, 360, 305, 15, 25, null, null);
			}
			else if (state.getKey().equals("NC") && state.getValue()>100){
				g.drawImage(imageGraphic,360, 305, 35, 30, null, null);
			}
			if (state.getKey().equals("TN") && state.getValue()<50){
				g.drawImage(imageGraphic, 300, 320, 15, 25, null, null);
			}
			else if (state.getKey().equals("TN") && state.getValue()>100){
				g.drawImage(imageGraphic,300, 320, 35, 30, null, null);
			}
			if (state.getKey().equals("AR") && state.getValue()<50){
				g.drawImage(imageGraphic, 255, 350, 15, 25, null, null);
			}
			else if (state.getKey().equals("AR") && state.getValue()>100){
				g.drawImage(imageGraphic,255, 350, 35, 25, null, null);
			}
			if (state.getKey().equals("OK") && state.getValue()<50){
				g.drawImage(imageGraphic, 215, 348, 15, 25, null, null);
			}
			else if (state.getKey().equals("OK") && state.getValue()>100){
				g.drawImage(imageGraphic,215, 348, 35, 30, null, null);
			}
			if (state.getKey().equals("TX") && state.getValue()<50){
				g.drawImage(imageGraphic, 195, 425, 15, 25, null, null);
			}
			else if (state.getKey().equals("TX") && state.getValue()>100){
				g.drawImage(imageGraphic,195, 425, 35, 30, null, null);
			}
			if (state.getKey().equals("NM") && state.getValue()<50){
				g.drawImage(imageGraphic, 135, 360, 15, 25, null, null);
			}
			else if (state.getKey().equals("NM") && state.getValue()>100){
				g.drawImage(imageGraphic,135, 360, 35, 30, null, null);
			}
			if (state.getKey().equals("AZ") && state.getValue()<50){
				g.drawImage(imageGraphic, 80, 345, 15, 25, null, null);
			}
			else if (state.getKey().equals("AZ") && state.getValue()>100){
				g.drawImage(imageGraphic,80, 345, 35, 30, null, null);
			}
			//ANOTHER 'CA' HERE---------------(20,255,15,25)
			if (state.getKey().equals("CA") && state.getValue()<50){
				g.drawImage(imageGraphic, 20, 255, 15, 25, null, null);
			}
			else if (state.getKey().equals("CA") && state.getValue()>100){
				g.drawImage(imageGraphic,20, 255, 35, 30, null, null);
			}
			if (state.getKey().equals("AK") && state.getValue()<50){
				g.drawImage(imageGraphic, 40, 470, 15, 25, null, null);
			}
			else if (state.getKey().equals("AK") && state.getValue()>100){
				g.drawImage(imageGraphic,40, 470, 35, 30, null, null);
			}
			if (state.getKey().equals("FL") && state.getValue()<50){
				g.drawImage(imageGraphic, 340, 465, 15, 25, null, null);
			}
			else if (state.getKey().equals("FL") && state.getValue()>100){
				g.drawImage(imageGraphic,340, 465, 35, 30, null, null);
			}
			if (state.getKey().equals("GA") && state.getValue()<50){
				g.drawImage(imageGraphic, 340, 395, 15, 25, null, null);
			}
			else if (state.getKey().equals("GA") && state.getValue()>100){
				g.drawImage(imageGraphic,340, 395, 35, 30, null, null);
			}
			if (state.getKey().equals("AL") && state.getValue()<50){
				g.drawImage(imageGraphic, 310, 395, 15, 30, null, null);
			}
			else if (state.getKey().equals("AL") && state.getValue()>100){
				g.drawImage(imageGraphic,310, 395, 35, 30, null, null);
			}
			if (state.getKey().equals("MS") && state.getValue()<50){
				g.drawImage(imageGraphic, 280, 395, 15, 25, null, null);
			}
			else if (state.getKey().equals("MS") && state.getValue()>100){
				g.drawImage(imageGraphic,280, 395, 35, 25, null, null);
			}
			if (state.getKey().equals("LA") && state.getValue()<50){
				g.drawImage(imageGraphic, 260, 435, 15, 25, null, null);
			}
			else if (state.getKey().equals("LA") && state.getValue()>100){
				g.drawImage(imageGraphic,260, 435, 35, 30, null, null);
			}
			if (state.getKey().equals("SC") && state.getValue()<50){
				g.drawImage(imageGraphic, 360, 355, 15, 25, null, null);
			}
			else if (state.getKey().equals("SC") && state.getValue()>100){
				g.drawImage(imageGraphic, 360, 355, 35, 30, null, null);
			}
			if (state.getKey().equals("HI") && state.getValue()<50){
				g.drawImage(imageGraphic, 130, 525, 15, 25, null, null);
				g.drawRect( 130, 525, 15, 25);
			}
			else if (state.getKey().equals("HI") && state.getValue()>100){
				g.drawImage(imageGraphic,130, 525, 35, 30, null, null);
				g.drawRect(130, 525, 35, 30);
			}
			if (state.getKey().equals("MA") && state.getValue()<50){
				g.drawImage(imageGraphic,450, 135, 15, 25, null, null);

			}
			else if (state.getKey().equals("MA") && state.getValue()>100){
				g.drawImage(imageGraphic,450, 135, 35, 30, null, null);

			}
			if (state.getKey().equals("RI") && state.getValue()<50){
				g.drawImage(imageGraphic,465, 180, 15, 25, null, null);

			}
			else if (state.getKey().equals("RI") && state.getValue()>100){
				g.drawImage(imageGraphic,465, 180, 35, 30, null, null);

			}
			if (state.getKey().equals("CT") && state.getValue()<50){
				g.drawImage(imageGraphic,408, 195, 15, 25, null, null);

			}
			else if (state.getKey().equals("CT") && state.getValue()>100){
				g.drawImage(imageGraphic,408, 195, 35, 30, null, null);

			}
			if (state.getKey().equals("NJ") && state.getValue()<50){
				g.drawImage(imageGraphic,431, 225, 15, 25, null, null);

			}
			else if (state.getKey().equals("NJ") && state.getValue()>100){
				g.drawImage(imageGraphic,431, 225, 35, 30, null, null);

			}
			if (state.getKey().equals("DE") && state.getValue()<50){
				g.drawImage(imageGraphic,450, 245, 15, 25, null, null);

			}
			else if (state.getKey().equals("DE") && state.getValue()>100){
				g.drawImage(imageGraphic,450, 245, 35, 30, null, null);

			}
			if (state.getKey().equals("MD") && state.getValue()<50){
				g.drawImage(imageGraphic,440, 275, 15, 25, null, null);

			}
			else if (state.getKey().equals("MD") && state.getValue()>100){
				g.drawImage(imageGraphic,440, 275, 35, 30, null, null);

			}
			if (state.getKey().equals("WA") && state.getValue()<50){
				g.drawImage(imageGraphic,420, 295, 15, 25, null, null);

			}
			else if (state.getKey().equals("WA") && state.getValue()>100){
				g.drawImage(imageGraphic,420, 295, 35, 30, null, null);

			}
			if (state.getKey().equals("VT") && state.getValue()<50){
				g.drawImage(imageGraphic,390, 90, 15, 25, null, null);

			}
			else if (state.getKey().equals("VT") && state.getValue()>100){
				g.drawImage(imageGraphic,390, 90, 35, 30, null, null);

			}


		}

	}
	
	private void stuff() {
		
		System.out.println("2");
		addMouseListener(new Listener());
		
	}
	

	//this method creates the pop-up frame.
	public void setRange(){
		//System.out.println("3");
		//System.out.println("works");
		//System.out.println("4");
		JDialog frame1= new JDialog();
		//System.out.println("5");
		frame1.setTitle(los.getTempState());	
		//sets the title to the current incident
		//System.out.println("6");
		frame1.setSize(400,300);
		//System.out.println("7");
		
		frame1.setLayout(new BorderLayout());
		
		JComboBox<String> combo = new JComboBox<>();
		frame1.add(combo,BorderLayout.NORTH);
		
		jlSingleIncidentList = new JList<>();	//1) initialise the incident list.
		jlSingleIncidentList.setModel(los.getJListModel());		//2) adding the the default list model, to the jList.
		frame1.add(jlSingleIncidentList, BorderLayout.CENTER);
		
		frame1.setVisible(true);
		frame1.pack();
		
		//listSight = new JList<String>();
		//System.out.println("8");
		//for all incidents
		
		/*
		 * 1) Create a default list model .TICK. In LOS class.
		 * 2) Add the list model to JList  .TICK. In LOS class.
		 * 3) Add each incident to the list model inside the loop. .TICK. In LOS class.
		 * 
		 * 
		 * */
		/*
		 * remove element from list model.
		 * 
		 * */
		/*to sort, remove everything from JList*/
		//collections .sort..
		//
		//load back into the Jlist
		
	}
	
	public class Listener implements MouseListener{
		public void mouseClicked(java.awt.event.MouseEvent e) {

			Rectangle2D.Double bounds1 = new Rectangle2D.Double(40,35, 15, 2);
			Rectangle2D.Double bounds2 = new Rectangle2D.Double(110,60, 15,25);
			Rectangle2D.Double bounds3 = new Rectangle2D.Double(180,80, 15,25);
			Rectangle2D.Double bounds4 = new Rectangle2D.Double(230,100, 15,25);
			Rectangle2D.Double bounds5 = new Rectangle2D.Double(270, 135, 15,25);
			Rectangle2D.Double bounds6 = new Rectangle2D.Double(315, 150, 15,25);
			Rectangle2D.Double bounds7 = new Rectangle2D.Double(315, 150, 35,30);
			Rectangle2D.Double bounds8 = new Rectangle2D.Double(380, 140, 15, 25);
			Rectangle2D.Double bounds9 = new Rectangle2D.Double(380, 140, 35, 30);
			Rectangle2D.Double bounds10 = new Rectangle2D.Double(420, 55, 15, 25);
			Rectangle2D.Double bounds11 = new Rectangle2D.Double(420, 55, 35, 2);
			Rectangle2D.Double bounds12 = new Rectangle2D.Double(370, 75, 15, 25);
			Rectangle2D.Double bounds13 = new Rectangle2D.Double(70, 140, 15, 25);
			Rectangle2D.Double bounds14 = new Rectangle2D.Double(30, 115, 15, 25);
			Rectangle2D.Double bounds15 = new Rectangle2D.Double(30, 115, 35, 30);
			Rectangle2D.Double bounds16 = new Rectangle2D.Double(130, 150, 15, 2);
			Rectangle2D.Double bounds17 = new Rectangle2D.Double(190, 150, 15, 25);
			Rectangle2D.Double bounds18 = new Rectangle2D.Double(190, 208, 15, 25);
			Rectangle2D.Double bounds19 = new Rectangle2D.Double(245, 200, 15, 25);
			Rectangle2D.Double bounds20 = new Rectangle2D.Double(245, 200, 15, 25);
			Rectangle2D.Double bounds21 = new Rectangle2D.Double(275, 220, 15, 25);
			Rectangle2D.Double bounds22 = new Rectangle2D.Double(295, 220, 15,25);
			Rectangle2D.Double bounds23 = new Rectangle2D.Double(325, 220, 15,25);
			Rectangle2D.Double bounds24 = new Rectangle2D.Double(375, 190, 15, 25);
			Rectangle2D.Double bounds25 = new Rectangle2D.Double(20, 250, 15, 25);
			Rectangle2D.Double bounds26 = new Rectangle2D.Double(54, 225, 15, 25);
			Rectangle2D.Double bounds27 = new Rectangle2D.Double(94, 225, 35, 40);
			Rectangle2D.Double bounds28 = new Rectangle2D.Double(140, 245, 15, 25);
			Rectangle2D.Double bounds29 = new Rectangle2D.Double(200, 270, 15, 25);
			Rectangle2D.Double bounds30 = new Rectangle2D.Double(250, 270, 15, 25);
			Rectangle2D.Double bounds31 = new Rectangle2D.Double(320, 285, 25, 40);
			Rectangle2D.Double bounds32 = new Rectangle2D.Double(351, 245, 15, 25);
			Rectangle2D.Double bounds33 = new Rectangle2D.Double(370, 265, 15, 25);
			Rectangle2D.Double bounds34 = new Rectangle2D.Double(360, 305, 15, 25);
			Rectangle2D.Double bounds35 = new Rectangle2D.Double(300, 320, 15, 25);
			Rectangle2D.Double bounds36 = new Rectangle2D.Double(255, 350, 15, 25);
			Rectangle2D.Double bounds37 = new Rectangle2D.Double(215, 348, 15,25);
			Rectangle2D.Double bounds38 = new Rectangle2D.Double(195, 425, 15, 25);
			Rectangle2D.Double bounds39 = new Rectangle2D.Double(135, 360, 15, 25);
			Rectangle2D.Double bounds40 = new Rectangle2D.Double(80, 345, 15, 25);
			Rectangle2D.Double bounds41 = new Rectangle2D.Double(20, 255, 15, 25);
			Rectangle2D.Double bounds42 = new Rectangle2D.Double(40, 470, 15, 25);
			Rectangle2D.Double bounds43 = new Rectangle2D.Double(340, 465, 15, 25);
			Rectangle2D.Double bounds44 = new Rectangle2D.Double(340, 395, 15, 25);
			Rectangle2D.Double bounds45 = new Rectangle2D.Double(310, 395, 15, 30);
			Rectangle2D.Double bounds46 = new Rectangle2D.Double(280, 395, 15, 25);
			Rectangle2D.Double bounds47 = new Rectangle2D.Double(260, 435, 15, 25);
			Rectangle2D.Double bounds48 = new Rectangle2D.Double(360, 355, 15, 25);
			Rectangle2D.Double bounds49 = new Rectangle2D.Double(130, 525, 15, 25);
			Rectangle2D.Double bounds50 = new Rectangle2D.Double(130, 525, 35, 30);
			Rectangle2D.Double bounds51 = new Rectangle2D.Double(465, 180, 35, 30);
			Rectangle2D.Double bounds52 = new Rectangle2D.Double(408, 195, 35, 30);
			Rectangle2D.Double bounds53 = new Rectangle2D.Double(431, 225, 35, 30);
			Rectangle2D.Double bounds54 = new Rectangle2D.Double(450, 245, 35, 30);
			Rectangle2D.Double bounds55 = new Rectangle2D.Double(440, 275, 35, 30);
			Rectangle2D.Double bounds56 = new Rectangle2D.Double(390, 90, 35, 30);
			Rectangle2D.Double bounds57 = new Rectangle2D.Double(420, 295, 35, 30);

			
			if ((bounds1.contains(e.getPoint()))){
				System.out.println("no");
						
				//set the name of the ListOfSighting
				System.out.println("9");
				model.setStateClicked("WA");
				System.out.println("10");
				los.respondToClick();
				System.out.println("12");
				System.out.println("dialog created");

			} else if((bounds2.contains(e.getPoint()))){
					
				model.setStateClicked("MT");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds3.contains(e.getPoint()))){
					
				model.setStateClicked("ND");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds4.contains(e.getPoint()))){
					
				model.setStateClicked("MN");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds5.contains(e.getPoint()))){
					
				model.setStateClicked("WI");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds6.contains(e.getPoint()))){
					
				model.setStateClicked("MI");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds7.contains(e.getPoint()))){
					
				model.setStateClicked("NY");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds8.contains(e.getPoint()))){
					
				model.setStateClicked("ME");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds9.contains(e.getPoint()))){
					
				model.setStateClicked("NH");
				System.out.println("dialog created");
			}
			else if((bounds10.contains(e.getPoint()))){
					
				model.setStateClicked("ID");
				los.respondToClick();
				System.out.println("dialog ID created");
			}
			else if((bounds11.contains(e.getPoint()))){
					
				model.setStateClicked("OR");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds12.contains(e.getPoint()))){
					
				model.setStateClicked("WY");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds13.contains(e.getPoint()))){
					
				model.setStateClicked("SD");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds14.contains(e.getPoint()))){
					
				model.setStateClicked("NE");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds15.contains(e.getPoint()))){
					
				model.setStateClicked("IA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds16.contains(e.getPoint()))){
					
				model.setStateClicked("IL");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds17.contains(e.getPoint()))){
					
				model.setStateClicked("IN");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds18.contains(e.getPoint()))){
					
				model.setStateClicked("OH");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds19.contains(e.getPoint()))){
					
				model.setStateClicked("PA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds20.contains(e.getPoint()))){
					
				model.setStateClicked("CA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds21.contains(e.getPoint()))){
					
				model.setStateClicked("NV");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds22.contains(e.getPoint()))){
					
				model.setStateClicked("UT");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds23.contains(e.getPoint()))){
					
				model.setStateClicked("CO");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds24.contains(e.getPoint()))){
					
				model.setStateClicked("KS");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds25.contains(e.getPoint()))){
					
				model.setStateClicked("MO");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds26.contains(e.getPoint()))){
					
				model.setStateClicked("KY");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds27.contains(e.getPoint()))){
					
				model.setStateClicked("WV");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds28.contains(e.getPoint()))){
					
				model.setStateClicked("VA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds29.contains(e.getPoint()))){
					
				model.setStateClicked("NC");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds30.contains(e.getPoint()))){
					
				model.setStateClicked("TN");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds31.contains(e.getPoint()))){
					
				model.setStateClicked("AR");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds32.contains(e.getPoint()))){
					
				model.setStateClicked("OK");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds33.contains(e.getPoint()))){
					
				model.setStateClicked("TX");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds34.contains(e.getPoint()))){
					
				model.setStateClicked("NM");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds35.contains(e.getPoint()))){
					
				model.setStateClicked("AZ");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds36.contains(e.getPoint()))){
					
				model.setStateClicked("CA");	//WHY ARE THERE 2 ACTIONLISTERNERS FOR 'CA'??. Coordinates (20,250,15,25) & (20,255,15,25)
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds37.contains(e.getPoint()))){
					
				model.setStateClicked("AK");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds38.contains(e.getPoint()))){
					
				model.setStateClicked("FL");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds39.contains(e.getPoint()))){
					
				model.setStateClicked("GA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds40.contains(e.getPoint()))){
					
				model.setStateClicked("AL");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds41.contains(e.getPoint()))){
					
				model.setStateClicked("MS");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds42.contains(e.getPoint()))){
					
				model.setStateClicked("LA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds43.contains(e.getPoint()))){
					
				model.setStateClicked("SC");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds44.contains(e.getPoint()))){
					
				model.setStateClicked("HI");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds45.contains(e.getPoint()))){
					
				model.setStateClicked("MA");   //ANOTHER MA????
				los.respondToClick();
				System.out.println("dialog created");
			}
			
			//*-----------------up to here. ---------------------------------------------------------
			else if((bounds46.contains(e.getPoint()))){
					
				model.setStateClicked("WA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds47.contains(e.getPoint()))){
					
				model.setStateClicked("WA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds48.contains(e.getPoint()))){
					
				model.setStateClicked("WA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds49.contains(e.getPoint()))){
					
				model.setStateClicked("WA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds50.contains(e.getPoint()))){
					
				model.setStateClicked("WA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds51.contains(e.getPoint()))){
					
				model.setStateClicked("WA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds52.contains(e.getPoint()))){
					
				model.setStateClicked("WA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds53.contains(e.getPoint()))){
					
				model.setStateClicked("WA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds54.contains(e.getPoint()))){
					
				model.setStateClicked("WA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds55.contains(e.getPoint()))){
					
				model.setStateClicked("WA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds56.contains(e.getPoint()))){
					
				model.setStateClicked("WA");
				los.respondToClick();
				System.out.println("dialog created");
			}
			else if((bounds57.contains(e.getPoint()))){
					
				model.setStateClicked("WA");
				los.respondToClick();
				System.out.println("dialog created");
			}

			setRange();	
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}
	}	


}

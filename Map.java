/**
 * 
 */
package requirementX;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import api.ripley.Incident;

import api.ripley.Ripley;

public class Map extends JPanel{
	Ripley ripley1 = new Ripley("90tLI3CStdmyVD6ql2OMtA==","lBgm4pRs8QnVqL46EnH7ew==");
	JPanel image;
	JLabel map;
	private Graphics graphicImage;
	ImageIcon mainImage;

	private void getLastUpdated() {
		// TODO Auto-generated method stub
		System.out.println(ripley1.getLastUpdated());
	}

	public void initMap(){
		getContentPane().setLayout(new BorderLayout());
		myPanel panel = new myPanel(); 
		getContentPane().setSize(1000,550);
		getContentPane().add(panel,BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(true);
		pack();

	}


	public void sortingData(){
		SimpleDateFormat changeDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String dateInString = "EEEE, MMM dd, yyyy HH:mm:ss a";
		try{
			Date dateMap = changeDateFormat.parse(dateInString);
			changeDateFormat.format(dateMap);
		} catch (ParseException e){
			e.printStackTrace();
		}

		//mapping.getIncidentsInRange(String start, String end);// pass in the seleced date range from main window
	}

	class myPanel extends JPanel{

		public myPanel() {
			mainImage = new ImageIcon("src/map of us.png");
		}

		@Override
		protected void paintComponent(Graphics g) {
			BufferedImage scaledImage = getScaledImage();
			super.paintComponent(g);
			g.drawImage(scaledImage, 0, 0, null);
			// g.fillOval(getHeight(), getWidth(), 20, 20);;
			repaint();
		}

		private BufferedImage getScaledImage(){
			BufferedImage image = new BufferedImage(getWidth(),getHeight(), BufferedImage.TYPE_INT_RGB);
			Graphics2D g2d = (Graphics2D) image.createGraphics();
			g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING,RenderingHints.VALUE_RENDER_QUALITY));
			g2d.drawImage(mainImage.getImage(), 0, 0,getWidth(),getHeight(), null);

			return image;
		}



	public static void main(String[] args){
		Map map1= new Map();
		map1.getLastUpdated();
		map1.initMap();
		map1.setVisible(true);



	}


}



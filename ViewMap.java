package requirementX;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JLabel;

import api.ripley.Incident;
import api.ripley.Ripley;

public class ViewMap extends Map{
	ArrayList<JLabel> states = new ArrayList<JLabel>();
	//ArrayList<Incident> mapping = new ArrayList<Incident>();

	private JLabel alabamaSightings;
	private JLabel alaskaSightings; 
	private JLabel arizonaOfSightings;
	private JLabel arkansasSightings;
	private JLabel californiaSightings;
	private JLabel coloradoSightings;
	private JLabel connecticutSightings;
	private JLabel delawareSightings;
	private JLabel floridaSightings;
	private JLabel georgiaSightings;
	private JLabel hawaiiSightings;
	private JLabel idahoSightings;
	private JLabel illinoisSightings;
	private JLabel indianaSightings;
	private JLabel iowaSightings;
	private JLabel kansasSightings;
	private JLabel kentuckySightings;
	private JLabel louisianaSightings;
	private JLabel maineSightings;
	private JLabel marylandSightings;
	private JLabel massachusettsSightings;
	private JLabel michiganSightings;
	private JLabel minnesotaSightings;
	private JLabel mississippiSightings;
	private JLabel missouriSightings;
	private JLabel montanaSightings;
	private JLabel nebraskaSightings;
	private JLabel NevadaSightings ;
	private JLabel newHampshireSightings;
	private JLabel newJerseySightings;
	private JLabel newMexicoSightings;
	private JLabel newYorkSightings;
	private JLabel northCarolinaSightings;
	private JLabel northDakotaSightings;
	private JLabel ohioSightings ;
	private JLabel oklahomaSightings;
	private JLabel oregonSightings;
	private JLabel rhodeIslandSightings;
	private JLabel southCarolinaSightings;
	private JLabel southDakotaSightings;
	private JLabel tennesseeSightings ;
	private JLabel texasSightings;
	private JLabel utahSightings ;
	private JLabel vermontSightings;
	private JLabel virginiaSightings;
	private JLabel washingtonSightings;
	private JLabel westVirginiaSightings ;
	private JLabel wisconsinSightings ;
	private JLabel wyomingSightings;
	private JLabel pennsylviasightings;
	//String name = null;
	ArrayList<Incident> list;
	ArrayList<String> name;
	//String state;

	public void intMarkForState(){

		JLabel alabamaSightings = new JLabel("AL");
		JLabel alaskaSightings = new JLabel("AK");
		JLabel arizonaOfSightings = new JLabel("AZ");
		JLabel arkansasSightings = new JLabel("AR");
		JLabel californiaSightings = new JLabel("CA");
		JLabel coloradoSightings = new JLabel("CO");
		JLabel connecticutSightings = new JLabel("CT");
		JLabel delawareSightings = new JLabel("DE");
		JLabel floridaSightings = new JLabel("FL");
		JLabel georgiaSightings = new JLabel("GA");
		JLabel hawaiiSightings = new JLabel("HI");
		JLabel idahoSightings = new JLabel("ID");
		JLabel illinoisSightings = new JLabel("IL");
		JLabel indianaSightings = new JLabel("IN");
		JLabel iowaSightings = new JLabel("IA");
		JLabel kansasSightings = new JLabel("KS");
		JLabel kentuckySightings = new JLabel("KY");
		JLabel louisianaSightings = new JLabel("LA");
		JLabel maineSightings = new JLabel("ME");
		JLabel marylandSightings = new JLabel("MD");
		JLabel massachusettsSightings = new JLabel("MA");
		JLabel michiganSightings = new JLabel("MI");
		JLabel minnesotaSightings = new JLabel("MN");
		JLabel mississippiSightings = new JLabel("MS");
		JLabel missouriSightings = new JLabel("MO");
		JLabel montanaSightings = new JLabel("MT");
		JLabel nebraskaSightings = new JLabel("NE");
		JLabel NevadaSightings = new JLabel("NV");
		JLabel newHampshireSightings = new JLabel("NH");
		JLabel newJerseySightings = new JLabel(" NJ");
		JLabel newMexicoSightings = new JLabel("NM");
		JLabel newYorkSightings = new JLabel("NY");
		JLabel northCarolinaSightings = new JLabel("NC");
		JLabel northDakotaSightings = new JLabel("ND");
		JLabel ohioSightings = new JLabel("OH");
		JLabel oklahomaSightings = new JLabel("OK");
		JLabel oregonSightings = new JLabel("OR");
		JLabel rhodeIslandSightings = new JLabel("RI");
		JLabel southCarolinaSightings = new JLabel("SC");
		JLabel pennsylviasightings = new JLabel("PA");
		JLabel southDakotaSightings = new JLabel("SD");
		JLabel tennesseeSightings = new JLabel("TN");
		JLabel texasSightings = new JLabel("TX");
		JLabel utahSightings = new JLabel("UT");
		JLabel vermontSightings = new JLabel("VT");
		JLabel virginiaSightings = new JLabel("VA");
		JLabel washingtonSightings = new JLabel("WA");
		JLabel westVirginiaSightings = new JLabel("WV");
		JLabel wisconsinSightings = new JLabel("WI");
		JLabel wyomingSightings = new JLabel("WY");
	}
	public void addStates(JLabel label){
		states.add(wyomingSightings);
		states.add(alabamaSightings);
		states.add(wisconsinSightings);
		states.add(westVirginiaSightings);
		states.add(virginiaSightings);
		states.add(vermontSightings);
		states.add(utahSightings);
		states.add(texasSightings);
		states.add(tennesseeSightings);
		states.add(southDakotaSightings);
		states.add(southCarolinaSightings);
		states.add(rhodeIslandSightings);
		states.add(oregonSightings);
		states.add(ohioSightings);
		states.add(northDakotaSightings);
		states.add(northCarolinaSightings);
		states.add(newYorkSightings);
		states.add(newMexicoSightings);
		states.add(newJerseySightings);
		states.add(newHampshireSightings );
		states.add(NevadaSightings);
		states.add(alaskaSightings);
		states.add(arizonaOfSightings); 
		states.add(arkansasSightings); 
		states.add(californiaSightings); 
		states.add(coloradoSightings);
		states.add(connecticutSightings); 
		states.add(delawareSightings); 
		states.add(floridaSightings);
		states.add( georgiaSightings);
		states.add(hawaiiSightings);
		states.add( idahoSightings);
		states.add(illinoisSightings); 
		states.add(indianaSightings);
		states.add( iowaSightings );
		states.add( kansasSightings );
		states.add( kentuckySightings); 
		states.add(louisianaSightings);
		states.add(maineSightings); 
		states.add(marylandSightings);
		states.add(massachusettsSightings); 
		states.add(michiganSightings); 
		states.add( minnesotaSightings); 
		states.add( mississippiSightings); 
		states.add(missouriSightings);
		states.add( montanaSightings);
		states.add( pennsylviasightings);

	}


	public ArrayList<String> getStateName(){
		int start = 2000;
		int end = 2002;
		list = ripley1.getIncidentsInRange(start + "-01-01 00:00:00", end + "-12-31 23:59:59");
		//System.out.println(list.size());
		try{
			for (Incident i : list) {
				//System.out.println(i.getState());
				name.add(i.getState());
				System.out.println(name);

			}} catch(NullPointerException exception){
				return null;

			}
		return name;

	}


	public void markState(){
		int i;
		int occurence;
		for(i=0; i<states.size();i++){
			for(i=0; i<name.size();i++){
				if (states.get(i).getText().equals(name.get(i))){ 
					occurence = Collections.frequency(name, "name");
					System.out.println("Number of times" + name +   occurence);
				}}
		}
	}

	public static void main(String[] args){
		ViewMap view1 = new ViewMap();
		view1.getStateName();
		view1.markState();

	}

}

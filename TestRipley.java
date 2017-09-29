package requirementX;

import api.ripley.Ripley;

public class TestRipley {

	public static void main (String[]args){
		Ripley test = new Ripley("90tLI3CStdmyVD6ql2OMtA==", "lBgm4pRs8QnVqL46EnH7ew==");
		//(Ripley is created using private key and public key)
		System.out.println(test.getIncidentsInRange("1965-01-01 12:12:12", "1985-12-12 12:12:12"));
		System.out.println(test.getAcknowledgementString());
	}

}

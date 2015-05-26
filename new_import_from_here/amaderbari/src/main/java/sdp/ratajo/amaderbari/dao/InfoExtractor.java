package sdp.ratajo.amaderbari.dao;

public class InfoExtractor {
	public static String[] getInformations(String string){
		if(string == null) return null;
		String[] retsStrings = string.split("\n");
		return retsStrings;
	}
}

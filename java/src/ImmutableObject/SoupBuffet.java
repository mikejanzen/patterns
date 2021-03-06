//SoupBuffet.java - A helper class

package ImmutableObject;

import common.*;

public class SoupBuffet {

   private String soupBuffetName;
   
   private ChickenSoup chickenSoup;
   private ClamChowder clamChowder;
   private FishChowder fishChowder;
   private Minnestrone minnestrone;
   private PastaFazul pastaFazul;
   private TofuSoup tofuSoup;
   private VegetableSoup vegetableSoup;

	public SoupBuffet(
		String name,
		ChickenSoup chickenSoup,
		ClamChowder clamChowder,
		FishChowder fishChowder,
		Minnestrone minnestrone,
		PastaFazul pastaFazul,
		TofuSoup tofuSoup,
		VegetableSoup vegetableSoup
	) {
		this.soupBuffetName = name;
		this.chickenSoup = chickenSoup;
		this.clamChowder = clamChowder;
		this.fishChowder = fishChowder;
		this.minnestrone = minnestrone;
		this.pastaFazul = pastaFazul;
		this.tofuSoup = tofuSoup;
		this.vegetableSoup = vegetableSoup;
	}

   public String getSoupBuffetName() {
       return soupBuffetName;
   }
   public String getTodaysSoups() {
        StringBuffer stringOfSoups = new StringBuffer();
        stringOfSoups.append(" Today's Soups!  ");
        stringOfSoups.append(" Chicken Soup: ");        
        stringOfSoups.append(this.chickenSoup.getSoupName()); 
        stringOfSoups.append(" Clam Chowder: ");        
        stringOfSoups.append(this.clamChowder.getSoupName()); 
        stringOfSoups.append(" Fish Chowder: ");        
        stringOfSoups.append(this.fishChowder.getSoupName()); 
        stringOfSoups.append(" Minnestrone: ");        
        stringOfSoups.append(this.minnestrone.getSoupName());
        stringOfSoups.append(" Pasta Fazul: ");        
        stringOfSoups.append(this.pastaFazul.getSoupName());
        stringOfSoups.append(" Tofu Soup: ");        
        stringOfSoups.append(this.tofuSoup.getSoupName());
        stringOfSoups.append(" Vegetable Soup: ");        
        stringOfSoups.append(this.vegetableSoup.getSoupName());
        return stringOfSoups.toString();          
   }
}        

class JuiceMenuRunner{

      public static void main(String[] args){
	   
	    JuiceMenu NaturalJuiceCenter=new JuiceMenu();
		NaturalJuiceCenter.getJuiceMenuDetails();
	    NaturalJuiceCenter.checkJuiceByName("Grapes");
	    NaturalJuiceCenter.checkJuiceByName("Pomegranate");
	    NaturalJuiceCenter.checkJuiceByName("Liquid Fresh");
	    NaturalJuiceCenter.checkJuiceByName("Mango");
	  
		
		JuiceMenu FreshSip=new JuiceMenu();
		FreshSip.checkJuiceByName("Guava");
	    FreshSip.checkJuiceByName("Pure sip");
	    FreshSip.checkJuiceByName("Grapes");
	    FreshSip.checkJuiceByName("Banana");
	  
		
		JuiceMenu JuiceParadise=new JuiceMenu();
		JuiceParadise.checkJuiceByName("Pomegranate");
	    JuiceParadise.checkJuiceByName("Watermelon");
	    JuiceParadise.checkJuiceByName("Fruit kingdom");
	    JuiceParadise.checkJuiceByName("Berryblast");
		
		JuiceMenu TastyJuice=new JuiceMenu();
		TastyJuice.checkJuiceByName("Lemon");
	    TastyJuice.checkJuiceByName("Orange");
	    TastyJuice.checkJuiceByName("juice palace");
	    TastyJuice.checkJuiceByName("Apple");
		
		JuiceMenu HealthyJuice=new JuiceMenu();
		HealthyJuice.checkJuiceByName("Grapes");
	    HealthyJuice.checkJuiceByName("Mango");
	    HealthyJuice.checkJuiceByName("Watermelon");
	    HealthyJuice.checkJuiceByName("Fruity fun");
		
	

	 
	  }
}
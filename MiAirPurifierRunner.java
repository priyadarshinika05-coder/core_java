class  MiAirPurifierRunner{

     public static void main(String[]args){
	 
	 
	     System.out.println("------- First Time Method Call -------");
		 boolean  AirPurifierStatus= MiAirPurifier.powerSwitch();
		 System.out.println("Main Method  AirPurifier Status:"+ AirPurifierStatus);
		 
		 
		 System.out.println("------- Second Time Method Call -------");
		  MiAirPurifier.powerSwitch();
		 
		 System.out.println("------- Third Time Method Call -------");
	      MiAirPurifier.powerSwitch();
		 
		 System.out.println("------- Fourth Time Method Call -------");
	      MiAirPurifier.powerSwitch();
		 
		 System.out.println("------- Fifth Time Method Call -------");
		 MiAirPurifier.powerSwitch();
	 }
}
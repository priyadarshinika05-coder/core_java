class PrestigeKettleRunner{

     public static void main(String[]args){
	 
	     System.out.println("------- First Time Method Call -------");
		 boolean KettleStatus=PrestigeKettle.boilSwitch();
		 System.out.println("Main Method Kettle Status:"+KettleStatus);
		 
		 System.out.println("------- Second Time Method Call -------");
		 PrestigeKettle.boilSwitch();
		 
		 System.out.println("------- Third Time Method Call -------");
		 PrestigeKettle.boilSwitch();
		 
		 System.out.println("------- Fourth Time Method Call -------");
	     PrestigeKettle.boilSwitch();
		 
		 System.out.println("------- Fifth Time Method Call -------");
		 PrestigeKettle.boilSwitch();
	 }
}
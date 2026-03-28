class LGRefrigeratorRunner{

     public static void main(String[]args){
	 
	     System.out.println("------- First Time Method Call -------");
		 boolean FridgeStatus=LGRefrigerator.startOrstop();
		 System.out.println("Main Method Fridge Status:"+FridgeStatus);
		 
		 System.out.println("------- Second Time Method Call -------");
		 LGRefrigerator.startOrstop();
		 
		 System.out.println("------- Third Time Method Call -------");
		 LGRefrigerator.startOrstop();
		 
		 System.out.println("------- Fourth Time Method Call -------");
		 LGRefrigerator.startOrstop();
		 
		 System.out.println("------- Fifth Time Method Call -------");
		LGRefrigerator.startOrstop();
	 }
}
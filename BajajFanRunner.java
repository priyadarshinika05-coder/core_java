class BajajFanRunner{

     public static void main(String[]args){
	 
	     System.out.println("------- First Time Method Call -------");
		 boolean FanStatus=BajajFan.powerButton();
		 System.out.println("Main Method Fan Status:"+FanStatus);
		 
		 System.out.println("------- Second Time Method Call -------");
		 BajajFan.powerButton();
		 
		 System.out.println("------- Third Time Method Call -------");
		 BajajFan.powerButton();
		 
		 System.out.println("------- Fourth Time Method Call -------");
		 BajajFan.powerButton();
		 
		 System.out.println("------- Fifth Time Method Call -------");
		 BajajFan.powerButton();
	 }
}
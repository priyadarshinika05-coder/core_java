class PanasonicTvRunner{

     public static void main(String[]args){
	 
	     System.out.println("------- First Time Method Call -------");
		 boolean TvStatus=PanasonicTv.powerButton();
		 System.out.println("Main Method Tv Status:"+TvStatus);
		 
		 System.out.println("------- Second Time Method Call -------");
		 PanasonicTv.powerButton();
		 
		 System.out.println("------- Third Time Method Call -------");
		 PanasonicTv.powerButton();
		 
		 System.out.println("------- Fourth Time Method Call -------");
		 PanasonicTv.powerButton();
		 
		 System.out.println("------- Fifth Time Method Call -------");
		 PanasonicTv.powerButton();
	 }
}
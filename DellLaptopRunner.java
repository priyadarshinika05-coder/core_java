class DellLaptopRunner{

     public static void main(String[]args){
	 
	 
	     System.out.println("------- First Time Method Call -------");
		 boolean PowerLaptop status=DellLaptop.PowerLaptop();
		 System.out.println("Main Method PowerLaptop Status:"+PowerLaptopStatus);
		 
		 System.out.println("------- Second Time Method Call -------");
		 DellLaptop.PowerLaptop();
		 
		 System.out.println("------- Third Time Method Call -------");
	     DellLaptop.PowerLaptop();
		 
		 System.out.println("------- Fourth Time Method Call -------");
	     DellLaptop.PowerLaptop();
		 
		 System.out.println("------- Fifth Time Method Call -------");
		 DellLaptop.PowerLaptop();
	 }
}
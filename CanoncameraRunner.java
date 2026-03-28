class CanoncameraRunner{

     public static void main(String[]args){
	 
	 
	     System.out.println("------- First Time Method Call -------");
		 boolean  camerastatus=Canoncamera.powerButton();
		 System.out.println("Main Method camera Status:"+cameraStatus);
		 
		 System.out.println("------- Second Time Method Call -------");
		 Canoncamera.powerButton();
		 
		 System.out.println("------- Third Time Method Call -------");
	     Canoncamera.powerButton();
		 
		 System.out.println("------- Fourth Time Method Call -------");
	     Canoncamera.powerButton();
		 
		 System.out.println("------- Fifth Time Method Call -------");
		 Canoncamera.powerButton();
	 }
}
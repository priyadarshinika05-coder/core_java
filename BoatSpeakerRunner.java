class BoatSpeakerRunner{

     public static void main(String[]args){
	 
	     System.out.println("------- First Time Method Call -------");
		 boolean SpeakerStatus=BoatSpeaker.connectSpeaker();
		 System.out.println("Main Method Speaker Status:"+SpeakerStatus);
		 
		 System.out.println("------- Second Time Method Call -------");
		 BoatSpeaker.connectSpeaker();
		 
		 System.out.println("------- Third Time Method Call -------");
		 BoatSpeaker.connectSpeaker();
		 
		 System.out.println("------- Fourth Time Method Call -------");
		 BoatSpeaker.connectSpeaker();
		 
		 System.out.println("------- Fifth Time Method Call -------");
		 BoatSpeaker.connectSpeaker();
	 }
}
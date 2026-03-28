class BoatSpeaker{

     static boolean isConnected;
	 
	 public static boolean connectSpeaker(){
	      
		  System.out.println("Speaker method started");
		  
		  if (isConnected==false){
		      isConnected=true;
			  System.out.println("Speaker is ON:"+isConnected);
			}
			else{
			    isConnected=false;
				 System.out.println("Speaker is OFF:"+isConnected);
			}
			System.out.println("Speaker button method ended");
			
			return isConnected;
		}
}
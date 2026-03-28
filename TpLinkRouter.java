class TpLinkRouter{

     static boolean isConnected;
	 
	 public static boolean connectDisconnect(){
	      
		  System.out.println("connectDisconnect method started");
		  
		  if (isConnected==false){
		      isConnected=true;
			  System.out.println("Router is ON:"+isConnected);
			}
			else{
			    isConnected=false;
				 System.out.println("Router is OFF:"+isConnected);
			}
			System.out.println("connectDisconnect method ended");
			
			return isConnected;
		}
}
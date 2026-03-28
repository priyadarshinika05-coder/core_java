class MiAirPurifier{

     static boolean isPower;
	 
	 public static boolean powerSwitch(){
	      
		  System.out.println("powerSwitch method started");
		  
		  if (isPower==false){
		      isPower=true;
			  System.out.println("AirPurifier is ON:"+isPower);
			}
			else{
			    isPower=false;
				 System.out.println("AirPurifier is OFF:"+isPower);
			}
			System.out.println("powerSwitch method ended");
			
			return isPower;
		}
}
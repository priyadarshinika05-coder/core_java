class PrestigeKettle{

     static boolean isBoiling;
	 
	 public static boolean boilSwitch(){
	      
		  System.out.println("boilSwitch method started");
		  
		  if (isBoiling==false){
		      isBoiling=true;
			  System.out.println("Kettle is ON:"+isBoiling);
			}
			else{
			    isBoiling=false;
				 System.out.println("Kettle is OFF:"+isBoiling);
			}
			System.out.println("boilSwitch method ended");
			
			return isBoiling;
		}
}
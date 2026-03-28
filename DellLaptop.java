class DellLaptop{

     static boolean isPowerOn;
	 
	 public static boolean powerLaptop(){
	      
		  System.out.println("Laptop method started");
		  
		  if (isPowerOn==false){
		      isPowerOn=true;
			  System.out.println("Laptop Power is ON:"+isPowerOn);
			}
			else{
			    isPowerOn=false;
				 System.out.println("Laptop Power is OFF:"+isPowerOn);
			}
			System.out.println("Laptop method ended");
			
			return isPowerOn;
		}
}
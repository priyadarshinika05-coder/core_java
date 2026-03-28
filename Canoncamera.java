class Canoncamera{

     static boolean isPower;
	 
	 public static boolean powerButton(){
	      
		  System.out.println("powerButton method started");
		  
		  if (isPower==false){
		      isPower=true;
			  System.out.println("camera Power is ON:"+isPower);
			}
			else{
			    isPower=false;
				 System.out.println("camera Power is OFF:"+isPower);
			}
			System.out.println("powerButton method ended");
			
			return isPower;
		}
}
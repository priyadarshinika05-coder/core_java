class PanasonicTv{

     static boolean isPower;
	 
	 public static boolean powerButton(){
	      
		  System.out.println("powerButton method started");
		  
		  if (isPower==false){
		      isPower=true;
			  System.out.println("Tv state is ON:"+isPower);
			}
			else{
			    isPower=false;
				 System.out.println("Tv state is OFF:"+isPower);
			}
			System.out.println("powerButton method ended");
			
			return isPower;
		}
}
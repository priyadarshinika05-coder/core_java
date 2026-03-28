class HaierAC{

     static boolean isSwitch;
	 
	 public static boolean onOrOff(){
	      
		  System.out.println("onOrOff method started");
		  
		  if (isSwitch==false){
		      isSwitch=true;
			  System.out.println("AC is ON:"+isSwitch);
			}
			else{
			     isSwitch=false;
				 System.out.println("AC is OFF:"+isSwitch);
			}
			System.out.println("onOrOff method ended");
			
			return isSwitch;
		}
}
class DaikinAc{

     //static variables
     static boolean isSwitch;
	 static int maxTemperature=20;
	 static int minTemperature=10;
	 static int currentTemperature=22;
	 
	 //static methed
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
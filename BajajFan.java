class BajajFan{

     static boolean isOn;
	 
	 public static boolean powerButton(){
	      
		  System.out.println("Power button method started");
		  
		  if (isOn==false){
		      isOn=true;
			  System.out.println("Fan is ON:"+isOn);
			}
			else{
			     isOn=false;
				 System.out.println("Fan is OFF:"+isOn);
			}
			System.out.println("Power button method ended");
			
			return isOn;
		}
}
class LGRefrigerator{

     static boolean isCooling;
	 
	 public static boolean startOrstop(){
	      
		  System.out.println("Refrigerator method started");
		  
		  if (isCooling==false){
		      isCooling=true;
			  System.out.println("Fridge is ON:"+isCooling);
			}
			else{
			    isCooling=false;
				 System.out.println("Fridge is OFF:"+isCooling);
			}
			System.out.println("Refrigerator method ended");
			
			return isCooling;
		}
}
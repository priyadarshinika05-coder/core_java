class Ola{
     

	  public static String orderFood(long mobileNumber,String pickup,String droplocation,int distance){
	  System.out.println("Ola order method is started");
	  String bookingStatus=null;
	  if (mobileNumber != 0 && pickup != null && droplocation != null && distance != 0 ){
	     if(pickup.length() >0 && droplocation.length()>4 && distance>2){
		 
		     bookingStatus="your order for "+droplocation+" placed successfully";
		 }else{
		     bookingStatus="Please check the length of pickup ,droplocation ,distance";
	     }
	  }else{
	       bookingStatus="Please enter the Valide Data";
	  }
	  System.out.println("Ola order method is Ended");
	  return bookingStatus;
	  }
	  }
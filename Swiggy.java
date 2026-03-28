class Swiggy{
     

	  public static String orderFood(long mobileNumber,int quantity,String foodName,String email){
	  System.out.println("Swiggy order method is started");
	  String registerStatus=null;
	  if (mobileNumber != 0 && quantity != 0 && foodName != null && email != null ){
	     if(quantity >0 && foodName.length()>4 && email.length()>2){
		 
		     registerStatus="your order for "+quantity+" placed successfully";
		 }else{
		     registerStatus="Please check the length of quantity ,foodName ,email";
	     }
	  }else{
	       registerStatus="Please enter the Valide Data";
	  }
	  System.out.println("Swiggy order method is Ended");
	  return registerStatus;
	  }
	  }
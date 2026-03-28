class Paytm{
     

	  public static String recharge(long mobileNumber,String name,String email,String password,int amount){
	  System.out.println("paytm order method is started");
	  String rechargeStatus=null;
	  if (mobileNumber != 0 && name != null && email != null && password != null ){
	     if(name.length() >4 && email.length()>6 && password.length() >2){
		 
		     rechargeStatus="your order for "+amount+" placed successfully";
		 }else{
		     rechargeStatus="Please check the length of name ,email ,password";
	     }
	  }else{
	       rechargeStatus="Please enter the Valide Data";
	  }
	  System.out.println("paytm order method is Ended");
	  return rechargeStatus;
	  }
	  }
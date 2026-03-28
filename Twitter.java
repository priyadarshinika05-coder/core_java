class Twitter{
     

	  public static String Register(long mobileNumber,String email,String password,String username){
	  System.out.println("Twitter Register method is started");
	  String registerStatus=null;
	  if (mobileNumber != 0 && email != null && password != null && username != null ){
	     if(email.length()>8 && password.length()>5 && username.length()>2){
		 
		     registerStatus="Thank You "+username+" Registered successfully";
		 }else{
		     registerStatus="Please check the length of email ,password ,username";
	     }
	  }else{
	       registerStatus="Please enter the Valide Data";
	  }
	  System.out.println("Twitter Register method is Ended");
	  return registerStatus;
	  }
	  }
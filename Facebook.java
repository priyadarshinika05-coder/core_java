class Facebook{
     

	  public static String Register(long mobileNumber,String email,String password,String name){
	  System.out.println("Facebook Register method is started");
	  String registerStatus=null;
	  if (mobileNumber != 0 && email != null && password != null && name != null ){
	     if(email.length()>7 && password.length()>5 && name.length()>2){
		 
		     registerStatus="Thank You "+name+" Registered successfully";
		 }else{
		     registerStatus="Please check the length of email ,password ,name";
	     }
	  }else{
	       registerStatus="Please enter the Valide Data";
	  }
	  System.out.println("Facebook Register method is Ended");
	  return registerStatus;
	  }
	  }
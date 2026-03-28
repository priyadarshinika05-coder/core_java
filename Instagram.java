class Instagram{
     
	 //return type PD/Non PD
	  public static String  validateAndRegister(long mobileNumber,String psw,String birthday,String fullName,String userName){
	  System.out.println("ValidateAndRegister method is started");
	  String registerStatus=null;
	  if (mobileNumber != 0 && psw != null && birthday != null && fullName != null && userName != null ){//null pointer Execption
	     if(psw.length()>8 && fullName.length()>3 &&userName.length()>6){
		 
		     registerStatus="Thank You "+fullName+" Registered successfully";
		 }else{
		     registerStatus="Please check the length of PSW ,FullName ,User Name";
	     }
	  }else{
	       registerStatus="Please emter the Valide Data";
	  }
	  System.out.println("validateAndRegister method is Ended");
	  return registerStatus;
	  }
	  }
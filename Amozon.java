class Amozon{
     

	  public static String Register(long mobileNumber,String name,String password,String email){
	  System.out.println("Amozon Register method is started");
	  String registerStatus=null;
	  if (mobileNumber != 0 && name != null && password != null && email != null ){
	     if(name.length()>6 && password.length()>2 && email.length()>2){
		 
		     registerStatus="Thank You "+name+" Registered successfully";
		 }else{
		     registerStatus="Please check the length of name ,password ,email";
	     }
	  }else{
	       registerStatus="Please enter the Valide Data";
	  }
	  System.out.println("Amozon Register method is Ended");
	  return registerStatus;
	  }
	  }
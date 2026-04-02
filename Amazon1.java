class Amazon1{

      public boolean login(String userName,String psw){
	  System.out.println("invoking login using userName:"+userName+" and psw:"+psw);
	  String reguserName="priya";
	  String regpsw="priya@123";
	  boolean isLogin=false;
	  
	  if(userName==reguserName && psw==regpsw){
		  isLogin=true;
	  }else{
		  isLogin=false;
	  }
	  return isLogin;
	}  
	public String login(int otp,long phoneNumber){
	  System.out.println("invoking login using otp:"+otp+" and phoneNumber:"+phoneNumber);
	  int regotp=246891;
	  long regphoneNumber=9980747495l;
	  String isLogin=null;
	  if(otp==regotp && phoneNumber==regphoneNumber){
		  isLogin="login successfully";
	  }else{
		  isLogin="login failed";
	  }
	  return isLogin;
	}  
	  public String search(String productName){
      System.out.println("invoking search By productName :"+productName);
       String meassage=null;
      if(productName!=null){
	  meassage="searched productName:"+productName+" is available";
    }
      return meassage;
  }  
	public String search(String productName,double price){
    System.out.println("invoking search  productName:"+ productName+"  and price:"+price );
    String message=null;
    if(productName!=null && price!=0.0){
	  message="searched productName is available:"+productName+" and price:"+price;
	}
    return message;
  }
	  
	public String search(String productName,String color,String modelName){
    System.out.println("invoking search productName:"+productName+" and color:"+color+" and modelName:"+modelName );
    String ismessage=null;
    if(productName!=null && color!=null && modelName!=null){
	  ismessage="searched productName Name is available:"+productName+" and color:"+color +" and modelName:"+modelName;
    }
    return ismessage;
  }
	public String search(String productName,float rating){
    System.out.println("invoking search productName:"+productName+" and rating:"+rating );
    String ismessage=null;
    if(productName!=null && rating!=0.0f ){
	  ismessage="searched productName Name is available:"+productName+" and rating:"+rating;
    }
    return ismessage;
  }
  
  public String search(String productName,int engineCC){
    System.out.println("invoking search productName:"+productName+" and engineCC:"+engineCC);
    String isview=null;
    if(productName!=null && engineCC!=0){
	  isview="searched productName Name is available:"+productName+" and engineCC:"+engineCC;
    }
    return isview;
  }
	
	
	  
} 
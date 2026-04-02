class Flipkart1{

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
	  public String search(String brandName){
      System.out.println("invoking search By brandName :"+brandName);
       String meassage=null;
      if(brandName!=null){
	  meassage="searched productName:"+brandName+" is available";
    }
      return meassage;
  }  
	public String search(String brandName,double price){
    System.out.println("invoking search  brandName:"+ brandName+"  and price:"+price );
    String message=null;
    if(brandName!=null && price!=0.0){
	  message="searched brandName is available:"+brandName+" and price:"+price;
	}
    return message;
  }
	  
	public String search(String brandName,String color,int batterylife){
    System.out.println("invoking search brandName:"+brandName+" and color:"+color+" and batterylife:"+batterylife );
    String ismessage=null;
    if(brandName!=null && color!=null && batterylife!=0){
	  ismessage="searched brandName is available:"+brandName+" and color:"+color +" and batterylife:"+batterylife;
    }
    return ismessage;
  }
	public String search(String brandName,boolean iswireless){
    System.out.println("invoking search brandName:"+brandName+" and iswireless:"+iswireless );
    String ismessage=null;
    if(brandName!=null && iswireless!=false ){
	  ismessage="searched brandName  is available:"+brandName+" and iswireless:"+iswireless;
    }
    return ismessage;
  }
  
  public String search(String brandName,long productId){
    System.out.println("invoking search brandName:"+brandName+" and productId:"+productId);
    String isview=null;
    if(brandName!=null && productId!=0){
	  isview="searched brandName is available:"+brandName+" and productId:"+productId;
    }
    return isview;
  }
	
	
	  
} 
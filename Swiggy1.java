class Swiggy1{

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
	  public String search(String foodName){
      System.out.println("invoking search By foodName :"+foodName);
       String meassage=null;
      if(foodName!=null){
	  meassage="searched FoodName:"+foodName+" is available";
    }
      return meassage;
  }  
	public String search(String foodName,double price){
    System.out.println("invoking search  foodName:"+ foodName+"  and price:"+price );
    String message=null;
    if(foodName!=null && price!=0.0){
	  message="searched foodName is available:"+foodName+" and price:"+price;
	}
    return message;
  }
	  
	public String search(String foodName,String restauant,int quantity){
    System.out.println("invoking search foodName:"+foodName+" and restauant:"+restauant+" and quantity:"+quantity );
    String isOrder=null;
    if(foodName!=null && restauant!=null && quantity!=0){
	  isOrder="searched foodName is available:"+foodName+" and restauant:"+restauant +" and quantity:"+quantity;
    }
    return isOrder;
  }
	public String search(String foodName,String address ){
    System.out.println("invoking search foodName:"+foodName+" and address:"+address );
    String details=null;
    if(foodName!=null && address!=null ){
	  details="searched foodName  is available:"+foodName+" and address:"+address;
    }
    return details;
  }
  
  public String search(String foodName,long foodId){
    System.out.println("invoking search foodName:"+foodName+" and foodId:"+foodId);
    String orderNum=null;
    if(foodName!=null && foodId!=0){
	  orderNum="searched foodName is available:"+foodName+" and foodId:"+foodId;
    }
    return orderNum;
  }
	
	
	  
} 
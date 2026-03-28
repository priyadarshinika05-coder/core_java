class Menu{


     public void getMenuDetails(){
	      System.out.println("Invoking getMenuDetails");
	 }
		  
	 public void checkFoodByFoodName(String foodName){
		 System.out.println("Invoking checkFoodByFoodName");
		 
    if(foodName=="Idli"){
	   System.out.println("Available");
	 }
	 
	 else if(foodName=="Dosa"){
	   System.out.println("Available");
	 }
	 
	 else if(foodName=="poori"){
	   System.out.println("Available");
	 }
	 
 
	 else if(foodName=="Biryani"){
	   System.out.println("Available");
	 }
	 
	 else if(foodName=="Masala Dosa"){
	   System.out.println("Available");
	 }else{
		 
		 System.out.println("Not Available");
		 
	 }
	 }
	 public double checkFoodPriceByFoodName(String foodName){
		 System.out.println("invoking checkFoodByFoodName and the food Name:"+foodName);
		 double foodPrice=0.0;
	  if(foodName=="Idli"){
	  foodPrice=50.0;
	  }
	  
	  else if(foodName=="Dosa"){
	  foodPrice=60.0;
	  }
	  
	  else if(foodName=="poori"){
	  foodPrice=90.0;
	  }
	  
	  else if(foodName=="Biryani"){
	  foodPrice=100.0;
	  }
	  
	  else if(foodName=="Masala Dosa"){
      foodPrice=70.0;
	  }else{
		  
      System.out.println(foodName+" is Not Available");
	  
      }
	  return foodPrice;
	  }
}
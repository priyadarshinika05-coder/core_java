class AmozonProduct{
     
	 
	 static String productNames[]={"oppo A59","loptopx5pro","LG refrigerator","iphone14ProMax","vivo A38"};
     static float productPrice[]={19999.09f,200000.99f,39999.99f,1500000.00f,540000.08f};
     static float productRating[]={4.5f,88.9f,78.98f,68.88f,21.09f};
	 public static void getAmozonProductDetails(){
	 
	 for(int index=0;index<productNames.length;index++){
		 
	  System.out.println("Product Name:"+productNames[index]);
	  System.out.println("Product price:"+productPrice[index]);
	  System.out.println("Product rating:"+productRating[index]);	
      	  
	   }
	   }
}
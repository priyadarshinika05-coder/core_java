class MenuRunner{

      public static void main(String[] food){
	  
	  Menu amaravathi =new Menu();
	  amaravathi.getMenuDetails();
	  amaravathi.checkFoodByFoodName("Idli");
	  amaravathi.checkFoodByFoodName("chapathi");
	  amaravathi.checkFoodByFoodName("poori");
	  amaravathi.checkFoodByFoodName("Fish kabab");
	  amaravathi.checkFoodByFoodName("Biryani");
	
     double Price=amaravathi.checkFoodPriceByFoodName("Mutton Biryani");
	     System.out.println("The price is:"+Price);
		 
	 Price=amaravathi.checkFoodPriceByFoodName("Idli");
	     System.out.println("The price is:"+Price);
		 
	 Price=amaravathi.checkFoodPriceByFoodName("Dosa");
	     System.out.println("The price is:"+Price);
		 
	 Price=amaravathi.checkFoodPriceByFoodName("poori");
	     System.out.println("The price is:"+Price);
	
	 Price=amaravathi.checkFoodPriceByFoodName("Masala Dosa");
	     System.out.println("The price is:"+Price);
		 
	  }
}
class SwiggyRunner{
	public static void main(String[] args) {
		Swiggy SwiggyApp=new Swiggy();
		double foodPrice=SwiggyApp.getPriceByFoodName("Pizzas");
		System.out.println("Food Price is:"+foodPrice);

		double totalFoodPrice=SwiggyApp.getTotalAmountByPriceAndQuantity(foodPrice,5,6.4f);
		System.out.println("Total price is:"+totalFoodPrice);

		System.out.println("---------------");

		double foodPrices=SwiggyApp.getPriceByFoodName("butter masala");
		System.out.println("Food Price is:"+foodPrices);

		double totalFoodPrices=SwiggyApp.getTotalAmountByPriceAndQuantity(foodPrice,9,8.6f);
		System.out.println("Total price is:"+totalFoodPrices);

		System.out.println("---------------");

		
		double foodPric=SwiggyApp.getPriceByFoodName("Set dosa");
		System.out.println("Food Price is:"+foodPric);

		double totalFoodPric=SwiggyApp.getTotalAmountByPriceAndQuantity(foodPrice,8,9.3f);
		System.out.println("Total price is:"+totalFoodPric);

		System.out.println("---------------");

		
		double food=SwiggyApp.getPriceByFoodName("Burgers");
		System.out.println("Food Price is:"+food);

		double totalFood=SwiggyApp.getTotalAmountByPriceAndQuantity(foodPrice,2,5.4f);
		System.out.println("Total price is:"+totalFood);

		System.out.println("---------------");

		
		double prices=SwiggyApp.getPriceByFoodName("Poori");
		System.out.println("Food Price is:"+prices);

		double totalPrices=SwiggyApp.getTotalAmountByPriceAndQuantity(foodPrice,6,11f);
		System.out.println("Total price is:"+totalPrices);
		
	}


}
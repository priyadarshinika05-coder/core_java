class Swiggy{

	public double getPriceByFoodName(String foodName){
		System.out.println("invoking a getPriceByFoodName:"+foodName);
		double price=0.0;
		if("butter masala"==foodName){
			price=60.99;
		}else if("Chicken fry"==foodName){
			price=79.99;
		}else if("Set dosa"==foodName){
			price=40;
		}else if("Masala dosa"==foodName){
			price=50;
		}else if("Idli"==foodName){
			price=40;
		}else if("Poori"==foodName){
			price=45.99;
		}else if("Pizzas"==foodName){
			price=250;
		}else if("Burgers"==foodName){
			price=100;
		}else if("Briyani"==foodName){
			price=110;
		}else if("Kabab"==foodName){
			price=170;
		}else if("chicken curry"==foodName){
			price=140;
		}else{
			price=0.0;
		}

		System.out.println("End of getPriceByFoodName ");
		return price;
	}

	public double getTotalAmountByPriceAndQuantity(double price, int quantity, float discount) {
    System.out.println("Invoking a getTotalAmountByPriceAndQuantity");

    double totalPrice = price * quantity;

    double discountAmount = totalPrice * (discount / 100);
    totalPrice = totalPrice - discountAmount;

    System.out.println("End of the getTotalAmountByPriceAndQuantity");

    return totalPrice;

	}
}
class Zomato{

	public double getPriceByFoodName(String foodName){
		System.out.println("invoking a getPriceByFoodName:"+foodName);
		double price=0.0;
		if("Idli"==foodName){
			price=40.99;
		}else if("Palav"==foodName){
			price=50.98;
		}else if("Plain dosa"==foodName){
			price=40;
		}else if("Masala dosa"==foodName){
			price=50;
		}else if("Briyani"==foodName){
			price=100;
		}else if("Poori"==foodName){
			price=80.65;
		}else if("Chapathi"==foodName){
			price=70.55;
		}else if("Pongal"==foodName){
			price=120;
		}else if("chicken cury"==foodName){
			price=150.88;
		}else if("Kabab"==foodName){
			price=170;
		}else if("Chicken fry"==foodName){
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
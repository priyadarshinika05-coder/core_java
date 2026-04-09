class Amazon{

	public double getPriceByProduct(String Product){
		System.out.println("invoking a getPriceByProduct:"+Product);
		double price=0.0;
		if("Burger"==Product){
			price=90.8;
		}else if("Headphone"==Product){
			price=17000.43;
		}else if("mobile"==Product){
			price=89000;
		}else if("HeadphoneLaptop"==Product){
			price=25000;
		}else if("freez"==Product){
			price=1500;
		}else if("fan"==Product){
			price=9069.65;
		}else if("Earbuds"==Product){
			price=6590.55;
		}else if("Tv"==Product){
			price=15899;
		}else if("cloth"==Product){
			price=16999.45;
		}else if("shoe"==Product){
			price=17999;
		}else if("slipers"==Product){
			price=1700;
		}else{
			price=19000.5;
		}

		System.out.println("End of getPriceByProduct ");
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
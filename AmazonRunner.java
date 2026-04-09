class AmazonRunner{
	public static void main(String[] args) {
		Amazon App=new Amazon();
		double ProductPrice=App.getPriceByProduct("slipers");
		System.out.println("Product Price is:"+ProductPrice);

		double totalProductPrice=App.getTotalAmountByPriceAndQuantity(ProductPrice,6,6.8f);
		System.out.println("Total price is:"+totalProductPrice);

		System.out.println("---------------");

		double ProductPrices=App.getPriceByProduct("shoe");
		System.out.println("Product Price is:"+ProductPrices);

		double totalProductPrices=App.getTotalAmountByPriceAndQuantity(ProductPrice,9,9.9f);
		System.out.println("Total price is:"+totalProductPrices);

		System.out.println("---------------");

		
		double productPric=App.getPriceByProduct("freez");
		System.out.println("Food Price is:"+productPric);

		double totalProductPric=App.getTotalAmountByPriceAndQuantity(ProductPrice,9,4.5f);
		System.out.println("Total price is:"+totalProductPric);

		System.out.println("---------------");

		
		double Product=App.getPriceByProduct("cloth");
		System.out.println("Product Price is:"+Product);

		double totalProduct=App.getTotalAmountByPriceAndQuantity(ProductPrice,2,5.8f);
		System.out.println("Total price is:"+totalProduct);

		System.out.println("---------------");

		
		double prices=App.getPriceByProduct("Tv");
		System.out.println("Product Price is:"+prices);

		double totalPrices=App.getTotalAmountByPriceAndQuantity(ProductPrice,3,6.6f);
		System.out.println("Total price is:"+totalPrices);
		
	}


}
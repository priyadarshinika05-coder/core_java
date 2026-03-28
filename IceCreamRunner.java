class IceCreamRunner{
     
	 public static void main(String[] args){
	 
	    IceCream ic1=new IceCream();
		ic1.getIceCreamDetails();
		ic1.checkIceCreamByName("Mango");
		ic1.checkIceCreamByName("ButterScotch");
		ic1.checkIceCreamByName("pista");
		ic1.checkIceCreamByName("Corn");
		
		 IceCream ic2=new IceCream();
		ic2.checkIceCreamByName("choolate");
		ic2.checkIceCreamByName("ButterScotch");
		ic2.checkIceCreamByName("Mint choolate");
		ic2.checkIceCreamByName("Guava");
		
		 IceCream ic3=new IceCream();
		ic3.checkIceCreamByName("ButterPecan");
		ic3.checkIceCreamByName("pineapple");
		ic3.checkIceCreamByName("papaya");
		ic3.checkIceCreamByName("kulfi");
		
		 IceCream ic4=new IceCream();
		ic4.checkIceCreamByName("pista");
		ic4.checkIceCreamByName("Strawberry");
		ic4.checkIceCreamByName("kulfi");
		ic4.checkIceCreamByName("Cherry");
		
		 IceCream ic5=new IceCream();
		ic5.checkIceCreamByName("Rocky Road");
		ic5.checkIceCreamByName("Mint choolate");
		ic5.checkIceCreamByName("Mango");
		ic5.checkIceCreamByName("Lychee");
}
}

class VegMenuRunner{
     
	 public static void main(String[] args){
	 
	    VegMenu VidyarthiBhavan=new VegMenu();
		VidyarthiBhavan.getVegMenuDetails();
		VidyarthiBhavan.checkVegMenuByName("Butter dosa");
		VidyarthiBhavan.checkVegMenuByName("Pulao");
		VidyarthiBhavan.checkVegMenuByName("Idli");
		VidyarthiBhavan.checkVegMenuByName("Vada");
		
		 VegMenu Mavalli=new VegMenu();
		Mavalli.checkVegMenuByName("Paneer Butter masala");
		Mavalli.checkVegMenuByName("Aloo porata");
		Mavalli.checkVegMenuByName("Butter dosa");
		Mavalli.checkVegMenuByName("Curd Rice");
		
		 VegMenu Sattvam=new VegMenu();
		Sattvam.checkVegMenuByName("Jeera rice");
		Sattvam.checkVegMenuByName("Pulao");
		Sattvam.checkVegMenuByName("Rasam");
		Sattvam.checkVegMenuByName("Aloo porata");
		
		 VegMenu Hallimane=new VegMenu();
		Hallimane.checkVegMenuByName("Chapti");
		Hallimane.checkVegMenuByName("Idli");
		Hallimane.checkVegMenuByName("Paneer");
		Hallimane.checkVegMenuByName("Jeera rice");
		
		 VegMenu Rajdhani=new VegMenu();
		Rajdhani.checkVegMenuByName("Aloo porata");
		Rajdhani.checkVegMenuByName("Paneer Butter masala");
		Rajdhani.checkVegMenuByName("Lemon rice");
		Rajdhani.checkVegMenuByName("Dal Tadka");
		
}
}

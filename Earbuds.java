class Earbuds{

   String brand;
   String model;
   byte batteryLife;
   float bluetoothVersion;
   double price;
   boolean noiseCancellation;
   
   public Earbuds(){
		 System.out.println("Fire-Boltt Aero TWS Earbuds Custom EQ, Wireless Bluetooth 5.4, Music & App Support, 50H Playtime, Fast Charging Case, 50ms Low Latency for Gaming, Touch Controls, IPX4 Waterproof, Clear Calls - Black");
	 }
	 
	 public Earbuds(String brand,String model,byte batteryLife,float bluetoothVersion,double price,boolean noiseCancellation){
		 System.out.println("I am the Earbuds constructor with parameter:"+brand+","+model+","+batteryLife+","+bluetoothVersion+","+price+","+noiseCancellation);
	 }
	 
	 public void getEarbudsData(){
		 System.out.println("Earbuds data");
		 System.out.println("brand:"+brand);
		 System.out.println("model:"+model);
		 System.out.println("batteryLife:"+batteryLife);
		 System.out.println("bluetoothVersion:"+bluetoothVersion);
		 System.out.println("price:"+price);
		 System.out.println("noiseCancellation:"+noiseCancellation);
		 
	 }
}
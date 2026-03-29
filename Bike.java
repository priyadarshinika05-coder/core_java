class Bike{

    String bikeModel;
	int engineCC;
	byte gears;
	double price;
	String color;
	String fueltype;class Bike{

    String bikeModel;
	int engineCC;
	byte gears;
	double price;
	String color;
	String fueltype;
	
	public Bike(){
		 System.out.println("Bajaj Pulsar 125 Neon Disc Motorcycle/Motorbike - Ebony Black With Platinum Silver Decals - Ex-Showroom");
	 }
	 
	 public Bike(String bikeModel,int engineCC,byte gears,double price,String color,String fueltype){
		 System.out.println("I am the Bike constructor with parameter:"+bikeModel+","+engineCC+","+gears+","+price+","+color+","+fueltype);
	 }
	 
	 public void getBikeData(){
		 System.out.println("Bike data");
		 System.out.println("bikeModel:"+bikeModel);
		 System.out.println("engineCC:"+engineCC);
		 System.out.println("gears:"+gears);
		 System.out.println("price:"+price);
		 System.out.println("color:"+color);
		 System.out.println("fueltype:"+fueltype);
		 
	 }
}
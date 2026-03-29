class BikeRunner{

    public static void main(String[]args){
	Bike b1 = new Bike("Royal Enfield Classic 350",359,(byte)6,150000,"Black","Petrol");
    b1.bikeModel = "Royal Enfield Classic 350";
    b1.engineCC = 349;
    b1.gears = 5;
    b1.price = 190000;
    b1.color = "Black";
    b1.fueltype = "Petrol"; 
	
	b1.getBikeData();
	}
}
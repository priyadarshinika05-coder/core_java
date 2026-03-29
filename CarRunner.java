class CarRunner{

      public static void main(String []args){
	  
	    Car car1=new Car("Hyundai i20",5,2023,20.5f,"Petrol",120);
        car1.carModel = "Hyundai i20";
        car1.gear = 5;
        car1.modelNumber = 2023;
        car1.mileage = 20.5f;
        car1.fueltype = "Petrol";
        car1.speed = 120;
		
		car1.getCarData();
}
}
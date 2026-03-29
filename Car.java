class Car{
     
	 String carModel;
	 int gear;
	 int modelNumber;
	 float mileage;
	 String fueltype;
	 int speed;
	 /*
	 public Car(){
		 System.out.println("check fuel and tyres");
	 }
	 
	 */
	 public Car(String carModel,int gear,int modelNumber,float mileage,String fueltype,int speed){
		 System.out.println("I am the Car constructor with parameter:"+carModel+","+gear+","+modelNumber+","+mileage+","+fueltype+","+speed);
	 }
	 
	 public void getCarData(){
		 System.out.println("Car data");
		 System.out.println("carModel:"+carModel);
		 System.out.println("gear:"+gear);
		 System.out.println("modelNumber:"+modelNumber);
		 System.out.println("mileage:"+mileage);
		 System.out.println("fueltype:"+fueltype);
		 System.out.println("Speed:"+speed);
		 
	 }
}
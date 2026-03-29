class WashingMachine{

   String brand;
   int capacity;
   boolean automatic;
   byte warrantly;
   String type;
   float price;
   
   public WashingMachine(){
        System.out.print("Whirlpool 7 kg Magic Clean 5 Star Fully Automatic Top Load Washing Machine Grey (MAGIC CLEAN 7.0 GENX ");
   }
   
   public WashingMachine(String brand,int capacity, boolean automatic,byte warrantly,String type,float price){
		 System.out.println("I am WashingMachine the constructor with parameter:"+brand+","+capacity+","+automatic+","+warrantly+","+type+","+price);
	 }
	 
   public void getWashingMachineData(){
	   System.out.println("Brand:"+brand);
	   System.out.println("capacity:"+capacity);
	   System.out.println("automatic:"+automatic);
	   System.out.println("warrantly:"+warrantly);
	   System.out.println("type:"+type);
	   System.out.println("Price:"+price);
   }

}
class Refrigerator{

    String brand;
	String color;
	int capacity;
	byte doors;
	double price;
	String company;
	
	public Refrigerator(){
        System.out.print("Whirlpool 192 L 3 Star Vitamagic PRO Frost Free Direct-Cool Single Door Refrigerator");
   }
   
   public Refrigerator(String brand,String color,int capacity,byte doors,double price,String company){
		 System.out.println("I am Refrigerator the constructor with parameter:"+brand+","+color+","+capacity+","+doors+","+price+","+company);
	 }
	 
   public void getRefrigeratorData(){
	   System.out.println("Brand:"+brand);
	   System.out.println("color:"+color);
	   System.out.println("capacity:"+capacity);
	   System.out.println("doors:"+doors);
	   System.out.println("price:"+price);
	   System.out.println("company:"+company);
   }

}
class Fan{

   String brand;
   String type;
   byte wings;
   int speedLevel;
   float bladeSize;
   long price;
   
   public Fan(){
        System.out.print("Colorbot Stella BLDC Ceiling Fans 1200mm | BEE 5 Star Rated 370 RPM");
   }
   
   public Fan(String brand,String type,byte wings,int speedLevel,float bladeSize,long price){
		 System.out.println("I am the Fan constructor with parameter:"+brand+","+type+","+wings+","+speedLevel+","+bladeSize+","+price);
	 }
	 
   public void getFanData(){
	   System.out.println("Brand:"+brand);
	   System.out.println("type:"+type);
	   System.out.println("Wings:"+wings);
	   System.out.println("SpeedLevel:"+speedLevel);
	   System.out.println("BladSize:"+bladeSize);
	   System.out.println("Price:"+price);
   }

}
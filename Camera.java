class Camera{

   String lensType;
   int megapixel;
   String model;
   byte zoom;
   String color;
   String batteryType;
   
   public Camera(){
        System.out.print("Maizic Smarthome 3 MP FHD WiFi Indoor Mini Fox Ptz Security Camera with Color");
   }
   public Camera(String lensType,int megapixel,String model,byte zoom,String color,String batteryType){
		 System.out.println("I am the Camera constructor with parameter:"+lensType+","+megapixel+","+model+","+zoom+","+color+","+batteryType);
	 }
   public void getCameraData(){
	   System.out.println("lensType:"+lensType);
	   System.out.println("megapixel:"+megapixel);
	   System.out.println("model:"+model);
	   System.out.println("zoom:"+zoom);
	   System.out.println("color:"+color);
	   System.out.println("batteryType:"+batteryType);
   }

}
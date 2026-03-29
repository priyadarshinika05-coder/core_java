class Tv{

     String brand;
	 int screenSize;
	 short volumeLevel;
	 byte usbPorts;
	 float price;
	 String resolution;
	 
	 public Tv(){
		 System.out.println("TCL 139 cm (55 inches) 4K Ultra HD Smart QLED Google TV 55P71K");
	 }
	 
	 public Tv(String brand,int screenSize,short volumeLevel,byte usbPorts,float price,String resolution){
		 System.out.println("I am the Tv constructor with parameter:"+brand+","+screenSize+","+volumeLevel+","+usbPorts+","+price+","+resolution);
	 }
	 
	 public void getTvData(){
		 System.out.println("Tv data");
		 System.out.println("brand:"+brand);
		 System.out.println("screenSize:"+screenSize);
		 System.out.println("usbPorts:"+usbPorts);
		 System.out.println("price:"+price);
		 System.out.println("resolution:"+resolution);
	 }
}
class TvRunner{

   public static void main(String []post){
   
        Tv ref=new Tv("Samsung",55,(short)20,(byte)3,45999.99f,"4k");
	    ref.brand = "Samsung";
        ref.screenSize = 55;
        ref.volumeLevel = 20;
        ref.usbPorts = 3;
        ref.price = 45999.99f;
        ref.resolution = "4K";
		
		ref.getTvData();
   
   }
}
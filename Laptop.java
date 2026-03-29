class Laptop{
 
   String processor;
   int ram;
   int storage;
   String os;
   float batterylife;
   double weight;
   
   public Laptop(){
        System.out.print("HP OmniBook 5 OLED , Snapdragon X Processor (16GB LPDDR5x, 512GB SSD) 2K, 14''/35.6cm, Next-Gen AI Laptop");
   }
   public Laptop(String processor,int ram,int storage,String os,float batterylife,double weight){
		 System.out.println("I am the Laptop constructor with parameter:"+processor+","+ram+","+storage+","+os+","+batterylife+","+weight);
	 }
   public void getLaptopData(){
	   System.out.println("Processor:"+processor);
	   System.out.println("Ram:"+ram);
	   System.out.println("Storage:"+storage);
	   System.out.println("OS:"+os);
	   System.out.println("Batterylife:"+batterylife);
	   System.out.println("Weight:"+weight);
   }
}
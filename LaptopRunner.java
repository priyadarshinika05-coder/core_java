class LaptopRunner{

     public static void main(String []args){
	    Laptop ref=new Laptop("Snapdragon 8 Gen 2",7,124,"Android",35.6f,145.8);
		ref.processor="Snapdragon 8 Gen 2";
        ref.ram=8;
        ref.storage=128;
        ref.os="Android";
        ref.batterylife=24.5f;
        ref.weight = 189.5;
		
		ref.getLaptopData();
		
		
   }
   }
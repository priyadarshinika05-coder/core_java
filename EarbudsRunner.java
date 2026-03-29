class EarbudsRunner{

    public static void main(String []args){
		
	Earbuds h1 = new Earbuds("LG","WH-1000XM5",(byte)40,6.4F,56999.98,true);	
	h1.brand = "Sony";
    h1.model = "WH-1000XM5";
    h1.batteryLife = 30;          
    h1.bluetoothVersion = 5.2f;   
	h1.price = 29999.99;
    h1.noiseCancellation = true;
	
	h1.getEarbudsData();
	
	}
}
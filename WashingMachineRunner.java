class WashingMachineRunner{

    public static void main(String []args){
	WashingMachine wm1 = new WashingMachine("Samsung",8,true,(byte)5,"Front Load",78500.70f);
    wm1.brand = "Samsung";
    wm1.capacity = 7;          
    wm1.automatic = true;
    wm1.warrantly = 2;          
    wm1.type = "Front Load";
    wm1.price = 24500.50f;
	
	wm1.getWashingMachineData();
	}
}
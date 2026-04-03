class WatchRunner{
    
	public static void main(String []args){
	Watch w1=new Watch("Apple",45000,1.9f,true,18,3267912876543L);
	w1.displayWatchDetails();
	
	Watch w2 = new Watch("Samsung", 30000, 1.8f, true, 20, 2345686548L);
	w2.displayWatchDetails();
	
    Watch w3 = new Watch("Fossil", 22000, 1.7f, true, 24, 876543456736L);
	w3.displayWatchDetails();
	
    Watch w4 = new Watch("Titan", 5000, 0.0f, false, 0, 2345687654L);
	w4.displayWatchDetails();
	
    Watch w5 = new Watch("Casio", 8000, 0.0f, false, 0, 2345654787L);
	w5.displayWatchDetails();
	
    Watch w6 = new Watch("Noise", 4000, 1.6f, true, 10, 765433456056L);
	w6.displayWatchDetails();
	
    Watch w7 = new Watch("Boat", 3500, 1.5f, true, 12, 2345678765L);
	w7.displayWatchDetails();
	
    Watch w8 = new Watch("FireBoltt", 2500, 1.4f, true, 8, 98765876523L);
	w8.displayWatchDetails();
	
    Watch w9 = new Watch("Rolex", 250000, 0.0f, false, 0, 23459876098L);
	w9.displayWatchDetails();
	
    Watch w10 = new Watch("OnePlus", 18000, 1.8f, true, 16, 654566544554L);
	w10.displayWatchDetails();

	}
}
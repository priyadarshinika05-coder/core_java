class NonVegMenuRunner{
     
	 public static void main(String[] args){
	 
	    NonVegMenu ShivajiMilitaryHotel=new NonVegMenu();
		ShivajiMilitaryHotel.getNonVegMenuDetails();
		ShivajiMilitaryHotel.checkNonVegMenuByName("Fish fry");
		ShivajiMilitaryHotel.checkNonVegMenuByName("Prawn fry");
		ShivajiMilitaryHotel.checkNonVegMenuByName("Chicken curry");
		ShivajiMilitaryHotel.checkNonVegMenuByName("Chicken Kabab");
		
		NonVegMenu RoyalNonVegHotel=new NonVegMenu();
		RoyalNonVegHotel.checkNonVegMenuByName("Butter chicken");
		RoyalNonVegHotel.checkNonVegMenuByName("Egg Bhurji");
		RoyalNonVegHotel.checkNonVegMenuByName("Chicken65");
		RoyalNonVegHotel.checkNonVegMenuByName("Tandoori Chicken");
		
	    NonVegMenu BiryaniPalace=new NonVegMenu();
		BiryaniPalace.checkNonVegMenuByName("Prawn fry");
	    BiryaniPalace.checkNonVegMenuByName("Mutton biriyani");
		BiryaniPalace.checkNonVegMenuByName("Mutton Curry");
		BiryaniPalace.checkNonVegMenuByName("Chicken65");
		
		NonVegMenu TheCurrySpot=new NonVegMenu();
		TheCurrySpot.checkNonVegMenuByName("Fish Tikka");
		TheCurrySpot.checkNonVegMenuByName("Prawn fry");
		TheCurrySpot.checkNonVegMenuByName("Mutton Keema");
		TheCurrySpot.checkNonVegMenuByName("Egg Bhurji");
		
		NonVegMenu BoneBarrel=new NonVegMenu();
		BoneBarrel.checkNonVegMenuByName("Mutton biriyani");
		BoneBarrel.checkNonVegMenuByName("Garlic Butter Prawn");
		BoneBarrel.checkNonVegMenuByName("Fish fry");
		BoneBarrel.checkNonVegMenuByName("Crab Curry");
		
}
}

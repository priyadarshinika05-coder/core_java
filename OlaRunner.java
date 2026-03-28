class OlaRunner{
      
	  
	public static void main(String []args){
	     
        System.out.println("--------First time method Call-----");
        String shamu =Ola.orderFood(56285588906l,"BTM","Majestic",10);
        System.out.println(shamu);
		
		System.out.println("--------Second time method Call-----");
        String nandu =Ola.orderFood(4567888265l,"Indiranagar","Whitefield",15);
        System.out.println(nandu);
	}
}		
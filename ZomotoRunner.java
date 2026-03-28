class ZomotoRunner{
      
	  
	public static void main(String []args){
	     
        System.out.println("--------First time method Call-----");
        String shamu =Zomoto.orderFood(3753675423l,"2","pizza","shamu@gmail.com");
        System.out.println(shamu);
		
		System.out.println("--------Second time method Call-----");
        String nandu =Zomoto.orderFood(567894321l,"2","pizza","nandu@gmail.com");
        System.out.println(nandu);
}
}		
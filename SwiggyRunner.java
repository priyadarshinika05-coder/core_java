class SwiggyRunner{
      
	  
	public static void main(String []args){
	     
        System.out.println("--------First time method Call-----");
        String shamu =Swiggy.orderFood(8971679546l,2,"Burger","shamu@gmail.com");
        System.out.println(shamu);
		
		System.out.println("--------Second time method Call-----");
        String nandu =Swiggy.orderFood(45678794332l,2,"Burger","nandu@gmail.com");
        System.out.println(nandu);
}
}		
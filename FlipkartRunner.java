class FlipkartRunner{
      
	  
	public static void main(String []args){
	     
        System.out.println("--------First time method Call-----");
        String rakshi =Flipkart.Register(6864436281l,"rakshitha ka","rakshi_123","rakshitha@gmail.com");
        System.out.println(rakshi);
		
		System.out.println("--------Second time method Call-----");
        String punya =Flipkart.Register(9876554321l,"punya a","punya_453","punya31@gmail.com");
        System.out.println(punya);
}
}		
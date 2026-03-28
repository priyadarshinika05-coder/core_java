class TwitterRunner{
      
	  
	public static void main(String []args){
	     
        System.out.println("--------First time method Call-----");
        String sushma =Twitter.Register(6864436281l,"sushmitha@gmail.com","sushma_123","sushmitha ka");
        System.out.println(sushma);
		
		System.out.println("--------Second time method Call-----");
        String punya =Twitter.Register(9876554321l,"punya31@gmail.com","punya_453","punya a");
        System.out.println(punya);
}
}		
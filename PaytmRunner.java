class PaytmRunner{
      
	  
	public static void main(String []args){
	     
        System.out.println("--------First time method Call-----");
        String divya =Paytm.recharge(4563782194l,"divya","divya@gmail.com","divya_123",500);
        System.out.println(divya);
		
		System.out.println("--------Second time method Call-----");
        String punya =Paytm.recharge(8976453695l,"punya","punya@gmail.com","punya_123",500);
        System.out.println(punya);
	}
}		
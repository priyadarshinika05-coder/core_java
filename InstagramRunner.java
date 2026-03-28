class InstagramRunner{
      
	  
	public static void main(String []args){
	     
        System.out.println("--------First time method Call-----");
        String keerthi =Instagram.validateAndRegister(5687826467l,"@keerthi1234","07-02-2005","keerthi TK","keerthi_05");
        System.out.println(keerthi);
		
		System.out.println("--------Second time method Call-----");
        String moulya =Instagram.validateAndRegister(5687826467l,"@moulya1234","05-06-2005","moulya mr","moulya_07");
        System.out.println(moulya);
}
}		
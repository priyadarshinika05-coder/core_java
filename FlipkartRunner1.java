class FlipkartRunner1{
     
	 public static void main(String []args){
	 Flipkart a1=new Flipkart();
	 
	 boolean login=a1.login("priya","priya@123");
	 System.out.println(login);
	 
	 String result=a1.login(246891,9980747495l);
	 System.out.println(result);
	 
	 String msg=a1.search("Earbuds");
	 System.out.println(msg);
	 
	 String results=a1.search("Earbuds",1299.99);
	 System.out.println(results);
	 
	 String result1=a1.search("Earbuds","black",42);
	 System.out.println(result1);
	 
	 String view=a1.search("Earbuds",true);
	 System.out.println(view);
	 
	 String message=a1.search("Earbuds",12344567890l);
	 System.out.println(message);
	 }
}
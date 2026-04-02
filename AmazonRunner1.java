class AmazonRunner1{
     
	 public static void main(String []args){
	 Amazon a1=new Amazon();
	 
	 boolean login=a1.login("priya","priya@123");
	 System.out.println(login);
	 
	 String result=a1.login(246891,9980747495l);
	 System.out.println(result);
	 
	 String msg=a1.search("bajaj pulsar");
	 System.out.println(msg);
	 
	 String results=a1.search("bajaj pulsar",120000.50);
	 System.out.println(results);
	 
	 String result1=a1.search("bajaj pulsar","blue","pulsar");
	 System.out.println(result1);
	 
	 String view=a1.search("bajaj pulsar",4.6f);
	 System.out.println(view);
	 
	 String message=a1.search("bajaj pulsar",150);
	 System.out.println(message);
	 }
}
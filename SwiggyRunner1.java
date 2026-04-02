class SwiggyRunner1{
     
	 public static void main(String []args){
	 Swiggy order=new Swiggy();
	 
	 boolean login=order.login("priya","priya@123");
	 System.out.println(login);
	 
	 String log=order.login(246891,9980747495l);
	 System.out.println(log);
	 
	 String msg=order.search("Malasa Dose");
	 System.out.println(msg);
	 
	 String results=order.search("Malasa Dose",150.05);
	 System.out.println(results);
	 
	 String result1=order.search("Malasa Dose","Pure Veg Pasadise",3);
	 System.out.println(result1);
	 
	 String view=order.search("Malasa Dose","Angondhalli");
	 System.out.println(view);
	 
	 String isOrder=order.search("Malasa Dose",895564264256l);
	 System.out.println(isOrder);
	 }
}
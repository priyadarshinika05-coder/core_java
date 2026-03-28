class TpLinkRouterRunner{

     public static void main(String[]args){
	 
	     System.out.println("------- First Time Method Call -------");
		 boolean RouterStatus=TpLinkRouter.connectDisconnect();
		 System.out.println("Main Method Router Status:"+RouterStatus);
		 
		 System.out.println("------- Second Time Method Call -------");
		 TpLinkRouter.connectDisconnect();
		 
		 System.out.println("------- Third Time Method Call -------");
		 TpLinkRouter.connectDisconnect();
		 
		 System.out.println("------- Fourth Time Method Call -------");
		 TpLinkRouter.connectDisconnect();
		 
		 System.out.println("------- Fifth Time Method Call -------");
		 TpLinkRouter.connectDisconnect();
	 }
}
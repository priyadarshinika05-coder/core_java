class ChatsRunner{

      public static void main(String[] args){
	   
	    Chats Chats1=new Chats();
		Chats1.getChatsDetails();
	    Chats1.checkChatsByName("Eggrole");
	    Chats1.checkChatsByName("Gobirice");
	    Chats1.checkChatsByName("Samosa chaat");
	    Chats1.checkChatsByName("Punipuri");
		
	  
	    Chats Chats2=new Chats();
		Chats2.checkChatsByName("Corn chaat");
	    Chats2.checkChatsByName("Masalapuri");
	    Chats2.checkChatsByName("Punipuri");
	    Chats2.checkChatsByName("Bhel Puni");
		

		Chats Chats3=new Chats();
		Chats3.checkChatsByName("Aloo chaat");
	    Chats3.checkChatsByName("Gobi Manchuri");
	    Chats3.checkChatsByName("Dahi puri");
	    Chats3.checkChatsByName("Sandwitch");
		
	    Chats Chats4=new Chats();
	    Chats4.checkChatsByName("Fried rice");
	    Chats4.checkChatsByName("Sandwitch");
	    Chats4.checkChatsByName("Eggrole");
	    Chats4.checkChatsByName("Cheese chaat");
		
		Chats Chats5=new Chats();
		Chats5.checkChatsByName("Aloo chaat");
	    Chats5.checkChatsByName("Masalapuri");
	    Chats5.checkChatsByName("Noodles");
	    Chats5.checkChatsByName("Sev puri");

	  }
}
class Book{

    String bookName;
	String author;
	float price;
	int pages;
	String publisher;
	long isbn;
	/*
	 public Book(){
		 System.out.println("print book details");
	 }
	 */
	 public Book(String bookName,String author,float price,int pages,String publisher,long isbn){
		 System.out.println("I am the Book constructor with parameter:"+bookName+","+author+","+price+","+pages+","+publisher+","+isbn);
	 }
	 
	 public void getBookData(){
		 System.out.println("Book data");
		 System.out.println("bookName:"+bookName);
		 System.out.println("author:"+author);
		 System.out.println("price:"+price);
		 System.out.println("pages:"+pages);
		 System.out.println("publisher:"+publisher);
		 System.out.println("isbn:"+isbn);
		 
	 }
}
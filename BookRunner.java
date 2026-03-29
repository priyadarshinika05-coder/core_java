class BookRunner{

    public static void main(String []args){
		
		Book ref=new Book("The Alchemist","Paulo Coelho",299.5f,208,"HarperCollins",9780061122415L);
	    ref.bookName = "The Alchemist";
        ref.author = "The Alchemist";
        ref.price = 299.5f;
        ref.pages = 208;
        ref.publisher = "HarperCollins";
        ref.isbn = 9780061122415L;
		
		ref.getBookData();
	}
}
class Laptop1{

    String brandName;
    double price;
    float screenSize;
    int ram;                
    String processor;
	int storage;
    
	public Laptop(){
	}
	 public Laptop(String brandName,double price,float screenSize,int ram,String processor,int storage){
	this.brandName=brandName;
    this.price=price;
	this.screenSize=screenSize;
	this.ram=ram;
	this.processor=processor;
	this.storage=storage;
	}
	public void displayLaptopDetails(){
	     System.out.println("brandName:"+ brandName);
	  	 System.out.println("price:"+ price);
		 System.out.println("screenSize:"+ screenSize);
		 System.out.println("ram:"+ram);
		 System.out.println("processor:"+processor);
		 System.out.println("storage:"+ storage);
		 }
		 }
	
	
class Phone{
	
	String brandName;
	String model;
	double price;
	float screenSize;
	int storage;
	long imeiNumber;
	
	 public Phone(){
	 }
	 public Phone(String brandName,String model,double price,float screenSize,int storage,long imeiNumber){
	this.brandName=brandName;
	this.model=model;
	this.price=price;
	this.screenSize=screenSize;
	this.storage=storage;
	this.imeiNumber=imeiNumber;
	 }
	 public void displayPhoneDetails(){
	     System.out.println("brandName:"+ brandName);
		 System.out.println("model:"+model);
	  	 System.out.println("price:"+ price);
		 System.out.println("screenSize:"+ screenSize);
		 System.out.println("storage:"+ storage);
		 System.out.println("imeiNumber:"+imeiNumber);
		 
		 }
		 }
class SmartTv{

    String modelName;
	int volume;
	double price;
	float screenSize;
	double rating;
	long modelNumber;
	
	public SmartTv(){
	}
	public SmartTv(String modelName,int volume,double price,float screenSize,double rating,long modelNumber){
	this.modelName=modelName;
	this.volume=volume;
	this.price=price;
	this.screenSize=screenSize;
	this.rating=rating;
	this.modelNumber=modelNumber;
	}
	public void displayTvDetails(){
		 System.out.println("modelName:"+ modelName);
		 System.out.println("volume:"+ volume);
		 System.out.println("price:"+ price);
		 System.out.println("screenSize:"+ screenSize);
		 System.out.println("rating:"+rating);
		 System.out.println("modelNumber:"+modelNumber);
		 }
		 }
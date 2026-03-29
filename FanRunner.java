class FanRunner{

     public static void main(String []args){
	    Fan ref=new Fan("bajaj","ceiling",(byte)4,5,50.6f,4500l);
		ref.brand="bajaj";
        ref.type="ceiling";
        ref.wings=3;
        ref.speedLevel=5;
        ref.bladeSize=48.5f;
        ref.price=2500l;
		
		ref.getFanData();
		
		
   }
   }
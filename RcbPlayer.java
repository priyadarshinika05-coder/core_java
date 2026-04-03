class RcbPlayer{
     
	 String playerName;
	 int jerseyNumber;
	 float strikeRate;
	 boolean isCaptain;
	 long totalRuns;
	 String country;
	 
	 public RcbPlayer(){
	 }
	 public RcbPlayer(String playerName,int jerseyNumber,float strikeRate,boolean isCaptain,long totalRuns,String country){
	 this.playerName=playerName;
	 this.jerseyNumber=jerseyNumber;
	 this.strikeRate=strikeRate;
	 this.isCaptain=isCaptain;
	 this.totalRuns=totalRuns;
	 this.country=country;
	 
	 }
	 public void displayPlayerDetails(){
		 System.out.println("playerName:"+ playerName);
		 System.out.println("jerseyNumber:"+ jerseyNumber);
		 System.out.println("strikeRate:"+ strikeRate);
		 System.out.println("isCaptain:"+ isCaptain);
		 System.out.println("totalRuns:"+totalRuns);
		 System.out.println("country:"+country);
	 }
}
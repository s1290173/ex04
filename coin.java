class coin{

    public static void main(String[] args){
	int countH=0;
	int countT=0;

	System.out.println("Tossing a coin...");
    
	for(int i=1;i<=3;i++){
	    int coin = new java.util.Random().nextInt(2);
	    if(coin==0){
		System.out.println("Round " +i+": Heads");
		countH++;
	    }
	    else{
		System.out.println("Round " +i+": Tails");
		countT++;
	    }
	}
	System.out.println("Heads: "+countH+", Tails: "+countT);
    }
    if(countH >countT){
	System.out.println("John won!");
    }
    else{
	System.out.println("John lost!");
    }
}


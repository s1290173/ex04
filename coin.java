import java.util.Scanner;

class coin{
    public static void main(String[] args){
	String s;
	System.out.println("Who are you?");
	 
	Scanner sc = new Scanner(System.in);
	s = sc.next();
	System.out.println("Hello, "+s+"!");
	
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

	if(countH >countT){
	    System.out.println("John won!");
	}
	else{
	    System.out.println("John lost!");
	}
    }
}

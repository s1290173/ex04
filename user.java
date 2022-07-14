import java.util.Scanner;

class user{
    public static void main(String[] args){
	String s;
	System.out.println("Who are you?");
	 
	Scanner sc = new Scanner(System.in);
	s = sc.next();
	System.out.println("Hello, "+s+"!");
    }
}

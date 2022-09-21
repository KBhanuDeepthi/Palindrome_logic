import java.util.Scanner;
class Palindrome_logico
{
	static int reverseNumber(int n) {
		int reversed_n=0;
		while(n>0) {
			reversed_n=reversed_n *10 +n%10;
			n=n/10;
		}
		return reversed_n;
	}

	public static void main(String[] args) {
		int n;
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int reverseN=reverseNumber(n);
		System.out.println("Reversed of n="+reverseN);
		if(n==reverseN)
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");

		

	}

}

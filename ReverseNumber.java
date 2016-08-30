import java.util.Scanner;

//Java program to reverse an inputted number using division operator (/) and Remainder Operator (%)
public class ReverseNumber {

	public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Please enter the number to be reversed :");
//This statement will prompt the user to input number
int input = s.nextInt();
int result = reverse(input);
//output the reversed number
System.out.println("Your reversed number is " + result);
	}
	public static int reverse(int n){
		int result = 0;
		int rem;
		while (n>0){
			//use modulus operator to strip off the last digit
			rem = n%10;
			//create the reversed number
			n = n/10;
			result = result*10+rem;
		}
		return result;
	}
}
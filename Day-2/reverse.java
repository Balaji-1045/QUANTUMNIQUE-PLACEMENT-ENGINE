– PROBLEM SOLVING

Reverse a Number

Input
1234

Output
4321

Hint

Use:
remainder = n % 10
n = n // 10


Answer:
      
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	     int rev = 0;
	     while(n!=0){
	          int rem= n%10;
	          rev = (rev * 10) + rem;
	          n/=10;
	     }
	     System.out.print(rev);
	}
}
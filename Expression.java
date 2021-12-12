import java.io.*;
import java.util.*;
class ExpressionEvaluation {
	public static int calculate(int x,int n) {
		int i,sum=0;
		for(i=1;i<=n;i++) {
			sum += Math.pow(x, i);
		}
		return sum;
	}
	public static void main(String [] args) {
		int x,n;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		n = sc.nextInt();
		System.out.println(calculate(x,n));
	}
}

import java.io.*;
import java.util.*;
class Dots {
	public static int find(int n) {
	    int i,j=1;
	    for(i=1;i<n;i++)
	    {
	        if((i*(i+1)/2)==n) { 
	        	break;
	        	}
	        if((i*(i+1)/2)>n) { 
	        	j=0;
	        	break;}
	    }
	    return j;

	}
	public static void main(String [] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(find(n) == 1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}

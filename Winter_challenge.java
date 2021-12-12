import java.io.*;
import java.util.*;
class ModInverse {
	public static int findValue(int x,int m) {
	    int i,j=0;
	    for(i=1;i<100000;i++)
	    {
	        j=(m*i)+1;
	        if(j%x==0){break;}
	    }
	    if(j%x==0){return j/x;}
	    else return -1;

	}
	public static void main(String[] args) {
		int x,m;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		m = sc.nextInt();
		System.out.println(findValue(x,m));
	}
}

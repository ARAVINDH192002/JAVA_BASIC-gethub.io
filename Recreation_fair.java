import java.util.*;
public class StackGame {
    static void find(int a,int b){
        int min=a;
        if(b<a)min=b;
        for(int i=min;i>=1;i--){
            if(a%i==0 && b%i==0){
                System.out.print(i);break;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        find(n,m);
    }
}

import java.util.*;

public class HighSchool {
        static void find(int n){
            int a=0;
            int b=1,c=0;
            for(int i=1;i<n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println(c%10);
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        find(n);
    }

}

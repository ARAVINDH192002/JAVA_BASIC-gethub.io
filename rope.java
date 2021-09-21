import java.util.*;
class rope{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int []arr = new int[n];
            for(int i = 0;i<n;i++)
                 arr[i] = sc.nextInt();
                 int len =(arr[0]-k) + (arr[1]-k);
            for(int i = 2;i<=n-1;i++){
                len -= k;
                len += (arr[i]-k);

            }
            System.out.println(len);
            sc.close();
    }
}

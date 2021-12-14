import java.util.*;
import java.io.*;
class GFG{
    static int min1=Integer.MAX_VALUE;
    static int count=0;
    public int permutation(String str1,int i,int n,int p)
    {
        if(i == n){
            int q = Integer.parseInt(str1);
            if(q - p >0 && q<min1){
                min1=q;
                count=1;
            }
        }
        else{
            for(int j=i;j<=n;j++){
                str1=swap(str1,i,j);
                permutation(str1,i+1,n,p);
                str1=swap(str1,i,j);
            }
        }
        return min1;
    }
    public String swap(String str,int i,int j)
    {
        char ch[]=str.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        GFG gfg =new GFG();
        String str1=Integer.toString(A);
        int len=str1.length();
        int h=gfg.permutation(str1,0,len-1,B);
        if(count==1)
          System.out.println(h);
        else
          System.out.println(-1);
    }
}

import java.util.*;
public class MyClass {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      if(n>0){
          for(int i=0;i<n;i++){
             if( arr[i]>0 )
             {
               System.out.println("Invalid input");
               break;
             }
            }
            System.out.println(arr[n]);
            int temp=0;
            for(int i=0;i<n;i++){
               temp=arr[i]+temp;
              }
            System.out.println(temp);
            }
        else{
          System.out.println("Invalid input");
      }
    }
}

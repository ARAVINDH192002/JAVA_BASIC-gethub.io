import java.util.*;
public class count {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count_odd=0,count_even=0;
        int a = scan.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<a;i++){
            if( arr[i] % 2 == 1){            
              count_odd++;}
            else{
              count_even++;
            }
        }
        System.out.println(count_odd+" "+count_even);
    }   
}

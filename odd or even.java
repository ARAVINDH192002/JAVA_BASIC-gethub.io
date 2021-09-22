import java.util.*;
public class odd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println("Enter the number "+a);
        if(a%2==0)  {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is Odd");
        }
    }
}

import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      int a,b,c=0;
      Scanner scan = new Scanner(System.in);
      a =scan.nextInt();
      for (b=1;b<=a;b++){
          if(a%b==0) {
              c++;
          }
      }
      if(c==2) {
          System.out.println("The entered number "+a+" is Prime");
      }
      else {
          System.out.println("The entered number "+a+" is NotPrime");
      }
    }
}

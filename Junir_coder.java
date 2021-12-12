import java.util.Scanner;

public class JuCo {
    static void findValue(String a,String b){
        String r=a.substring((a.length()-b.length()));
        if(r.equals(b)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a =sc.next();
        String b =sc.next();
        findValue(a,b);


    }
}

package Practices;

import java.util.Scanner;

public class FavoriteSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String movie="";
        String seq="";
        for(int i=0;i<n;i++){
            movie+=sc.next();
        }
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            seq+=sc.next();
        }
        if(movie.contains(seq)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}

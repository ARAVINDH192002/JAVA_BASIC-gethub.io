import java.util.*;

class Agediagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if ((arr[i][j] > 18) && (arr[i][j] < 60))
                    if (i == j) {
                        count++;
                    }
            }
        }
        System.out.print(count);
        sc.close();
    }
}

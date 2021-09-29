import java.util.*;

class Whitecells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        int flag = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] != 20)
                    flag = flag + arr[i][j];

            }

        }

        System.out.print(flag);
        sc.close();
    }
}

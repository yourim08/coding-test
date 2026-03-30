import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nm[] = sc.nextLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int arr[][] = new int[n][m];
        for (int i = 0; i < n * 2; i++) {
            String str[] = sc.nextLine().split(" ");
            for (int k = 0; k < m; k++) {
                if(i>n-1){
                    arr[i-n][k] += Integer.parseInt(str[k]);
                }
                else {
                    arr[i][k] += Integer.parseInt(str[k]);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

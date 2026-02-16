import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        sc.nextLine();

        String num[] = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(num[i]);
        }
        
        // 최댓값 찾기
        double max = 0.0;
        for (int i = 0; i < arr.length; i++) {
            if ((double)arr[i] > max) {
                max = (double)arr[i];
            }
        }

        double sum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += (arr[i] / max) * 100;
        }

        System.out.print(sum / (double)n);
    }
}
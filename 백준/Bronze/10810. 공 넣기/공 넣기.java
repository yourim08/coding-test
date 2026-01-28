import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num[] = sc.nextLine().split(" ");
        int arr[] = new int[Integer.parseInt(num[0])];
        for (int i = 0; i < Integer.parseInt(num[1]); i++) {
            String input[] = sc.nextLine().split(" ");
            for (int j = Integer.parseInt(input[0]) - 1; j < Integer.parseInt(input[1]); j++) {
                arr[j] = Integer.parseInt(input[2]);
            }
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
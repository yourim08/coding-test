import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String nm[] = sc.nextLine().split(" ");
        int arr[] = new int[Integer.parseInt(nm[0])];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < Integer.parseInt(nm[1]); i++) {
            String result[] = sc.nextLine().split(" ");
            int temp = 0;
            for (int j = 0; j < (Integer.parseInt(result[1]) - Integer.parseInt(result[0])) / 2 + 1; j++) {
                temp = arr[Integer.parseInt(result[0]) + j - 1];
                arr[Integer.parseInt(result[0]) + j - 1] = arr[Integer.parseInt(result[1]) - j - 1];
                arr[Integer.parseInt(result[1]) - j - 1] = temp;
            }
        }
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}
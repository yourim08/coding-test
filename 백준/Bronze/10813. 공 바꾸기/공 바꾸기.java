import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num[] = sc.nextLine().split(" ");
        int arr[] = new int[Integer.parseInt(num[0])];
        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }
        int temp = 0;
        for (int i = 0; i < Integer.parseInt(num[1]); i++) {
            String input[] = sc.nextLine().split(" ");
            temp = arr[Integer.parseInt(input[0])-1];
            arr[Integer.parseInt(input[0])-1] = arr[Integer.parseInt(input[1])-1];
            arr[Integer.parseInt(input[1])-1] = temp;
        }
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String arr[] = sc.nextLine().split(" ");
        arr[0] = Character.toString(arr[0].charAt(2)) + Character.toString(arr[0].charAt(1)) +  Character.toString(arr[0].charAt(0));
        arr[1] = Character.toString(arr[1].charAt(2)) + Character.toString(arr[1].charAt(1)) +  Character.toString(arr[1].charAt(0));
        
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]); 
        int result = (a>b) ? a : b;

        System.out.print(result);
    }
}
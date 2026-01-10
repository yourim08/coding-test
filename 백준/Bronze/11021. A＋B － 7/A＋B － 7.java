import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        sc.nextLine();
        for(int i=0; i<n; i++){
            String str[] = sc.nextLine().split(" ");
            arr[i] = Integer.parseInt(str[0])+Integer.parseInt(str[1]);
        }
        for(int j=0; j<arr.length; j++){
            System.out.println("Case #"+(j+1)+": "+arr[j]);
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[2];
        for(int i=0; i<2; i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        String answer = (arr[0] > arr[1]) ? ">" : (arr[0] == arr[1]) ? "==" : "<";
        System.out.print(answer);
    }
}
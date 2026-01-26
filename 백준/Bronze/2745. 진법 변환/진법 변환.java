import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String arr[] = sc.nextLine().split(" ");
        System.out.print(Integer.parseInt(arr[0], Integer.parseInt(arr[1])));
    }
}
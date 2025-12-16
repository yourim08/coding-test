import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = 1;
        int result = 0;
        while(i<=a){
            result+=i;
            i++;
        }
        System.out.print(result);
    }
}
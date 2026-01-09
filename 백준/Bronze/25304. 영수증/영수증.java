import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        sc.nextLine();
        int result = 0;
        for(int i=0; i<n; i++){
            String str[] = sc.nextLine().split(" ");
            result+=(Integer.parseInt(str[0])*Integer.parseInt(str[1]));
        }
        String answer = result == sum ? "Yes" : "No";
        System.out.print(answer);
    }
}
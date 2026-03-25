import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        int isDivide = n - n % 100;

        // 나누어 떨어질 때
        if (isDivide % f == 0) {
            System.out.println("00");
        }

        // 안나누어 떨어질 때
        else {
            String isNotDivide = String.valueOf((isDivide / f) * f + f);
            System.out.print(isNotDivide.charAt(isNotDivide.length()-2));
            System.out.print(isNotDivide.charAt(isNotDivide.length()-1));
        }
    }
}

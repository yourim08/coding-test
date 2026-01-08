import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");
        int n = sc.nextInt();
        int time = Math.abs(60 * Integer.parseInt(str[0]) + Integer.parseInt(str[1]) + n);
        int hour = (time/60) > 23 ? time/60-24 : time/60;
        System.out.print(hour + " " + (time % 60));
    }
}
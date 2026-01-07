import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");
        if (str[0].equals("0") && Integer.parseInt(str[1]) < 45) {
            System.out.print("23" + " " + (60 - (45 - Integer.parseInt(str[1]))));
        } 
        else {
            int time = Math.abs(60 * Integer.parseInt(str[0]) + Integer.parseInt(str[1]) - 45);
            System.out.print((time / 60) + " " + (time % 60));
        }
    }
}
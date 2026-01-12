import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");
        Arrays.sort(str);
        if(str[0].equals(str[1]) && str[0].equals(str[2])) {
            System.out.print(10000+Integer.parseInt(str[0])*1000);
        }
        else if(str[0].equals(str[1]) || str[0].equals(str[2]) || str[1].equals(str[2])){
            System.out.print(1000+Integer.parseInt(str[1])*100);
        }
        else {
            System.out.print(Integer.parseInt(str[2])*100);
        }
    }
}
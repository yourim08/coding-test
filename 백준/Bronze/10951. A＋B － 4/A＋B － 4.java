import java.util.Scanner;
import java.util.NoSuchElementException;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(true){
            try {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(a + b);
            }
            catch(NoSuchElementException e){
                break;
            }
        }
    }
}
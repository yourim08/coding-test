import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int max = 0;
        for (int i = 0; i < 9; i++) {
            String str[] = sc.nextLine().split(" ");
            for (int j = 0; j < 9; j++) {
                if(Integer.parseInt(str[j]) > max){
                    max = Integer.parseInt(str[j]);
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max+"\n"+(x+1)+" "+(y+1));
    }
}

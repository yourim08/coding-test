import java.util.Scanner;
// 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int answer = 0;
        if(a%4==0){
            if(a%100 != 0 || a%400==0) answer = 1;
        }
        System.out.print(answer);
    }
}
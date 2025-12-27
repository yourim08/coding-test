import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String answer = "";
        String num1 = sc.nextLine();
        String num[] = num1.split(" ");
        String str1 = sc.nextLine();
        String str2[] = str1.split(" "); 
        for(int i=0; i<Integer.parseInt(num[0]); i++){
            if(Integer.parseInt(str2[i]) < Integer.parseInt(num[1])){
               answer += str2[i] + " ";
            }
        }
        System.out.print(answer);
    }
}
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char ch[]=a.toCharArray();     
            for(int i=0; i<ch.length;i++){
                if(ch[i]>=97 && ch[i]<=122)
                    ch[i]= Character.toUpperCase(ch[i]);
                else if(ch[i]>=65 && ch[i]<=90)
                    ch[i]= Character.toLowerCase(ch[i]);
            }
        String answer= String.valueOf(ch);
        System.out.print(answer);
    }
}
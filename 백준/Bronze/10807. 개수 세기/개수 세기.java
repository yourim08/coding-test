import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int N = sc.nextInt();
        sc.nextLine();
        String str1 = sc.nextLine();
        String str2[] = str1.split(" "); 
        int v = sc.nextInt();
        for(int i=0; i<N; i++){
            if(Integer.parseInt(str2[i]) == v){
                count++;
            }
        }
        System.out.print(count);
    }
}
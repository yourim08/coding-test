import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int set[] = {1,1,2,2,2,8};
        String str[] = sc.nextLine().split(" ");
        for(int i=0; i<set.length; i++){
            set[i] = set[i] - Integer.parseInt(str[i]);
        }   
        for(int a: set){
            System.out.print(a+" ");
        }
    }
}
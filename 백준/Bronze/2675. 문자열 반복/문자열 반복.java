import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.nextLine();

        for(int i=0; i<n ; i++){
            String str[] = sc.nextLine().split(" ");
            int repeat = Integer.parseInt(str[0]);

            for(int j=0; j<str[1].length(); j++){
                for(int k=0; k<repeat; k++){
                    System.out.print(str[1].charAt(j));
                }
            }

            System.out.println();
        }
    }
}
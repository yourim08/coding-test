import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        while(true){
            String str[] = sc.nextLine().split(" ");
            if(str[0].equals("0") && str[1].equals("0")){
                break;
            }
            else{
                answer+=str[0]+" "+str[1]+" ";
            }
        }
        String[] result = answer.trim().split(" ");
        for(int j=0; j<result.length; j+=2){
            System.out.println(Integer.parseInt(result[j])+Integer.parseInt(result[j+1]));
        }
    }
}
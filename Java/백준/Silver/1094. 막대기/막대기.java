import java.util.Scanner; 
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int minus=0;
        int count=1;
        int max=0;
        int num[] = {1,2,4,8,16,32,64};
        while (true){
        for(int i=0; i<num.length;i++){
            if(num[i]>max && num[i]<=x) minus=num[i];
        }
            if(x-minus==0) break;
            x-=minus;
            count++;
        }
        System.out.print(count);
    }
}
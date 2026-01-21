import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        var arr = new ArrayList<Integer>();
        int max = 0;
        int maxindex = 0;
        while(true){
            try{
                int n = sc.nextInt();
                arr.add(n);
            } catch (NoSuchElementException e) {break;}
        } 
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i)>max){
                max = arr.get(i);
                maxindex = i;
            }
        }
        System.out.print(max+"\n"+(maxindex+1));
    }
}
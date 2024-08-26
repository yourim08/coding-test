import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] array= new int[emergency.length];
        for(int i=0; i< emergency.length;i++){
            array[i]=emergency[i];
        }
        Arrays.sort(emergency); // emergency정렬
        int[] turn = new int[emergency.length];
        int n=emergency.length;
        for(int i=0; i<emergency.length;i++){
            turn[i]=n;
            n--;
        }
        int sameindex=0;
        int k=0;
        for(int i=0; i<emergency.length ; i++){
            for(int j=0; j<emergency.length;j++){
                if(emergency[i]==array[j]) {
                    sameindex=j;
                }
            }
            answer[k]=turn[sameindex];
            k++;
        }
        return answer;
    }
}
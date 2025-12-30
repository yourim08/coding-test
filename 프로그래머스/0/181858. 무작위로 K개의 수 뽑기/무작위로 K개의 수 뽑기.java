import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        boolean flag = false;
        ArrayList <Integer> temp = new ArrayList<Integer>();
        temp.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (temp.size() == k)
                break;
            else {
                flag = false;
                for (int m : temp) {
                    if (m == arr[i]) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    temp.add(arr[i]);
                }
            }
        }
        while(temp.size() != k){
            temp.add(-1);
        }
        int answer[] = temp.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
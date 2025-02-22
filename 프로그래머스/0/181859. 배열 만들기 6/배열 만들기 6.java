import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        var temp = new ArrayList<Integer>();
        int i=0;
        while (true){
            if(i>=arr.length){
                break;
            }
            if(temp.isEmpty()){
                temp.add(arr[i]);
                i++;
            }
            else if(temp.get(temp.size()-1) == arr[i]){
                temp.remove(temp.size()-1);
                i++;
            }
            else if(temp.get(temp.size()-1) != arr[i]){
                temp.add(arr[i]);
                i++;
            }
        }
        
        if(temp.isEmpty()){
             return new int[]{-1};
        }
        int answer[] = temp.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}
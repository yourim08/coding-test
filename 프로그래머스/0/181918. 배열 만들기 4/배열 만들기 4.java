import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i =0;
        var stk1 = new ArrayList<Integer>();
        while(true){
            if(i>=arr.length){
                break;
            }
            if(stk1.isEmpty()){
                stk1.add(arr[i]);
                i++;
            }
            else if(stk1.get(stk1.size()-1) < arr[i]){
                stk1.add(arr[i]);
                i++;
            }
            else {
                stk1.remove(stk1.size()-1);
            }
        }
        int stk[] = stk1.stream()
	.mapToInt(Integer::intValue)
    	.toArray();
        return stk;
    }
}
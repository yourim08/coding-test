class Solution {
    public int solution(int[] array) {
        int count=0;
        for(int i=0;i<array.length ;i++){
            String a=Integer.toString(array[i]);
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)=='7') count++;
            }
        }
        int answer = count;
        return answer;
    }
}
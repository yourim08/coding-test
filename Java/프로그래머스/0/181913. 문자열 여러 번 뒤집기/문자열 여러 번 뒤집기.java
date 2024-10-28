class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer result = new StringBuffer(my_string);
        char ch[] = my_string.toCharArray();
        String answer = "";
        int a=0;
        int b=0;
        for(int i=0; i<queries.length;i++){
            String temp1 ="";
            a = queries[i][0];
            b = queries[i][1];
            // 버퍼 형 temp 추출
            StringBuffer temp = new StringBuffer(result.substring(a,b+1));
            // temp 반전, temp1에 String으로 저장
            temp = temp.reverse();
            temp1 = temp.toString();
            // 값 바꾸기, 인덱스에 맞게 대체
            result = result.replace(a,b+1,temp1); // String만...
        }
        answer = result.toString();
        return answer;
    }
}
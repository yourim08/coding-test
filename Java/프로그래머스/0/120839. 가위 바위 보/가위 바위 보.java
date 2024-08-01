class Solution {
    public String solution(String rsp) {
        char a[] = new char[rsp.length()];
        for(int i=0; i<a.length ;i++){
            if(rsp.charAt(i)=='2'){
                a[i]='0';
            }
            if(rsp.charAt(i)=='0'){
                a[i]='5';
            }
            if(rsp.charAt(i)=='5'){
                a[i]='2';
            }
        }
        String answer = String.valueOf(a);
        return answer;
    }
}
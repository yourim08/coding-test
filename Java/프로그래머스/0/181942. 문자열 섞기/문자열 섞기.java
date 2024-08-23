class Solution {
    public String solution(String str1, String str2) {
        char str11[] = str1.toCharArray();
        char str22[] = str2.toCharArray();
        String answer = "";
        for(int i=0; i<str1.length();i++){
            answer+=str11[i];
            answer+=str22[i];
        }
        return answer;
    }
}
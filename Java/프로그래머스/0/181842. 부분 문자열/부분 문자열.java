class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        for(int i=0; i<(ch2.length-ch1.length+1);i++){
            int count=0;
            for(int j=0; j<ch1.length;j++){
                if(ch2[i+j]==ch1[j]) {
                    count++;
                    }
                if(count==ch1.length) answer=1;
             }
        }
        return answer;
    }
}
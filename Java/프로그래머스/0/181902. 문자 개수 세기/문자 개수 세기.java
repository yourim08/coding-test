class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char ch[] = my_string.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){  
                answer[(int)ch[i]-65]++;
            }
            if(ch[i]>='a' && ch[i]<='z'){  
                answer[(int)ch[i]-97+26]++;
            }
        }
        return answer;
    }
}
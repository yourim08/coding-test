class Solution {
    public String solution(String rny_string) {
        int count = 0;
        int n = 0;
        char[] ch = rny_string.toCharArray();
        
        // 'm'의 개수를 세어, 추가할 공간 확보
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'm') count++;
        }
        
        // 새 배열은 'm'의 개수만큼 커야 함
        char[] sh = new char[ch.length + count];
        
        // 새로운 배열에 'm'을 'rn'으로 바꿔서 넣기
        for (int i = 0; i < sh.length; i++) {
            if (ch[n] == 'm') {
                sh[i] = 'r';
                i++;
                sh[i] = 'n';
                n++;
            } else {
                sh[i] = ch[n];
                n++;
            }
        }
        
        // 최종 결과를 문자열로 변환
        String answer = String.valueOf(sh);
        return answer;
    }
}

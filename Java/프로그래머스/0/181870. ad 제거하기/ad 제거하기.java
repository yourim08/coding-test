class Solution {
    public String[] solution(String[] strArr) {
        // gpt의 코드 (함수 사용)
        int count = 0;

        // 'ad'가 포함된 원소의 개수 세기
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
                count++;
            }
        }

        // 'ad'를 포함하지 않는 문자열을 저장할 배열 생성
        String[] answer = new String[strArr.length - count];
        int n = 0;

        // 'ad'를 포함하지 않는 문자열을 answer 배열에 추가
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                answer[n] = strArr[i];
                n++;
            }
        }
        return answer;
    }
}
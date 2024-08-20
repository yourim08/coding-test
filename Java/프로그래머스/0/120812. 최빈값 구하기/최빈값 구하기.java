class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int maxindex = 0;
        int c[] = new int[array.length];

        // 배열의 각 원소가 몇 번 등장했는지 계산
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) count++;
            }
            c[i] = count; // 빈도 횟수 배열에 저장
        }

        // 가장 큰 빈도를 가진 값 찾기
        for (int i = 0; i < c.length; i++) {
            if (c[i] > max) {
                max = c[i];
                maxindex = i;
                answer = array[maxindex];
            }
        }

        // 최빈값이 여러 개인지 확인
        int countMax = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == max && array[i]!=array[maxindex]) {
                countMax++;
            }
        }

        // 최빈값이 여러 개라면 -1을 반환
        if (countMax > 1) {
            return -1;
        } else {
            return answer;
        }
    }
}
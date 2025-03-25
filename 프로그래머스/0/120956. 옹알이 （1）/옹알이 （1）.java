class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String str[] = new String[340];
		String bab[] = {"aya","ye","woo","ma"};
		int n=0;
        // 1개
        for(int i=0; i<bab.length; i++){
            str[n]=bab[i];
            n++;
        }
		// 2개
		for(int i=0; i<bab.length ; i++) {
			for(int j=0; j<bab.length; j++) {
				str[n]=bab[i]+bab[j];
				n++;
			}
		}
		// 3개
		for(int i=0; i<bab.length ; i++) {
			for(int j=0; j<bab.length; j++) {
				for(int k=0; k<bab.length; k++) {
					str[n]=bab[i]+bab[j]+bab[k];;
					n++;
				}
			}
		}
		// 4개
		for(int i=0; i<bab.length ; i++) {
			for(int j=0; j<bab.length; j++) {
				for(int k=0; k<bab.length; k++) {
					for(int l=0; l<bab.length ; l++) {
						str[n]=bab[i]+bab[j]+bab[k]+bab[l];
						n++;
					}
				}
			}
		}
        // 결과
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<str.length; j++){
                if(babbling[i].equals(str[j]))
                   answer++;
            }
        }
        return answer;
    }
}
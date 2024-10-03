class Solution {
    public String solution(String polynomial) {
        String[] parts = polynomial.split("\\s*\\+\\s*");
        int count=0;
		int n=0;
		int nSum=0;
		int xSum=0;
		String answer="";
		String c = "";
		// x배열 생성
        for(int i=0; i<parts.length ; i++){
			if(parts[i].contains("x")) count++;
		}
		String parts1[]=new String[count];        
		for(int i=0; i<parts.length ; i++){
			// x 있는 배열 생성
            if(parts[i].contains("x")) {
				parts1[n]=parts[i];
				n++;
			}
            // x 아닐 시 더함
			else nSum+=Integer.parseInt(parts[i]);
		}
        // x 상수 더하기
		for(int i=0; i<parts1.length ; i++) {
			if(parts1[i].equals("x")) {
				xSum++;
			}
			else {
				String parts2[] = parts1[i].split("x");
                c = parts2[0];
				xSum+=Integer.parseInt(c);
			}
		}
        if(xSum==0 && nSum!=0){
            answer=String.valueOf(nSum);
        }
        else if(xSum==1 && nSum==0){
            answer="x";
        }
		else if(nSum==0) {
			answer=answer+xSum+"x";
		}
        else if(xSum==1 && nSum!=0){
            answer="x + "+nSum;
        }
		else {
			answer=answer+xSum+"x + "+nSum;
		}
        return answer;
    }
}
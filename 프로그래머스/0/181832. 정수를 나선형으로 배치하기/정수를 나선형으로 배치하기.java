import java.util.*;
class Solution {
    public int[][] solution(int n) {
		int m = 1;
		int answer[][] = new int[n][n];
		int k = n;
		int repeat = (int)(Math.ceil((double)n/2));
		int x = 0;
        int y = 0;
		int count=0;
		// 전체 반복
		for(int l=0; l<repeat; l++) {
			// 한 획 반복
			for(int i=0; i<4; i++) {
				if (i == 0) {
					x = l;
					y = l;
				}
				if (i == 1) {
					x = l+1; 
					y = n-x; 
				}
				if (i == 2) {
					x = n-(l+1);
					y = (x-1);
				}
				if(i == 3) {
					x = n-(l+2);
					y = l;
				}
				// 수 반복
				for(int j=k; j>0; j--) {
					answer[x][y] = m;
					m++;
					if(i == 0) {
						y++;
					}

					if(i == 1) {
						x++;
					}
					if(i == 2) {
						y--;
					}
					if(i == 3) {
						x--;
					}
				}
				count++;
				k--;
				if(k == n-2*(l+1) && count==2) {
					k++;
				}
			}
			k = n-2*(l+1);
			count = 0;
			if(k<=0) {
				break;
			}
		}
        return answer;
    }
}
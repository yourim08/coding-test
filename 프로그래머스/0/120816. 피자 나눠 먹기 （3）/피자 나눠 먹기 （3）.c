#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int slice, int n) {
        int i=1;
        int answer=0;
        while (true){
            if(slice*i>=n) {
                answer=i;
                break;
            }
            else i++;
        }
    return answer;
}
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 2;
    int i=1;
    while(true){
        if(i>=n) break;
        if(n==i*i){
            answer=1;
            break;
        }
        i++;
    }
    return answer;
}
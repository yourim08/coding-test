#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// sides_len은 배열 sides의 길이입니다.
int solution(int sides[], size_t sides_len) {
    int answer = 2;
    int sum=0;
    int max=0;
    int count=0;
    for(int i=0; i<sides_len; i++){
        if(sides[i]>max) max=sides[i];
    }
    for(int i=0; i<sides_len; i++){
        if(sides[i]==max) count++;
    }
    for(int i=0 ; i<sides_len; i++){
        if(sides[i]!=max && count==1) sum+=sides[i];
        if(sides[i]<=max && count>1) sum+=sides[i];           
    }
    if(sum>max) answer=1;
    return answer;
}
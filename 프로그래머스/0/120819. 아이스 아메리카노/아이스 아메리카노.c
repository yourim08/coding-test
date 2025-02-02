#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int* solution(int money) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int* answer = (int*)malloc(1);
    int i=1;
    while(true){
        if(5500*i>money){
            i-=1;
            break;
        }
        i++;
    }
    answer[0]=i;
    answer[1]=money-5500*i;
    return answer;
}
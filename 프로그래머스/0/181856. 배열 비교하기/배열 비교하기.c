#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr1_len은 배열 arr1의 길이입니다.
// arr2_len은 배열 arr2의 길이입니다.
int solution(int arr1[], size_t arr1_len, int arr2[], size_t arr2_len) {
    int answer = 0;
    int asum=0;
    int bsum=0;
    if(arr1_len>arr2_len) answer=1;
    else if(arr1_len<arr2_len) answer=-1;
    else {
        for(int a=0; a<arr1_len; a++){
            asum+=arr1[a];
        }
        for(int b=0; b<arr2_len; b++){
            bsum+=arr2[b];
        }
        if(asum>bsum) answer=1;
        else if(asum<bsum) answer=-1;
        else answer=0;
    }
    return answer;
}
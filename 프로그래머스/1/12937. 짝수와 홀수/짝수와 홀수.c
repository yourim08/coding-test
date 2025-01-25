#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

char* solution(int num) {
    char* answer = "Odd";
    if(num%2==0){
        answer="Even";
    }
    return answer;
}
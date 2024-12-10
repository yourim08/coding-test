#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int seven = n/7;
    if (n%7==0)
        answer=seven;
    else {
        answer=seven+1;
    }
    return answer;
}
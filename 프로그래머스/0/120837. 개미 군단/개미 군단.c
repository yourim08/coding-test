#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int hp) {
    int answer = 0;
    int ant=1;
    int sant=3;
    int cant=5;
    int count=(hp/cant)+((hp%cant)/sant)+(((hp%cant)%sant)/ant);
    answer=count;
    return answer;
}
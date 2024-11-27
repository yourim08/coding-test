#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

bool solution(bool x1, bool x2, bool x3, bool x4) {
    bool answer = true;
    bool flag1 = true;
    bool flag2 = true;
    bool flag3 = true;
    if(x1==true || x2==true) flag1 = true;
    else flag1 = false;
    if(x3==true || x4==true) flag2 = true;
    else flag2 = false;
    if(flag1==false || flag2==false) answer=false;
    return answer;
}
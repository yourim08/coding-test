#include <string>
#include <vector>

using namespace std;

int solution(int angle) {
    int answer = 0;
    if(0<angle && angle<90) answer=1;
    if(90<angle && angle<180) answer=3;
    if(angle==90) answer=2;
    if(angle==180) answer=4;
    return answer;
}
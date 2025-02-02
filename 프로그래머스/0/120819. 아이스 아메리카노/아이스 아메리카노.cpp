#include <string>
#include <vector>

using namespace std;

vector<int> solution(int money) {
    vector<int> answer(2);
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
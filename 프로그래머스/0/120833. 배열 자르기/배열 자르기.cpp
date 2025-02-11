#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers, int num1, int num2) {
    vector<int> answer(num2-num1+1);
    for(int i=0; i<size(answer) ;i++){
            answer[i]=numbers[num1+i];
    }
    return answer;
}
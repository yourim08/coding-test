#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers, int n) {
    int answer = 0;
    int sum=0;
        for(int i=0; i<numbers.size(); i++){
            if(sum>n) {
                answer=sum;
                break;
            } 
            else {
                sum+=numbers[i];
                answer=sum;
                }
        }
    return answer;
}
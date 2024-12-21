#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int answer = 0;
    for(int i=0 ; i<size(num_list);i++){
        if(num_list[i]<0) {
            answer=i;
            break;
        }
        else answer=-1;
    }
    return answer;
}
#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> num_list, int n) {
    vector<int> answer(size(num_list)-n+1);
    int m=0;
    for(int i=n-1; i<size(num_list); i++){
        answer[m] = num_list[i];
        m++;
    } 
    return answer;
}
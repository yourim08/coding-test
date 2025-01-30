#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> num_list) {
    int oddcount=0;
    int evencount=0;
    for(int i=0; i<size(num_list); i++){
        if(num_list[i]%2==0) evencount++;
        else oddcount++;
    }
    vector<int> answer = {evencount, oddcount};
    return answer;
}
#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
        int answer = 0;
        int oddsum = 0;
        int evensum = 0;
        for(int i=0 ; i< size(num_list) ;i++){
            if(i%2==0) oddsum+=num_list[i];
            else evensum+=num_list[i];
        }
        if(oddsum>evensum) answer=oddsum;
        else answer=evensum;
    return answer;
}
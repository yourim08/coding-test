#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers) {
    int answer = 0;
    int max1=0;
    int max2=0;
    int index=0;
    for(int i=0; i<size(numbers); i++){  
        if(numbers[i]>=max1) {
            max1=numbers[i];
            index=i;
        }
    }
    for(int i=0; i<size(numbers); i++){
        if(numbers[i]>=max2 && i!=index ) {
            max2=numbers[i];
        }                             
    }
    answer=max1*max2;
    return answer;
}
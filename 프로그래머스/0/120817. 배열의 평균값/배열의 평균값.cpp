#include <string>
#include <vector>

using namespace std;

double solution(vector<int> numbers) {
    double sum = 0;
    for(int i =0; i<size(numbers); i++){
            sum+=numbers[i];
        }
    double answer = sum/size(numbers); 
    return answer;
}
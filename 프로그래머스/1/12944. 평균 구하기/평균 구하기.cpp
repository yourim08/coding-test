#include <string>
#include <vector>

using namespace std;

double solution(vector<int> arr) {
    double answer = 0;
    int sum=0;
    for(int i=0; i<size(arr) ; i++){
        sum+=arr[i];
    }
    answer=(double)sum/size(arr);
    return answer;
}
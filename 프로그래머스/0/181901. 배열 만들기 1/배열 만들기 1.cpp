#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n, int k) {
    vector<int> answer(n/k);
    int m=0;
    for(int i=1; i*k<=n;i++){
        if(i*k<=n) {
            answer[m]=i*k;
            m++;
        }
    }
    return answer;
}
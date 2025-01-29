#include <string>
#include <vector>

using namespace std;

int solution(vector<int> arr1, vector<int> arr2) {
    int answer = 0;
    int asum=0;
    int bsum=0;
    if(size(arr1)>size(arr2)) answer=1;
    else if(size(arr1)<size(arr2)) answer=-1;
    else {
        for(int a=0; a<size(arr1); a++){
            asum+=arr1[a];
        }
        for(int b=0; b<size(arr2); b++){
            bsum+=arr2[b];
        }
        if(asum>bsum) answer=1;
        else if(asum<bsum) answer=-1;
        else answer=0;
    }
    return answer;
    return answer;
}
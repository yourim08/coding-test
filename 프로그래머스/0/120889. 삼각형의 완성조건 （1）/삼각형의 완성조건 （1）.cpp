#include <string>
#include <vector>

using namespace std;

int solution(vector<int> sides) {
    int answer = 2;
    int sum=0;
    int max=0;
    int count=0;
    for(int i=0; i<size(sides); i++){
        if(sides[i]>max) max=sides[i];
    }
    for(int i=0; i<size(sides); i++){
        if(sides[i]==max) count++;
    }
    for(int i=0 ; i<size(sides); i++){
        if(sides[i]!=max && count==1) sum+=sides[i];
        if(sides[i]<=max && count>1) sum+=sides[i];           
    }
    if(sum>max) answer=1;
    return answer;
}
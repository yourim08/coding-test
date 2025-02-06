#include <string>
#include <vector>

using namespace std;

vector<string> solution(vector<string> todo_list, vector<bool> finished) {
    int count=0;
    for(int i=0; i<size(finished) ; i++){
        if(!finished[i]) {
            count++;
        }
    }
    vector<string> answer;
    int n=0;
    for(int i=0; i<size(todo_list);i++){
        if(!finished[i]) {
            answer.push_back(todo_list[i]);
            n++;
        }
    }
    return answer;
}
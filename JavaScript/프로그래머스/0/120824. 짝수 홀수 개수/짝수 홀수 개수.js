function solution(num_list) {
    var answer = new Array(2);
    answer[0]=0;
    answer[1]=0;
    for(var i=0; i<num_list.length ; i++){
        if(num_list[i]%2==0) {
            answer[0]++;
        }
        else answer[1]++;
    }
    return answer;
}
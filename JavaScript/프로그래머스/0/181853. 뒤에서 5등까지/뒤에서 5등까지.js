function solution(num_list) {
    var answer = new Array(5);
    num_list.sort((a,b)=>a-b);
    for(var i=0; i<5 ; i++){
        answer[i]=num_list[i];
    }
    return answer;
}
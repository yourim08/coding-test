function solution(num_list) {
    var last = num_list.length; 
    var answer = Array(last+1);
    var n=0;
    for(var i of num_list){
        answer[n]=i;
        n++;
    }
    if(num_list[last-1]>num_list[last-2]){
        answer[last]=num_list[last-1]-num_list[last-2];
    }
    else {
        answer[last]=num_list[last-1]*2;
    }
    return answer;
}
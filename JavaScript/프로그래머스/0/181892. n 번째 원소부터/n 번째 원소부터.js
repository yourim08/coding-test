function solution(num_list, n) {
    var answer = new Array(num_list.length-n+1);
    var m=0;
    for(var i=n-1; i<num_list.length ;i++){
        answer[m] = num_list[i];
        m++;
    }    
    return answer;
}
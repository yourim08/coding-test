function solution(num_list, n) {
        var answer = [num_list.length];
        var n1= n-1;
        for(var i=n;i<num_list.length ; i++){
            answer[i-n] =num_list[i];
        }
        for (var j=0; j<n; j++){
            answer [num_list.length-1-n1]=num_list[j];
            n1--;
        }
    return answer;
}
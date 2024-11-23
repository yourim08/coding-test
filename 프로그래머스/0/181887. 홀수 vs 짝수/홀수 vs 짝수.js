function solution(num_list) {
    var answer = 0
    var oddsum =0;
    var evensum=0;
    for(var i=0 ; i<num_list.length ;i++){
        if(i%2==0) oddsum+=num_list[i];
        else evensum+=num_list[i];
    }
    if(oddsum>evensum) answer=oddsum;
    else answer=evensum;
    return answer;
}
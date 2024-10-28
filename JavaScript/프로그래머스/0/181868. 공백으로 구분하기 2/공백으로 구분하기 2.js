function solution(my_string) {
    var result = my_string.split(/\s+/);
    var count = 0;
    var n=0;
    for(var i=0; i<result.length; i++){
        if(result[i]!=""){
            count++;
        }
    }
    var answer = new Array(count);
    for(var i=0; i<result.length; i++){
        if(result[i]!=""){
            answer[n]=result[i];
            n++;
        }
    }
    return answer;
}
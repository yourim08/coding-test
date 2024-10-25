function solution(names) {
    var n=0;
    var answer = [names%5];
    for(var i=0; i<names.length ; i++){
        if(i%5==0){
            answer[n]=names[i];
            n++;
        }
    }
    return answer;
}
function solution(seoul) {
    var answer = '';
    let index=0;
    for(let i=0; i<seoul.length ; i++){
        if(seoul[i] == "Kim"){
            index=i;
        }
    }
    answer="김서방은 "+index+"에 있다";
    return answer;
}
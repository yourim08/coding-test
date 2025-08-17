function solution(myString) {
    var answer = myString;
    for(let i=0; i<answer.length; i++){
        if (answer[i]<"l"){
            answer = answer.replace(answer[i], "l");
        }
    }
    return answer;
}
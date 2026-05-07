function solution(myStr) {
    var answer = myStr.split(/[abc]/).filter(e => e);
    if(answer.length == 0){
        answer = ["EMPTY"]
    }
    return answer;
}
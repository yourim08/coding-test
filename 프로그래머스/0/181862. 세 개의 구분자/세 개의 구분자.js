function solution(myStr) {
    var answer = myStr.split(/[abc]/).filter((e) => e).length != 0 ? myStr.split(/[abc]/).filter(e => e) : ["EMPTY"];
    return answer;
}
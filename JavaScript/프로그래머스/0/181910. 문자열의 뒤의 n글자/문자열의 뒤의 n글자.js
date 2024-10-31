function solution(my_string, n) {
    var answer = my_string.substring((my_string.length-n), my_string.length+1);
    return answer;
}
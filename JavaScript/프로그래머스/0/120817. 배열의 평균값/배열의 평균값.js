function solution(numbers) {
    var answer = 0;
    for(var a of numbers){
        answer+=a;
    }
    answer/=numbers.length;
    return answer;
}
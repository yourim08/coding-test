function solution(numbers, num1, num2) {
    var answer = new Array(num2-num1+1);
        for(let i=0; i<answer.length;i++){
            answer[i]=numbers[num1+i];
    }
    return answer;
}
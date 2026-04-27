function solution(myString) {
    var answer = [];
    const arr = myString.split("x");
    for(let x of arr){
        answer.push(x.length);
    }
    return answer;
}
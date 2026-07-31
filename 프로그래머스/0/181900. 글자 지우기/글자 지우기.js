function solution(my_string, indices) {
    var a1 = my_string.split("");
    for(let i of indices){
        a1[i] = "";
    }
    let answer = a1.join("");
    return answer;
}
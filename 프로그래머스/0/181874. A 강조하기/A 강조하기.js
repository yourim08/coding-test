function solution(myString) {
    let arr = myString.toLowerCase().split("");
    for(let i=0; i<arr.length; i++){
        if(arr[i] == 'a') arr[i] = 'A';
    }
    var answer = (arr).join("");
    return answer;
}
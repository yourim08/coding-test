function solution(arr, divisor) {
    let count = 0;
    for(let i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                count++;
            }
        }
        if(count == 0){
            var answer = [-1];
            return answer;
        }
        var answer = new Array(count);
        let n = 0;
        for(let i=0; i<arr.length; i++){
            if(arr[i]%divisor == 0){
                answer[n] = arr[i];
                n++;
            }
        }
        answer.sort((a,b) => a-b);
    return answer;
}
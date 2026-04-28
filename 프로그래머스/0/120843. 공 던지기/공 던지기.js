function solution(numbers, k) {
        let answer = 0;
        let sum=k*2;
        let index=sum-2;
        let arr = new Array(sum).fill(0);
        for(let i=0; i<arr.length ; i++){
            arr[i]=numbers[i%numbers.length];
        }
        answer = arr[index];
    return answer;
}
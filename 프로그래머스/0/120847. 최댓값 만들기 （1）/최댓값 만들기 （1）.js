function solution(numbers) {
    let answer = 0;
    let max1=0;
    let max2=0;
    let index=0;
    for(let i=0; i<numbers.length ; i++){  
        if(numbers[i]>=max1) {
            max1=numbers[i];
            index=i;
        }
    }
    for(let i=0; i<numbers.length; i++){
        if(numbers[i]>=max2 && i!=index ) {
            max2=numbers[i];
        }                             
    }
    answer=max1*max2;
    return answer;
}
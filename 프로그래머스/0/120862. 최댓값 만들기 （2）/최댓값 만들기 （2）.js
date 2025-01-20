function solution(numbers) {
    let answer=0;
    let max=0;
    let maxindex=0;
    let max1=0;
    let max1index=0;
    let max2=0;
    let max3=0;
    for(let i=0; i<numbers.length;i++){
        if(numbers[i]>=0 && numbers[i]>=max){
                max=numbers[i]; // 양수인 max
                maxindex=i;
        }
        if(numbers[i]<0 && -(numbers[i])>=max1){
                max1=numbers[i]; // 음수인 max1
                max1index=i;
        }
    }
    for(let i=0; i<numbers.length ; i++){
        if(numbers.length==2){
                if(numbers[i]!=max) max2=numbers[i];
                if(numbers[i]!=max1) max3=numbers[i];
            }
        if(numbers[i]>=0){
            if(numbers[i]>=max2 && i!=maxindex)
                max2=numbers[i]; // max가 아닌, 양수인 max2  
        }
        if(numbers[i]<0){
            if(-(numbers[i])>=max3 && i!=max1index)
                max3=numbers[i]; // max1가 아닌, 음수인 max3
        }
    }
    if(max*max2>max1*max3) answer=max*max2;
    else answer=max1*max3;
    return answer;
}
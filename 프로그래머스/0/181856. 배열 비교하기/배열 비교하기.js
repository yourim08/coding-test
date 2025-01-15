function solution(arr1, arr2) {
    let answer = 0;
    let asum=0;
    let bsum=0;
    if(arr1.length>arr2.length) answer=1;
    else if(arr1.length<arr2.length) answer=-1;
    else {
        for(let i=0; i<arr1.length; i++){
            asum+=arr1[i];
        }
        for(let i=0; i<arr2.length; i++){
            bsum+=arr2[i];
        }
        if(asum>bsum) answer=1;
        else if(asum<bsum) answer=-1;
        else answer=0;
    }
    return answer;
}
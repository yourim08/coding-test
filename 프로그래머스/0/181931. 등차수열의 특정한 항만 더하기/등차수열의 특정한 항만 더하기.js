function solution(a, d, included) {
    let answer = 0;
    let arr = new Array(included.length);
    arr[0]=a;
    for(let i=1; i<arr.length ; i++){
        a+=d;
        arr[i]=a;
    }
    for(let i=0; i<included.length ; i++){
        if(included[i]){
            answer+=arr[i];
        }
    }
    return answer;
}
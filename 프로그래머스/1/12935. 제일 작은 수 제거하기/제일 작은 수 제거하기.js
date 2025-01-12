function solution(arr) {
    if(arr.length==1){
        let answer = [-1];
        return answer;
    }
    else {
        let answer = new Array(arr.length-1);
        let min=1000;
        let index=0;
        for(let i=0; i<arr.length; i++){
            if(arr[i]<=min){
                min=arr[i];
            }
        }
        for(let i=0; i<arr.length; i++){
            if(arr[i]!=min){
                answer[index]=arr[i];
                index++;
            }
        }
        return answer;
    }
}
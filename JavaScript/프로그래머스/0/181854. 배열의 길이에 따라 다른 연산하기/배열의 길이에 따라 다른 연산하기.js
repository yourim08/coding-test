function solution(arr, n) {
    var answer = new Array(arr.length);
    if(arr.length%2==0){
        for(var i=0; i<arr.length;i++){
            if(i%2!=0) arr[i]+=n;
        }
    }
    else {
        for(var i=0; i<arr.length;i++){
            if(i%2==0) arr[i]+=n;
        }
    }
    answer = arr;
    return answer;
}
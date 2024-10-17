function solution(num_list) {
    var arr = num_list.sort((a,b)=>a-b);
    var answer = new Array(arr.length-5);
    var n=0;
    for(var i=5; i<arr.length;i++){
        answer[n]=arr[i];
        n++;
    }
    return answer;
}
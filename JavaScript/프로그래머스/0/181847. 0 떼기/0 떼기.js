function solution(n_str) {
    var answer = '';
    var arr = new Array(n_str.length);
    for(var i=0; i<n_str.length ; i++){
        arr[i]=n_str.charAt(i);
    }
    if(arr[0]=='0'){
        for(var i=0; i<arr.length; i++){
            if(arr[i]=='0'){
                arr[i]='';
            }
            else break;
        }
    }
    for(var i=0;i<arr.length;i++){
        answer+=arr[i];
    }
    return answer;
}
function solution(rsp) {
    var a = new Array(rsp.length);
    for(let i=0; i<a.length ;i++){
        if(rsp.charAt(i)=='2'){
            a[i]='0';
        }
        if(rsp.charAt(i)=='0'){
            a[i]='5';
        }
        if(rsp.charAt(i)=='5'){
            a[i]='2';
        }
    }
    let answer = '';
    for(let i=0; i<a.length ; i++){
        answer+=a[i];
    }   
    return answer;
}
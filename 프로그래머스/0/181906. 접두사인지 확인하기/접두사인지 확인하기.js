function solution(my_string, is_prefix) {
    let answer = 0;
    var str = new Array(my_string.length);
    for(let i=0; i<str.length;i++){
        str[i]="";
        for(let j=0; j<=i; j++){
            str[i]+=my_string.charAt(j);
        }
    }
    for(let i=0 ; i<str.length ; i++){
        if(is_prefix === str[i]){
            answer=1;
            break;
        }
    }
    return answer;
}
function solution(strArr) {
    var answer = new Array(strArr.length);
    for(var i=0; i<answer.length;i++){
        answer[i]='';
    }
    for(var i=0; i<strArr.length; i++){
        if(i%2==0){
            for(var j=0; j<strArr[i].length;j++){
                answer[i]+=(strArr[i].charAt(j)).toLowerCase();
            }
        }
        else {
            for(var k=0; k<strArr[i].length;k++){
                answer[i]+=(strArr[i].charAt(k)).toUpperCase();
            } 
        }
    }
    return answer;
}
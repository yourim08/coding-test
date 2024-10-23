function solution(myString) {
    var answer = '';
    for(var i=0; i<myString.length;i++){
        if(myString.charAt(i)>'z' && myString.charAt(i)<'a'){
            answer+=myString.charAt(i).toLowerCase();
        }
        else {
            answer+=myString.charAt(i).toLowerCase();
        }
    }
    return answer;
}
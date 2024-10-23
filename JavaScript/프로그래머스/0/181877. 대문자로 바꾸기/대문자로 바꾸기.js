function solution(myString) {
    var answer = '';
    for(var i=0; i<myString.length; i++){
        if(myString.charAt(i)>'Z' || myString.charAt(i)<'A'){
            answer+=myString.charAt(i).toUpperCase();
        }
        else {
            answer+=myString.charAt(i);
        }
    }
    return answer;
}
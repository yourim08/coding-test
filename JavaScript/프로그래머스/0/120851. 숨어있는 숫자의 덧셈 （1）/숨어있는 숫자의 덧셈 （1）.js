function solution(my_string) {
    var answer = 0;
    for(var i=0; i<my_string.length ; i++){
        if(my_string.charAt(i)>='0'&&my_string.charAt(i)<='9'){
            answer+=Math.floor(my_string.charAt(i));
        }
    }
    return answer;
}
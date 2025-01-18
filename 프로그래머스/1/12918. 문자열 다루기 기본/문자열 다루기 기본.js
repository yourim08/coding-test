function solution(s) {
    var answer = true;
    if(s.length == 4 || s.length == 6){
        for(let i=0; i<s.length; i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ){
                return false;
            }
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                return false;
            }
        }
    }
    else {
        return false;
    }
    return answer;
}
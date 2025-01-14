function solution(s) {
    var answer = "";
    if(s.length%2==0){
        answer+=s.charAt(Math.floor(s.length/2)-1);
        answer+=s.charAt(Math.floor(s.length/2));
    }
    else {
        answer+=s.charAt(s.length - Math.floor(s.length/2)-1);
    }    
    return answer;
}
function solution(num, k) {
    var answer = -1;
    var num1 = String(num);
    var k1 = String(k);
    for(var i=0; i<num1.length; i++){
        if(num1.charAt(i)==k1) {
            answer=i+1;
            break;
        }
    }
    return answer;
}
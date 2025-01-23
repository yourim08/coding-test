function solution(s){
    var answer = false;
    let count1 = 0;
    let count2 = 0;
    for(let i=0; i<s.length; i++){
        if(s.charAt(i) == 'P' || s.charAt(i)== 'p'){
            count1++;
        }
        else if(s.charAt(i) == 'Y' || s.charAt(i)== 'y'){
            count2++;
        }
    }
    if(count1 == count2) {
        return true;
    }
    return answer;
}
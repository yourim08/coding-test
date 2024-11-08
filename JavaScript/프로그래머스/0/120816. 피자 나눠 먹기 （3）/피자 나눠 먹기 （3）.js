function solution(slice, n) {
        var i=1;
        var answer=0;
        while (true){
            if(slice*i>=n) {
                answer=i;
                break;
            }
            else i++;
        }
    return answer;
}
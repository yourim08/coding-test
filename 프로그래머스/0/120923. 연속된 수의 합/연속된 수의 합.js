function solution(num, total) {
    var answer = [];
    answer = new Array(num);
    let result=0;
    let n=-100;
    let temp=0;
    while(true){
        temp=n;
        for(let i=0; i<num;i++){
            result+=n;
            n++;
        }
        n--;
        if(result==total){
            for(let i=0; i<answer.length ; i++){
                answer[answer.length-1-i]=n;
                n--;
            }
            break;
        }
        else {
            result=0;
            n=temp+1;
        }
    }
    return answer;
}
function solution(emergency) {
    var answer = new Array(emergency.length);
    var array= new Array(emergency.length);
    for(let i=0; i< emergency.length;i++){
        array[i]=emergency[i];
    }
    emergency.sort((a,b) => a-b); // emergency정렬
    let turn = new Array(emergency.length);
    let n=emergency.length;
    for(let i=0; i<emergency.length;i++){
        turn[i]=n;
        n--;
    }
    let sameindex=0;
    let k=0;
    for(let i=0; i<emergency.length ; i++){
        for(let j=0; j<emergency.length;j++){
            if(emergency[i]==array[j]) {
                sameindex=j;
            }
        }
        answer[k]=turn[sameindex];
        k++;
    }
    return answer;
}
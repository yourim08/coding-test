function solution(spell, dic) {
    let answer = 2;
    let count=0;
    for(let i=0; i<dic.length ; i++){
        count=0;
        for(let j=0; j<spell.length ; j++){
            if(dic[i].indexOf(spell[j]) != -1) count++;
        }
        if(count==spell.length) {
            answer=1;
            break;
        }
    }
    return answer;
}
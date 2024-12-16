function solution(hp) {
    var answer = 0;
    let ant=1;
    let sant=3;
    let cant=5;
    let count=Math.floor(hp/cant)+Math.floor((hp%cant)/sant)+Math.floor(((hp%cant)%sant)/ant);
    answer=count;
    return answer;
}
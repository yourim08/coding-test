function solution(start_num, end_num) {
    let answer = new Array(start_num-end_num+1);
    let n =0;
    for(let i=start_num; i>= end_num; i--) {
        answer[n] = i;
        n++;
    }
    return answer;
}
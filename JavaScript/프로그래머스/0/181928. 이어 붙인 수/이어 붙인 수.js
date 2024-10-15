function solution(num_list) {
    var answer = 0;
    var odd = '';
    var even = '';
    for(var i of num_list){
        if(i%2==0){
            even += String(i);
        }
        else odd += String(i);
    }
    answer = Number(odd)+Number(even);
    return answer;
}
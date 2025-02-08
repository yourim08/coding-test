function solution(n, m) {
        let i = 1;
        let g = 0;
        while(true){
            if(i>n || i>m){
                break;2
            }
            if(n%i === 0 && m%i === 0){
                g = i;
                i++;
            }
            else {
                i++;
            }
        }
        var answer = [g, Math.floor(n*m/g)];
    return answer;
}
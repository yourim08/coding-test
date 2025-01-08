function solution(n) {
        let i=1;
        while(true){
        if(i*i == n){
            return (i+1)*(i+1);
        }
        if(i==n){
            return -1;
        }
        i++;
    } 
    return answer;
}
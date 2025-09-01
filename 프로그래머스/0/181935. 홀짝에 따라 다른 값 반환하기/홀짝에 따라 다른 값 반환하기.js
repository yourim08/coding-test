function solution(n) {
    var answer = 0;
    let evensum = 0;
    let oddsum=0;
    for(let i=1; i<=n ; i++){
        if(i%2==0) {
            evensum+=(i*i);
        }
        else {
            oddsum+=i;
        }
    }
    answer = n%2==0 ? evensum : oddsum;
    return answer;
}
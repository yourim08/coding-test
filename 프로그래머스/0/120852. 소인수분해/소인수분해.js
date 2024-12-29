function solution(n) {
    let count1=0;
    let count3=0;
    let k=0;
    let l=0;
    for(let i=2; i<=n ; i++){
        let count=0;
        for(let j=2; j<=i; j++){
            if(i%j==0) count++;
        }
        if(count==1) count1++;
    }
    let m = new Array(count1);
    for(let i=2; i<=n ; i++){
        let count2=0;
        for(let j=2; j<=i; j++){
            if(i%j==0) count2++;
        }
        if(count2==1) {
            m[k]=i;
            k++;
        }
    }
    for(let i=0; i<m.length;i++){
        if(n%m[i]==0) count3++;
    }
    let answer = new Array(count3);
    for(let i=0; i<m.length;i++){
        if(n%m[i]==0){
            answer[l]=m[i];
            l++;
        }
    }
    return answer;
}
function solution(sides) {
    var answer = 2;
    var sum=0;
    var max=0;
    var count=0;
    for(var i=0; i<sides.length;i++){
        if(sides[i]>max) max=sides[i];
    }
    for(var i=0; i<sides.length;i++){
        if(sides[i]==max) count++;
    }
    for(var i=0 ; i<sides.length ; i++){
        if(sides[i]!=max && count==1) sum+=sides[i];
        if(sides[i]<=max && count>1) sum+=sides[i];           
    }
    if(sum>max) answer=1;
    return answer;
}
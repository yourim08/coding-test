function solution(a, b) {
    var answer = 0;
    var a1=String(a);
    var a2=String(b);
    for(var i=0; i<a2.length;i++){
            a1+=a2.charAt(i);
        }
        var a3 = Number(a1);
        var b1= 2*a*b;
        if(b1>a3) answer = b1;
        else if(a3>b1 || a3==b1) answer=a3;
    return answer;
}
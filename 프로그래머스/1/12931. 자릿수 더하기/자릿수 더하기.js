function solution(n)
{
    var answer = 0;
    var n1 = String(n);
    for(var i=0; i<n1.length; i++){
            answer+=Number(n1.charAt(i));
        }

    return answer;
}
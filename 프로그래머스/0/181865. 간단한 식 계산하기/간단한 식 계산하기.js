function solution(binomial) {
    var answer = 0;
    let parts = binomial.split(" ");
    let a = Number(parts[0]);
    let b = Number(parts[2]);
        switch(parts[1]){
            case "+": answer=a+b;
                      break;
            case "-": answer=a-b;
                      break;
            case "*": answer=a*b;
                      break;
        }
    return answer;
}
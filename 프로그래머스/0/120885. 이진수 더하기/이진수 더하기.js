function solution(bin1, bin2) {
    const b1 = parseInt(bin1, 2); 
    let b2 = parseInt(bin2, 2);
    let sum = b1 + b2;          
    let answer = sum.toString(2); 
    return answer;
}
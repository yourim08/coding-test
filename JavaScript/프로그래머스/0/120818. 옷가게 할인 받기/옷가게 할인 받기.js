function solution(price) {
    var answer = 0;
    if(price>=500000){
       price=Math.floor(price*0.8);
    }
    else if(price>=300000){
       price=Math.floor(price*0.9);
    }
    else if(price>=100000){
        price=Math.floor(price*0.95);
    }
    answer=price;
    return answer;
}
function solution(order) {
    var answer = 0;
    for(let i=0; i<order.length ; i++){
        if(order[i] === ("americanoice") || order[i] === ("iceamericano")
              || order[i] === ("americanohot") || order[i] === ("hotamericano")
              || order[i] === ("americano") || order[i] === ("anything"))
            answer+=4500;
        else if(order[i] === ("cafelattehot") || order[i] === ("hotcafelatte")
               || order[i] === ("cafelatteice") || order[i] === ("icecafelatte")
               || order[i] === ("cafelatte"))
            answer+=5000;
        }
    return answer;
}
function solution(phone_number) {
        let answer = "";
        let number = "";
        for(let i=phone_number.length-4; i<phone_number.length; i++){
            number+=phone_number.charAt(i);
        }
        for(let i=0; i<phone_number.length-4; i++){
            answer+='*';
        }
        answer=answer+number;
    return answer;
}
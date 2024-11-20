function solution(box, n) {
    var answer = 0;
    var a = Math.floor(box[0]/n);
    var b = Math.floor(box[1]/n);
    var c = Math.floor(box[2]/n);
    var answer = a*b*c;
    return answer;
}
def solution(box, n):
    answer = 0
    a = int(box[0]/n);
    b = int(box[1]/n);
    c = int(box[2]/n);
    answer = a*b*c;
    return answer
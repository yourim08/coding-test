def solution(bin1, bin2):
    b1 = int(bin1, 2)
    b2 = int(bin2, 2)
    answer = bin(b1 + b2)[2:]
    return answer
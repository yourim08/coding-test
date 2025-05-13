def solution(s):
    answer = True
    if len(s) != 4 and len(s) != 6:
        return False

    else :
        for i in s:
            if 'a'<=i<='z' or 'A'<=i<='Z':
                return False

    return answer
def solution(hp):
    ant=1
    sant=3
    cant=5
    answer =int(hp/cant)+int((hp%cant)/sant)+int(((hp%cant)%sant)/ant)
    return answer
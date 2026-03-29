score = {"A+":4.5, "A0": 4.0, "B+":3.5, "B0":3.0, "C+":2.5, "C0":2.0, "D+":1.5, "D0":1.0, "F":0.0, "P":0.0}

arr = []
s = 0 
for i in range(20):
    n = input().split(" ")
    if n[2] != 'P':
        ave = score[n[2]] * float(n[1])
        arr.append(ave)
        s += float(n[1])
print(sum(arr) / s)
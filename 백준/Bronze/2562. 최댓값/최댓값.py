max = 0
maxIndex = 0
for i in range(9):
    n = int(input())
    if n > max:
        max = n
        maxIndex = i
    
print(max)
print(maxIndex+1)
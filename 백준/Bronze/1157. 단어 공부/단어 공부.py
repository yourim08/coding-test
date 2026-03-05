n = input().upper()
check = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
arr = [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
max = 0
maxIndex = ""

for i in n:
    arr[check.find(i)] += 1

sortedArr = sorted(arr, reverse=True)

if sortedArr[0] == sortedArr[1]:
    print("?")
else:
    for i in range(len(arr)):
        if arr[i] > max:
            max = arr[i]
            maxIndex = i
    print(check[maxIndex])
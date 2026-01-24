n = int(input())
arr = list()
for i in range(n):
   a = int(input())
   arr.append(a)
arr.sort()
for j in range(len(arr)):
    print(arr[j])

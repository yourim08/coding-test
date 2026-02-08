arr = list(range(1, 31))
for i in range(0, 28):
    n = int(input())
    if n in arr:
        arr.remove(n)
print("{}\n{}".format(arr[0], arr[1]))
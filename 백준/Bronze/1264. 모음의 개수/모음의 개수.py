arr = ['a','e','i','o','u']

while True:
    n = input().lower()
    sum = 0
    if n == '#':
        break
    else:
        for i in arr:
            sum += n.count(i)
        print(sum)
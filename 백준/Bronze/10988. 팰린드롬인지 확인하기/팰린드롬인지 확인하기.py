n = input()
m = ("").join(list(n)[::-1])

if n == m:
    print(1)
else:
    print(0)
n = (int)(input())
strArr = []
count = 0

for i in range(n):
    s = input()
    strArr.append(s)

for j in strArr:
    stack = []
    stack.append(j[0])

    for k in j:
        prev = stack.pop()
        if prev == k:
            stack.append(k)
        else:
            stack.append(prev)
            stack.append(k)
    length = len(stack)
    check = len(set(stack))
    if length == check:
        count+=1

print(count)
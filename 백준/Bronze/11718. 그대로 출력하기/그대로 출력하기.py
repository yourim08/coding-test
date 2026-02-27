arr = []
while True:
    try:
        n = input()
        arr.append(n)
    
    except EOFError:
        break

for i in arr:
    print(i)
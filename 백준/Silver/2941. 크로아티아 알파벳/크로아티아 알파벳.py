n = input()
check = ['c=','c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']
for i in check:
    if i in n:
        n = n.replace(i, "*")
print(len(n))
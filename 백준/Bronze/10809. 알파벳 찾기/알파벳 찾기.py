import string

n = input()
arr = "abcdefghijklmnopqrstuvwxyz"
answer = ""

for i in arr:
    answer += str(n.find(i))+" "
print(answer)
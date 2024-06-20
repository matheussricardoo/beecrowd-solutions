x = int(input())
z = int(input())

while z <= x:
    z = int(input())

count = 1
total = x

while total <= z:
    total += x + count
    count += 1

print(count)

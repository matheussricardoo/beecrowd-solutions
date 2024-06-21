n = int(input())

total_somas = []

for i in range(n):
    x, y = map(int, input().split())
    soma = 0
    if x % 2 == 0:
        x += 1
    for j in range(y):
        soma += x
        x += 2
    total_somas.append(soma)

for soma in total_somas:
    print(soma)

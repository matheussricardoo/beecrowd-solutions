entrada = list(map(int, input().strip().split()))

A = entrada[0]
N = entrada[1]

i = 2
while N <= 0:
    N = entrada[i]
    i += 1

soma = sum(A + i for i in range(N))

print(soma)

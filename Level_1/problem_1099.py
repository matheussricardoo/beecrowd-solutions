n = int(input())
resultados = []

for i in range(n):
    x, y = map(int, input().split())
    soma_impar = 0

    if x > y:
        x, y = y, x

    for num in range(x + 1, y):
        if num % 2 != 0:
            soma_impar += num

    resultados.append(soma_impar)

for resultado in resultados:
    print(resultado)

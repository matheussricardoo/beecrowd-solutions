n = int(input())
resultados = []
for i in range(n):
    x, y = map(int, input().split())
    if y == 0:
        resultados.append("divisao impossivel")
    else:
        div = x / y
        resultados.append(f'{div:.1f}')

for resultado in resultados:
    print(resultado)

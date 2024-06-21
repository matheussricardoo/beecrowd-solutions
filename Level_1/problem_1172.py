resultados = []

for i in range(10):
    n = int(input())
    if n <= 0:
        resultados.append(f'X[{i}] = 1')
    else:
        resultados.append(f'X[{i}] = {n}')
for resultado in resultados:
    print(resultado)

op = input().strip()

matriz = []
for i in range(12):
    linha = []
    for j in range(12):
        valor = float(input().strip())
        linha.append(valor)
    matriz.append(linha)

soma = 0
contagem = 0
for i in range(12):
    for j in range(12):
        if (j > i) and (i + j > 11):
            soma += matriz[i][j]
            contagem += 1

if op == 'S':
    resultado = soma
elif op == 'M':
    resultado = soma / contagem

print(f"{resultado:.1f}")

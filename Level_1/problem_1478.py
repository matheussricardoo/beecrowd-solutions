resultado = []

while True:
    N = int(input().strip())

    if N == 0:
        break

    matriz = [[0] * N for _ in range(N)]

    for i in range(N):
        for j in range(N):
            matriz[i][j] = abs(i - j) + 1

    for row in matriz:
        row_string = " ".join(f"{num:>3}" for num in row)
        resultado.append(row_string)
    resultado.append("")

for output in resultado:
    print(output)

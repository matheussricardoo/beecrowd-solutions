resultados = []
notas_validas = []

while len(notas_validas) < 2:
    n = float(input())
    if n < 0 or n > 10:
        resultados.append("nota invalida")
    else:
        notas_validas.append(n)

media = sum(notas_validas) / 2
resultados.append(f"media = {media:.2f}")

for resultado in resultados:
    print(resultado)

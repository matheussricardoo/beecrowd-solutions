resultados = []
while True:
    x, y = map(int, input().split())
    if x > 0 and y > 0:
        resultados.append("primeiro")
    elif x < 0 and y > 0:
        resultados.append("segundo")
    elif x < 0 and y < 0:
        resultados.append("terceiro")
    elif x > 0 and y < 0:
        resultados.append("quarto")
    else:
        break

for i in resultados:
    print(i)

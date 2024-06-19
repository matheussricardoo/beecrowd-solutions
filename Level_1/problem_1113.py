resultado = []
while True:
    x, y = map(int, input().split())

    if x == y:
        break

    if x < y:
        resultado.append("Crescente")
    else:
        resultado.append("Decrescente")

for res in resultado:
    print(res)

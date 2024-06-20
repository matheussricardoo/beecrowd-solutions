n = 1
inter = 0
gremio = 0
contador = 0
empate = 0
vencedor = ""
while True:
    if n == 1:
        x, y = map(int, input().split())
        print("Novo grenal (1-sim 2-nao)")
        n = int(input())
        contador += 1
        if x > y:
            inter +=1
        elif y > x:
            gremio +=1
        elif x == y:
            empate +=1
    if n == 2:
        break

if inter > gremio:
    vencedor = "Inter venceu mais"
elif gremio > inter:
    vencedor = "Gremio venceu mais"
else:
    vencedor = "Grenal empatado"
print(f'{contador} grenais\nInter:{inter}\nGremio:{gremio}\nEmpates:{empate}\n{vencedor}')

senha = 2002
resultado = []
while True:
    n = int(input())

    if n == senha:
        resultado.append("Acesso Permitido")
        break
    else:
        resultado.append("Senha Invalida")
for i in resultado:
    print(i)

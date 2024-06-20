soma_alcool = 0
soma_gasolina = 0
soma_diesel = 0
while True:
    n = int(input())

    if n == 1:
        soma_alcool += 1
    elif n == 2:
        soma_gasolina += 1
    elif n == 3:
        soma_diesel += 1
    elif n == 4:
        break
print(f'MUITO OBRIGADO\nAlcool: {soma_alcool}\nGasolina: {soma_gasolina}\nDiesel: {soma_diesel}')

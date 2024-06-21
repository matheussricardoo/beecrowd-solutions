cont_div = 0
sum_div = 0

while True:
    n = float(input())
    if n < 0:
        break
    sum_div += n
    cont_div += 1

if cont_div > 0:
    div = sum_div / cont_div
    print(f'{div:.2f}')

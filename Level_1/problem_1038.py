x,y = map(int,input().split())

if x == 1:
    id = 4 * y
elif x == 2:
    id = 4.50 * y
elif x == 3:
    id = 5 * y
elif x == 4:
    id = 2 * y
elif x == 5:
    id = 1.50 * y

print(f"Total: R$ {id:.2f}")


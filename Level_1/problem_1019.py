n = int(input())

hours = n // 3600
minutes = (n % 3600) // 60
seconds = n % 60
print(f'{hours}:{minutes}:{seconds}')

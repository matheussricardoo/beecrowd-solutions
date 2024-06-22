op = input().strip()

matrix = []
for i in range(12):
    row = []
    for j in range(12):
        row.append(float(input().strip()))
    matrix.append(row)

total_sum = 0.0
count = 0

for i in range(7, 12): 
    for j in range(12 - i, i): 
        total_sum += matrix[i][j]
        count += 1

if op == 'S':
    result = total_sum
elif op == 'M':
    result = total_sum / count

print(f"{result:.1f}")

pair = 0
odd = 0
positives = 0
negatives = 0
for i in range(5):
    n = float(input())
    if n % 2 == 0:
        pair+=1
    else:
        odd +=1
    if n > 0:
        positives +=1
    elif n < 0:
        negatives +=1
print(f"{pair} even value(s)\n{odd} odd value(s)\n{positives} positive value(s)\n{negatives} negative value(s)")

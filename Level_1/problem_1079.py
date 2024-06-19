n = int(input())
medias = []

for i in range(n):
    x, y, z = map(float, input().split())
    media = (x * 2 + y * 3 + z * 5) / 10
    medias.append(media)

for media in medias:
    print(f'{media:.1f}')

def minNum(x):
    min = x[0]
    indexNum = 0

    for i in range(1, len(x)):
        if min > x[i]:
            min = x[i]
            indexNum = i
    return min, indexNum

x = list(map(int, input().split()))

print(minNum(x))
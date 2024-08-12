def serch(a, x):
    start = 0
    end = len(a) - 1
    
    while start <= end:
        mid = (start + end) // 2
        if x == a[mid]: 
            return mid
        elif x > a[mid]:
            start = mid + 1
        else:
            end = mid - 1

    return -1 

v = [1, 4, 9, 16, 25, 36, 49, 64, 81]
num = int(input())

print(serch(v, num))
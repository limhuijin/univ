
"""
파이썬 유사 코드

input A[]

def sort():
    n = length(a)
    if a == 1:
        return A
    pivot = A[0]
    A[0].pop()
    L = []; R = [];
    for i in range(n - 1):
        if A[i] < pivot:
            L.append()
        else:
            R.append()
    left = sort(L)
    right = sort(R)
    
    return left + A[pivot] + right
"""

def sort(a):
    n = len(a)
    if n <= 1:
        return a
    pivot = a[0]
    left = []
    right = []
    for i in range(1, n):
        if a[i] < pivot:
            left.append(a[i])
        else:
            right.append(a[i])
    left = sort(left)
    right = sort(right)
    
    return left + [pivot] + right

v = [10, 58, 45, 25, 78, 98, 54, 24]
print(sort(v))

def q_sort(a, left, right):
    if right <= left:
        return
    pivot = left
    for i in range(left + 1, right):
        if a[i] <= a[pivot]:
            a.insert(pivot, a.pop(i))
            pivot += 1
    q_sort(a, left, pivot)
    q_sort(a, pivot+1, right)
    return a

v = [10, 58, 45, 25, 78, 98, 54, 24]
print(q_sort(v, 0, len(v)))
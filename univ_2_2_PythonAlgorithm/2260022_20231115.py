# def find_id(R, x):
#     n = len(R)
#     for i in range(0, n):
#         if x < R[i]:
#             return i
#     return n

# def sort(A):
#     result = []
#     while A != []:
#         a = A.pop()
#         id = find_id(result, a)
#         result.insert(id, a)
#     return result

# arr = [7, 2, 3, 5, 4, 8, 9]

# print(sort(arr))

# def sortG(arr):
#     n = len(arr)
#     for i in range(1, n):
#         for j in range(0, i):
#             if arr[i] < arr[j]:
#                 x = arr.pop(i)
#                 arr.insert(j, x)
#     return arr

# arr = [1, 5, 8, 4, 6, 2, 3]
# print(sortG(arr))

# def sortG(arr):
#     n = len(arr)
#     for i in range(1, n):
#         for j in range(0, i):
#             if arr[i] > arr[j]:
#                 x = arr.pop(i)
#                 arr.insert(j, x)
#     return arr

# arr = [1, 5, 8, 4, 6, 2, 3]
# print(sortG(arr))

# def fac(n):
#     result = 1
#     for i in range(1, n+1):
#         result *= i
#     return result

# print(fac(4))

# def fac(n):
#     if n == 0:
#         return
#     print(n)
#     fac(n-1)

# print(fac(4))

# def sum(n):
#     if n < 2: 
#         return 1
#     return n + sum(n-1)
    
# print(sum(3))

def f_max(a, n): 
    if n == 1:
        return a[0]
    max = f_max(a, n - 1)
    if max > a[n - 1]:
        return max
    else:
        return a[n - 1]

x = [17, 92, 18, 33, 58, 7, 33, 42]
print(f_max(x, len(x))) 
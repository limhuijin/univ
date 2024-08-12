# def searchX(a, n, x):
#     for i in range(0, n): 
#         if x == a[i]:
#             return i

#     return -1

# a = list(map(int, input().strip().split(', ')))
# x = int(input())
# n = len(a)

# print(searchX(a, n, x))

# a = list(map(int, input().strip().split(', ')))
# x = int(input())
# n = len(a)
# num = 0
# printNum = -1

# while num < n:
#     if x == a[num]:
#         printNum = num
#         break
#     num += 1

# print(printNum)

# def searchX(a, n, x):
#     arr = []
#     for i in range(0, n): 
#         if x == a[i]:
#             arr.append(i)

#     return arr

# a = list(map(int, input().strip().split(', ')))
# x = int(input())
# n = len(a)

# print(searchX(a, n, x))

def searchX(no, name, x):
    for i in range(len(no)): 
        if x == no[i]:
            return name[i]
    return "?"

no = [39, 14, 67, 105]
name = ["Justin", "John", "Mike", "Summer"]
x = int(input())

print(searchX(no, name, x))

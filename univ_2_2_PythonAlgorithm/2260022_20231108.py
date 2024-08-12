# def ho(s):
#     qu = []
#     st = []

#     for x in s:
#         if x.isalpha():
#             qu.append(x.lower())
#             st.append(x.lower())

#     while qu != []:
#         if qu.pop(0) != st.pop():
#             return False
#     return True

# s = "기러기"
# print(ho(s))

# def ho2(s):
#     arr = []

#     for x in s:
#         if x.isalpha():
#             arr.append(x.lower())
#     n = len(arr)
#     for i in range(0, n//2):
#         if arr[i] != arr[n - (i+1)]:
#             return False
#     return True

# s = "기러기"
# print(ho(s))

# def minNum(arr):
#     n = len(arr)
#     min = arr[0]; min_id = 0
    
#     for i in range(1, n):
#         if arr[i] < min:
#             min = arr[i]; min_id = i
#     return min_id

# def selet_sort(arr):
#     result = []
#     while arr:
#         min_id = minNum(arr)
#         result.append(arr[min_id])
#         arr.pop(min_id)
#     return result
        
# arr = [56, 72, 45, 35, 95, 20, 80]

# print(selet_sort(arr))

# def selet_sort2(arr):
#     n = len(arr)
#     for i in range(0, n):
#         min = arr[i]
#         min_id = i
#         for j in range(i+1, n):
#             if arr[j] < min:
#                 min = arr[j]
#                 min_id = j
#         arr[i], arr[min_id] = arr[min_id], arr[i]
#     return arr


# arr = [56, 72, 45, 35, 95, 20, 80]

# print(selet_sort2(arr))

def selet_sort3(arr):
    n = len(arr)
    for i in range(0, n):
        max = arr[i]
        mix_id = i
        for j in range(i+1, n):
            if arr[j] > max:
                max = arr[j]
                mix_id = j
        arr[i], arr[mix_id] = arr[mix_id], arr[i]
    return arr


arr = [56, 72, 45, 35, 95, 20, 80]

print(selet_sort3(arr))
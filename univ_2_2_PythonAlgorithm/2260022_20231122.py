def merge(arr1, arr2):
    result = []

    while arr1 and arr2:
        if arr1[0] > arr2[0]:
            x = arr1.pop(0)
        else:
            x = arr2.pop(0)
        result.append(x)

    if arr1:
        result.extend(arr1)
    elif arr2:
        result.extend(arr2)

    return result

def merge_sort(arr):
    n = len(arr)
    if n > 1:
        mid = n // 2
        
        left = merge_sort(arr[:mid])
        right = merge_sort(arr[mid:])
        root = merge(left, right)
    else:
        root = arr

    return root

arr = [9, 5, 1, 6, 2, 4, 3]

print(merge_sort(arr))  
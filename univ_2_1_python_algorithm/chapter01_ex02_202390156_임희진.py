def find_max(A):
                max = A[0]

                for i in range(1, len(A)):
                                if max < A[i]:
                                                max = A[i]
                return max

#array = [20, 34, 12, 93, 84, 39, 64, 55, 24]

array = list(map(int, input().split()))

print(find_max(array))

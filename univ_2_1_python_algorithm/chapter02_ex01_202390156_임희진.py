import time

def compute_square_A(n):
    return n * n

def compute_square_B(n):
    sum = 0
    for i in range(0, n):
                    sum += n
    return sum

def compute_square_C(n):
    sum = 0
    for i in range(0, n):
                    for j in range(0, n):
                                    sum = sum + 1
    return sum

n = 1000000

start = time.time()
print(compute_square_A(n))
end = time.time()
print("O(1)실행시간 = ", end - start)

start = time.time()
print(compute_square_B(n))
end = time.time()
print("O(n)실행시간 = ", end - start)

start = time.time()
print(compute_square_C(n))
end = time.time()
print("O(n^2)실행시간 = ", end - start)

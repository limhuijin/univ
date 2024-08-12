"""
행렬 곱셈(억지 기법, 쉬트라쎈)

두 개의 nxn 행렬 A와 B를 행렬 곱을 하여 C를 구하여라
(쉬트라쎈의 경우 numpy 사용)
"""

import numpy as np 
import time

def multiply(A, B, C) :
    n = len(A)
    for i in range(n):
                    for j in range(n):
                                    C[i][j] = 0
                                    for k in range(n):
                                                    C[i][j] += A[i][k] * B[k][j]

def strassen(A, B):
                n = len(A)
                if n == 1:
                                return A * B

                n2 = n // 2
                A11, A12, A21, A22 = A[:n2, :n2], A[:n2, n2:], A[n2:, :n2], A[n2:, n2:]
                B11, B12, B21, B22 = B[:n2, :n2], B[:n2, n2:], B[n2:, :n2], B[n2:, n2:]

                M1 = strassen(A11 + A22, B11 + B22)
                M2 = strassen(A21 + A22, B11)
                M3 = strassen(A11, B12 - B22)
                M4 = strassen(A22, B21 - B11)
                M5 = strassen(A11 + A12, B22)
                M6 = strassen(A21 - A11, B11 + B12)
                M7 = strassen(A12 - A22, B21 + B22)

                C11 = M1 + M4 - M5 + M7
                C12 = M3 + M5
                C21 = M2 + M4
                C22 = M1 + M3 - M2 + M6

                C = np.vstack((np.hstack((C11, C12)), np.hstack((C21, C22))))

                return C

A = [[1, 2], [2, 1]]
B = [[2, 3], [3, 2]]
C = [[0, 0], [0, 0]]

start = time.time()                             #함수의 시작 시간
multiply(A, B, C)
end = time.time()                               #함수의 끝 시간
print(C)
print("\n실행시간 = ", end - start)   #실행시간 프린트
print()


A = np.array(A)
B = np.array(B)

start = time.time()                             #함수의 시작 시간
C = strassen(A,B)
end = time.time()                               #함수의 끝 시간
print(C)
print("\n실행시간 = ", end - start)   #실행시간 프린트
print()


"""
행렬 곱셈 억지 기법 복잡도 : n 길이의 반복문 3번(2 x 2, 2 x 2 행렬의 경우 8번의 곱셈과 4번의 덧셈)

복잡도 : O(n^3)

쉬트라쎈의 전략 복잡도 : 곱셈 연산을 기본 연산으로 하였을 경우 T(n) = n ^ log2 7 약 n ^ 2.81

복잡도 : O(n ^ 2.81)

복잡도는 쉬트라쎈이 빠르나 자주 사용되지는 않는다.
"""

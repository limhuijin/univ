"""
이진 탐색

n개의 리스트에서 “탐색키”를 가진 항목을 찾아보자.
이진 탐색(binary search) 알고리즘을 사용해보자.

조건 : 순환구조, 반복구조 사용, 리스트는 정렬되어있음
"""
import time

def binary_search(A, key, low, high) :                  #매개변수로 리스트, 키, 인덱스의 최솟값, 최댓값 받아옴
    if low <= high:                                     #항목이 있다면
        mid = (low + high) // 2                         #가장 가운데의 값 저장
        if key == A[mid]:                               #만약 가운데의 값이 키와 같다면
            return mid                                  #값 반환
        elif key < A[mid]:                              #만약 키가 가운데의 값보다 작다면
            return binary_search(A, key, low, mid-1)    #최솟값 - 가운데 값으로 함수 호출
        else:
            return binary_search(A, key, mid+1, high)   #반대라면 가운데 값 - 최댓값으로 함수 호출

    return -1

def binary_search_iter(A, key, low, high) :             #매개변수로 리스트, 키, 인덱스의 최솟값, 최댓값 받아옴
    while low <= high:                                  #항목이 있다면
        mid = (low + high) // 2                         #가장 가운데의 값 저장
        if key == A[mid]:                               #만약 가운데의 값이 키와 같다면
            return mid                                  #값 반환
        elif key > A[mid]:                              #만약 키가 가운데의 값보다 크다면
            low = mid + 1                               #가운데 값 - 최댓값 값으로 함수 호출
        else:                                           #반대라면 최솟값 - 가운데 값으로 반복
            high = mid - 1
    
    return -1

listA = []
key = 0

listA = list(map(int, input('').split()))
key = int(input(''))

print("입력 리스트 =", listA)

start = time.time()                   #함수의 시작 시간
print("%d 탐색(순환) -->" %(key), binary_search(listA, key, 0, len(listA)-1) )
end = time.time()                     #함수의 끝 시간
print("\n실행시간 = ", end - start)   #실행시간 프린트

start = time.time()                   #함수의 시작 시간
print("%d 탐색(반복) -->" %(key), binary_search_iter(listA, key, 0, len(listA)-1) )
end = time.time()                     #함수의 끝 시간
print("\n실행시간 = ", end - start)   #실행시간 프린트

"""
함수의 복잡도 : 입력된 크기 n
최선의 경우 : O(1)
최악의 경우 : O(log2n)
"""

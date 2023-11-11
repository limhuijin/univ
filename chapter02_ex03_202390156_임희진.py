"""자연수의 이진수 변황에서 총 비트 수 계산
자연수 n을 이진수로 표시하였을 떄 총 비트 수를 리턴하는 함수를 작성(순환 구조 사용)"""

arr = []        #리스트 정의

def binary_digits(n):
                if n <= 1:
                                arr.insert(0, n % 2)                            #2진수를 배열에 추가
                                return 1
                else :
                                arr.insert(0, n % 2)                            #2진수를 배열에 추가
                                return 1 + binary_digits(n // 2)        #재귀함수 사용해서 비트 수 더해줌


n = int(input("양의 정수를 입력해주세요 : "))              #양의 정수 받아옴

print(binary_digits(n))         #함수 프린트
print(arr)                                 #리스트 프린트

"""n = 2^k
복잡도 : O(log2 n)"""

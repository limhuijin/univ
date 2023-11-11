"""
기수 정렬 알고리즘

함수 radix_sort(A)를 완성하자.

조건 : 큐를 사용하여 만들 것
"""
from queue import Queue                                         #파이썬 모듈 큐 사용
import random                                                             #파이썬 모듈 랜덤 사용
import time                                                                   #파이썬 모듈 타임 사용


def radix_sort(A):                                                         #매개변수를 A로 가지는 radix_sort 선언     
                queues = []                                                     #큐를 넣을 리스트 선언
                for i in range(BUCKETS):                              #버킷의 크기만큼 반복          
                                queues.append(Queue())            #큐 추가

                n = len(A)                                                       #n의 길이는 A리스트의 길이    
                factor = 1                                                        #1의 자리부터 시작하기 위해 1로 시작
                for d in range(DIGITS):                                 #자릿수 만큼 반복
                                for i in range(n):                            #A 리스트의 길이만큼 반복   
                                                queues[(A[i]//factor) % 10].put(A[i])           #버킷의 위치를 계산한 후((A[i]//factor) % 10) 버킷에 숫자 삽입
                                j = 0                                                                                     #j를 0으로 초기화     
                                for b in range(BUCKETS):                                                #버킷에서 꺼냄        
                                                while not queues[b].empty():                         #인덱스 b가 비어있지 않다면           
                                                                A[j] = queues[b].get()                      #큐의 원소를 꺼내 리스트에 저장   
                                                                j+= 1                                                    #j를 ++       
                                factor *= 10                                                                       #자릿수를 위해 10을 곱해줌
                                print("step", d + 1, A)                                                       #과정 출력용 프린트문  

BUCKETS = 10                                    #버킷 길이 지정
DIGITS = 4                                           #자릿수 지정           
data = []                                               #리스트 생성        
for i in range(10):                              #최대 4자리수의 랜덤 숫자 생성
                data.append(random.randint(1,9999))


start = time.time()                             #함수의 시작 시간
radix_sort(data)
end = time.time()                               #함수의 끝 시간
print("Radix: ", data)
print("\n실행시간 = ", end - start)   #실행시간 프린트


"""
복잡도 : 숫자의 자릿수 d만큼 반복되며 이는 전체 버킷에 들어있는 항복의 수 만큼 반복된다.
O(d * n)
"""

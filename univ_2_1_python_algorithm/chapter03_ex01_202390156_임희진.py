"""
chapter03_ex01_202390156_임희진

문자열 매칭 문제

길이가 n인 입력 문자열 T
길이가 m인 패턴 문자열 P

조건

n >= m
문자열은 알파벳과 띄어쓰기만으로 구성
대소문자 구분

T에서 가장 먼저 나타나는 P의 위치 찾기, 패턴이 없으면 -1 반환
"""
import time                                                   #실행시간을 위한 time  

def string_matching(T, P):                          #문자열 T와 P를 매개변수로 받아오는 함수 string_matching
                n = len(T)                                       #문자열 T의 길이 n
                m = len(P)                                      #문자열 P의 길이 m
                for i in range(n - m + 1):                       #반복문 0 - n - m + 1까지
                                j = 0                                          #j를 0으로 초기화 
                                while j < m and P[j] == T[i + j]:                #j < m이고 P[j] == T[i + j]라면 반복
                                                j = j + 1                                        #j++
                                if j == m:                                                     #while이 끝난 이후 j == m이라면 
                                                return i                                        #현재 인덱스를 반환
                return -1                                                                      #반환되는 인덱스가 없다면(같은 패턴이 없다면) -1 반환

T = input("문자열 T를 입력해주세요 : ")
P = input("패턴 문자열 p를 입력해주세요 : ")

start = time.time()                                              #함수의 시작 시간
print(string_matching(T, P))
end = time.time()                                               # 함수의 끝 시간
print("실행시간 = ", end - start)                        #실행시간 프린트
"""
최선의 경우 : 처음 위치에서 패턴이 같을 경우
O(m)

최악의 경우 : 패턴이 움직일 수 있는 전체 위치의 수인 n - m + 1까지 반복하였을 경우
O(mn)
"""

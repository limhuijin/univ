"""
chapter03_ex02_202390156_임희진

최근접 쌍의 거리 문제

2차원 평면상에 있는 n개의 점들 중 가장 인접한 쌍의 거리를 구하자.

조건

두 점 사이의 거리를 계산할 경우 유클리드 거리를 이용
"""

import math                                                     #sqrt를 위한 math 임포트
import time                                                       #실행시간을 위한 time  

def closest_pair(p):                                            #매개변수 p를 가지는 함수 closest_pair
                n = len(p)                                            #p의 길이 n
                mindist = float("inf")                         #무한대의 실숫값 정의 
                for i in range(n - 1):                           #i 부터 n - 1까지 반복
                                for j in range(i + 1, n):       #j(i + 1)부터 n까지 반복
                                                dist = math.sqrt((int(p[i][0]) - int(p[i][1]))**2 + (int(p[j][0]) - int(p[j][1]))**2)           #유클리드 거리 구하는 공식
                                                if dist < mindist:  #만약 더 작은 거리가 있다면
                                                                mindist = dist                  #더 작은 거리를 mindist
                return mindist

p = []          #p 리스트 정의

#아래는 좌표의 갯수와 좌표를 2개씩 쌍을 만들어주는 과정
xy_input = int(input("좌표의 갯수를 입력하세요 : "))

for i in range(xy_input):
                string_p = input("좌표를 입력하세요 : ").split()
                p.append(string_p)

start = time.time()                                              #함수의 시작 시간
print("최근점 거리:", closest_pair(p))
end = time.time()                                               # 함수의 끝 시간
print("실행시간 = ", end - start)                        #실행시간 프린트

"""
함수의 복잡도 : for문 두개를 사용하였으며 부가적인 것들은 제거
n(n - 1) / 2 = O(n ^ 2)
"""

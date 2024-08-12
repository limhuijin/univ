"""
호스풀 알고리즘

함수 search_horspool(T, P)를 완성하자.

"""

import time

NO_OF_CHARS = 128                                               #아스키 코드의 갯수 입력

def shift_table(pat):                                                   #pat을 매개변수로 가지는 shift_table 정의
                m = len(pat)                                                 #찾길 원하는 문자열 (P)의 길이   
                tbl = [m] * NO_OF_CHARS                        #시프트 테이블을 아스키 코드의 길이만큼 생성

                for i in range(m - 1):                                    #문자열의 길이, 모든 문자에 대하여   
                                tbl[ord(pat[i])] = m - 1 - i            #알파벳이 문자열의 몇번째 문자인지 확인하여 삽입
                return tbl                                                       #테이블 리턴         


def search_horspool(T, P):                                          #T, P를 매개변수로 가지는 search_horspool 정의
                m = len(P)                                                      #찾고자 하는 문자열(P)의 길이 m
                n = len(T)                                                       #긴 문자열(T)의 길이
                t = shift_table(P)                                           #shift 테이블을 찾고자 하는 문자열을 사용하여 t로 생성
                i = m - 1                                                          #문자열의 오른쪽 끝의 문자 위치
                while (i <= n - 1):                                           #구할 수 있는 모든 위치라면
                                k = 0                                                 #매칭 되었는지 확인하기 위한 카운트
                                while k <= m - 1 and P[m - 1 - k] == T[i - k]:                  #만약 문자열이 같고 카운트가 문자열의 길이보다 작다면
                                                k += 1                               #반복하며 카운트 증가
                                if k == m:                                         #문자열이 동일하다면(매칭 성공이라면)
                                                return i - m + 1                #매칭된 첫번째 위치 반환
                                else:                                                   #아니라면 매칭 실패했다면
                                                tc = t[ord(T[i-k])]             #긴 문자열의 아스키 코드를 확인하여 같은 것이 있는지 확인
                                                i += (tc - k)                        #있다면 i값 조정           
                return -1                                                            #매칭 실패하면 -1 반환
 

start = time.time()                             #함수의 시작 시간
print("패턴의 위치 :", search_horspool("APPLEMANGOBANANAGRAPE", "BANANA"))
end = time.time()                               #함수의 끝 시간
print("\n실행시간 = ", end - start)   #실행시간 프린트

"""
복잡도 : 최악의 경우 외부 루프는 n - m번 반복된다. 또한 하나의 위치에서 패턴의 길이만큼의 비교가 필요하다.

최악의 경우 : O(mn)

평균적인 경우 : O(n)
"""

"""n개의 원판을 옮기는 하노이의 탑 프로그램
3개의 막대 A, B, C가 있으며 막대 A에 크기가 모두 다른 n개의 원판이 큰 것이 아래에서 부터 순서대로 놓여있다.
이 원판들을 모두 막대 C로 옮기는 프로그램

조건 : 원판은 한 번에 한 개씩만 옮길 수 있으며, 작은 원판 위에 큰 원판을 절대 놓을 수 없다.
           모든 원판은 크기가 서로 다르다."""

n = int(input("양의 정수를 입력해주세요 : "))                              #양의 정수 받아옴

def hanoi_tower(n, fr, tmp, to):                                                #하노이 함수 정의
                if(n == 1):                                                                      #만약  원판이 한개일 경우
                                print("원판 1: %s --> %s" % (fr, to))             
                else:                                                                                 #만약 원판이 한개가 아닐 경우
                                hanoi_tower(n-1, fr, to, tmp)                    #큰 원판을 제외한 나머지 원판 보내는 재귀함수
                                print("원판 %d: %s --> %s" % (n, fr, to)) #큰 원판을 목표 기둥으로 이동
                                hanoi_tower(n-1, tmp, fr, to)                    #나머지 원판 이동 재귀함수

hanoi_tower(n, 'A','B', 'C')

"""재귀함수 (n-1) + 프린트 + 재귀함수 (n-1) = 2^n - 1
복잡도 : O(2^n)"""

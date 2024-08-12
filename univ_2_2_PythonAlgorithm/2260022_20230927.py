def fun(n): #수정
                sum = 0
                i = 1
                while(i <= n):
                                sum += i
                                i += 1

                return sum

n = int(input("정수 입력 : "))

print(fun(n))
"""기본 알고리즘
n = 10
sum = 0
i = 1

while(i <= n):
                sum += i
                i += 1

print(sum)"""

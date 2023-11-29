def fun(n): #for문
                sum = 0
                for i in range(1, n+1):
                                sum += i

                return sum

n = int(input("정수 입력 : "))

print(fun(n))

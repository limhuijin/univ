def funSum(n):
                sum = 0
                for i in range(1, n + 1):
                              sum += i**2
                return sum

def funSumSum(n):
                return (n * (n + 1) * ((2*n) + 1)) / 6

n = int(input("정수 입력 : "))
print(funSum(n))
print(funSumSum(n))
                

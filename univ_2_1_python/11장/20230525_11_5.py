import math

try:
                n = int(input('양의 정수 입력 > '))
                if n <= 0:
                                raise Exception('양의 정수를 입력하세요.')

except ValueError as exp:
                print('\t예외 발생 이름: {}'. format(type(exp)))
                print('\t예외 발생 이유: {}'. format(exp))
                print('\t입력한 값이 정수가 아닙니다.')

except Exception as e:
                print('\t예외 발생 이름: {}'. format(type(e)))
                print('\t예외 발생 이유: {}'. format(e))
                print('\t입력한 값이 양의 정수가 아닙니다.')

else:
                print('{}! = {}'.format(n, math.factorial(n)))

finally:
                print('프로그램 종료!'.center(30, "*"))

lst = ['C/C++', 'java', 'c#', 'python']

try:
                print(lst[4])
except Exception as e:
                print('예외 발생 이름: {}'.format(type(e)))
                print('예외 발생 이유: {}'.format(e))
else:
                print('잘 실행됐습니다.')
finally:
                print('예외 처리가 잘되는군요!')

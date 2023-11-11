while True:
                try:
                                xstr = input('정수 입력 > ')
                                x = int(xstr)
                                y = int(input('0이 아닌 정수 입력 > '))
                                prod = x * y
                                divd = x / y

                except ZeroDivisionError as exp:
                                print('except ZeroDivisionError as exp:')
                                print('\t예외 발생 이름: {}'. format(type(exp)))
                                print('\t예외 발생 이유: {}'. format(exp))
                                print('\t0으로는 나눌 수 없습니다.')
                except ValueError as exp:
                                print('except ValueError as exp:')
                                print('\t예외 발생 이름: {}'. format(type(exp)))
                                print('\t예외 발생 이유: {}'. format(exp))
                                print('\t입력한 값이 정수가 아닙니다.')
                else:
                                print('{} x {} = {}'.format(x, y, prod))
                                print('{} % {} = {}'.format(x, y, divd))

                finally:
                                if xstr in ['x', 'X']:
                                                print('종료합니다.')
                                                break
                                print('다시 해 보세요')

dates = int(input('한 달 최대 일수를 입력 >> '))
day = int(input('철 날 1일의 시작 요일을 입력(0 = 일, 1 = 월 .... 6 = 토) >> '))
day %= 7

print('\n', end = ' ')
for i in '일월화수목금토' :
                print('%s' % i, end = ' ')
else:
                print('\n')

cnt = 0

if day != 0:
                print('   ' * day, end = ' ')
                cnt += 1

for i in range(1, dates + 1):
                print('%2d' % i, end = ' ')
                cnt += 1
                if cnt % 7 == 0:
                                print()
else:
                print()

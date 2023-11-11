from random import randint
LUCKY = 7

while True:
                n = randint(0, 9)
                if n == LUCKY:
                                print('드디어 %d, 종료!' %n)
                                break
                else:
                                print('%d, %d 나올 때까지 계속!' %(n, LUCKY))
else:
                print('여기는 실행되지 않습니다.')

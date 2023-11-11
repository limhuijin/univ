point = int(input('성적을 입력해주세요 : '))

if 90 <= point:
                print('점수 {}, 성적 {}'.format(point,' A'))
elif 80 <= point:
                print('점수 {}, 성적 {}'.format(point,' B'))
elif 70 <= point:
                print('점수 {}, 성적 {}'.format(point,' C'))
elif 60 <= point:
                print('점수 {}, 성적 {}'.format(point,' D'))
else:
                print('점수 {}, 성적 {}'.format(point,' F'))

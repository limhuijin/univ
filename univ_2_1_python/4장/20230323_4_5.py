pm = float(input('미세먼지 농도를 입력해주세요 : '))

if 151 <= pm:
                print('미세먼지 농도 : {:.2f}, 등급 : {}'.format(pm,' 매우 나쁨'))
elif 81 <= pm:
                print('미세먼지 농도 : {:.2f}, 등급 : {}'.format(pm,' 나쁨'))
elif 31 <= pm:
                print('미세먼지 농도 : {:.2f}, 등급 : {}'.format(pm,' 보통'))
else:
                print('미세먼지 농도 : {:.2f}, 등급 : {}'.format(pm,' 좋음'))


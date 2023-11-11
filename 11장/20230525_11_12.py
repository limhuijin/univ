import os

try:
                with open('pyfile.txt', mode = 'w') as file:
                                file.write('파일 이름 수정과 삭제')

                os.rename('pyfile.txt', '파일수정삭제.txt')
                os.remove('파일수정삭제.txt')
except Exception as e:
                print(' 예외 발생! ')

else:
                print(' 파일 수정 삭제 성공! ')

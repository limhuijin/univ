def addone():
                global i
                print('\t전역 변수 i 읽기, i + 1: ', i + 1)
                i+=1

i = 20
print('i:', i)
addone()
print('i:', i)

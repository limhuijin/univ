import pickle as pk

try:
                with open('dicmonth.pic', mode = 'rb') as f:
                                dmon = pk.load(f)
                                pl = pk.load(f)
except FileNotFoundError as e:
                print(e)
                print(' 파일 읽기 실패! '.center(30, '*'))

else:
                print(dmon)
                print(pl)
                print(' 바이너리 파일 읽기 실패! '.center(30, '*'))

finally:
                print(' 프로그램 종료! '.center(30, '*'))

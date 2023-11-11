import pickle as pk

month = {1: 'January', 2 : 'February', 3 : 'March', 4: 'April'}
month[5] = 'May'
month[6] = 'June'
lst = ['', '', '']

with open('dicmonth.pic', mode = 'wb') as f:
                pk.dump(month, f)
                pk.dump(lst, f)

print(' 바이너리 파일 쓰기 완료! '.center(30, '*'))

str = input('콤마로 구분된 단어 3개 입력 >> ')
str = str.replace(' ', '')
w1, w2, w3 = str.split(',')

print('단어: {}, 역순: {}, 회문: {}'.format(w1, w1[::-1], (w1 == w1[::-1])))
print('단어: {}, 역순: {}, 회문: {}'.format(w2, w2[::-1], (w2 == w2[::-1])))
print('단어: {}, 역순: {}, 회문: {}'.format(w3, w3[::-1], (w3 == w3[::-1])))

singer = ['BTS', '볼빨간사춘기', 'BTS', '블랙핑크', '태연', 'BTS']
song = ['작은 것들을 위한 시','나만 봄', '소우주', 'Kill This Love', '사계']

kpop = list(zip(singer, song))
print(kpop)

kpchart = dict(enumerate(kpop, start = 1))

print(kpchart)
print()

import pprint
pprint.pprint(kpchart)

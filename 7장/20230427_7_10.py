def myjeyprint(**kwargs):
                for key in kwargs:
                                print('{}: {}'.format(key, kwargs[key]), end = ' ')
                print()

myjeyprint(여자친구=6, 마마무 = 4)
myjeyprint(엑소 = 9, 트와이스 = 9, 블랙핑크 = 4, 방탄소년단 = 7)

coffeeprice = {'에스프레소' : 2500, '아메리카노' : 2800, '카페라테' : 3200}
mycar = {"brand" : "현대", "model" : "제네시스", "year" : 2016}
myjeyprint(**coffeeprice)
myjeyprint(**mycar)

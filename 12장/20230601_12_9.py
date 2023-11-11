class Singer:
                def __init__(self, name, debut):
                                self.name = name
                                self.debut = debut

                def introduce(self):
                                print('안녕하세요! 가수 %s입니다.' % self.name)

                def age(self):
                                print('데뷰한지 %d년이 됐네요.' % (2023 - self.debut + 1))

class KPopGroup(Singer):
                def __init__(self, name, debut, cnt):
                                super().__init__(name, debut)
                                self.cnt = cnt

                def introduce(self):
                                super().introduce()
                                print('우린 KPop 그룹으로 %d명 입니다.' % self.cnt)

bts = KPopGroup('BTS', 2013, 7)
bts.introduce()
bts.age()

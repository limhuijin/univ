class Robot:
                def __init__(self):
                                self.laws = '인간에게 해를 입려서는 안 됩니다.'

                def hello(self):
                                print('전 로봇입니다.')

                def __str__(self):
                                return '전 로봇으로 ' + self.laws

class HumanoidRobot(Robot):
                def __init__(self, name):
                                self.name = name

                def speak(self):
                                print('%s는 사람처럼 말을 할 수 있습니다.' % self.name)

roboi = Robot()
print(roboi)

hr = HumanoidRobot('아시모')
hr.hello()
hr.speak()

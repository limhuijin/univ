from abc import *

class Polygon(metaclass = ABCMeta):
                @abstractmethod
                def area(self):
                                pass

class Triangle(Polygon):
                def __init__(self, width, height):
                                self.width = width
                                self.height = height

                def area(self):
                                return self.width * self.height / 2

tri = Triangle(2.4, 4.3)
print('삼각형 면적: %.2f' % tri.area())

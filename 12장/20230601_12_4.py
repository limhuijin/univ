class Rectangle:
                count = 0
 
                def __init__(self, width, height):
                                self.width = width
                                self.height = height
                                Rectangle.count += 1

                def __str__(self):
                                return '사각형 가로 : {} 세로 : {}'. format(self.width, self.height)

r1 = Rectangle(2.3, 3.2)
r2 = Rectangle(1.4, 2.8)
print(r1)
print(r2)
print(Rectangle.count, r1.count, r2.count)

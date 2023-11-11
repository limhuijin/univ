class Circle:
                def __init__(self, radius = 1):
                                self.radius = radius

                def area(self):
                                return self.radius * self.radius * 3.14

class Cylinder(Circle):
                def __init__(self, radius, height):
                                super().__init__(radius)
                                self.height = height

                def volumn(self):
                                return super().area() * self.height

cy = Cylinder(3, 5)
print('원통 체적: %.2f' % cy.volumn())

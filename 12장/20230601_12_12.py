class Person():
                def hello(self):
                                print('안녕, 난 사람이야!')

class Student(Person):
                def hello(self):
                                super().hello()
                                print('안녕, 난 학생이야!')
                                
class Employee(Person):
                def hello(self):
                                super().hello()
                                print('안녕, 난 직원이야!')
                                                                
class Assistant(Student, Employee):
                pass

print(Assistant.__mro__)
print(Assistant.mro())

i = Assistant()
i.hello()

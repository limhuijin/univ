class Account:
                def __init__(self, name, amount):
                                self.name = name
                                self.__balance = amount

                def __str__(self):
                                return '예금주 {}, 잔고 {}'.format(self.name, self.__balance)

                def __info(self):
                                print('\t', self)

                def withdraw(self, amount):
                                self.__balance -= amount
                                print('출금 {}원 이후 : '.format(amount))
                                self.__info()

                def deposit(self, amount):
                                self.__balance += amount
                                print('입금 {}원 이후 : '.format(amount))
                                self.__info()

acc = Account('이은행', 100000)
print(acc)
acc.deposit(5000)
acc.withdraw(10000)
print(acc.__balance)
acc._info()

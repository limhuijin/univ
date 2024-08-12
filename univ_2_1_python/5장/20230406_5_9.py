item = ['연필', '볼펜']

print(item)

item.insert(1, 2)
item.insert(3, 3)
item.insert(4, '지우개')
item.insert(5, 1)

print(item)

print(item.pop(1))
item.remove('연필')
del item[2:]

print(item)

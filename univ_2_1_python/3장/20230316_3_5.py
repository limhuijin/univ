str = input('2개의 단어를 빈 공간으로 구분해 입력하세요 : ')
pos = str.find(' ')
preWord = str[:pos]
postWord = str[pos+1:]
print(preWord, postWord)
print(preWord[::-1], postWord[::-1])

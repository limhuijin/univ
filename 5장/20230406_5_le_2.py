menu = ('주문 종료', '올인원팩', '투게더팩', '트리오팩', '페밀리팩')
price = (0, 6000, 7000, 8000, 10000)

msg = '주문할 콤보 번호와 수량을 계속 입력하세요!'
for i in range(len(menu)):
                msg += '\n\t %d %s' % (i, menu[i])
                if i != 0:
                                msg += ' %d 원' % (price[i])
msg += '\n >> '

more = True
total = 0
while more:
                instr = input(msg)
                if instr.count(' ') > 0:
                                order,cnt = instr.split()
                                cnt = int(cnt)
                else:
                                order = instr
                order = int(order)

                if order == 0:
                                print()
                                print('주문 종료'.center(20, '*'))
                                more = False
                elif 1 <= order <= 4:
                                print('%s, %d개 주문' % (menu[order], cnt))
                                sub = price[order] * cnt
                                total += sub
                                print('%s 주문 가격 %d, 총 가격 %d' % (menu[order], sub, total))
                else:
                                print('모르겠어요. 다시 주문하세요!')
else:
    print('총 주문 가격 %d원' % total)
    print('주문을 마치겠습니다.')
    print('안녕!'.center(20, '='))

for i in range (3) :
                coffee = input("주문하세요! [아메리카노] [카페라테] [카푸치노] >> ")
                if coffee == '아메리카노' or coffee == '카페라테' or coffee == '카푸치노':
                                print('%s 주문' % coffee)
                else:
                                print('모르겠어요.')
else:
                print('주문을 마치겠습니다.')

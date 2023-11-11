from tkinter import *

def tomile(kilometer):
                return round(kilometer * 0.6213, 2)

def clicked():
                def insertmile(sdata):
                                mile.delete(0, END)
                                mile.insert(0, sdata)
                try:
                                fmeter = float(kmeter.get())
                except ValueError as e:
                                print('킬로미터 입력에 문제가 있습니다.')
                                print('예외 발생 이름: {}'. format(type(e)))
                                print('예외 발생 이유: {}'. format(e))
                                insertmile('다시 입력하세요!')
                else:
                                print('킬로미터 입력이 잘됐습니다.')
                                print('킬로미터 입력 값: ', fmeter)
                                insertmile(str(tomile(fmeter)))

                finally:
                                print('킬로미터 입력 예외 처리가 잘되는군요!')

win = Tk()
win.title('거리 킬로미터(km)를 마일(mile)로 변환')

lbcel = Label(win, text="킬로미터(km)", width=20)
lbfar = Label(win, text="마일(mile)")
lbcel.grid(row=0, column = 0)
lbfar.grid(row=1, column = 0)

kmeter = Entry(win, width = 20)
mile = Entry(win)
kmeter.grid(row=0, column = 1)
mile.grid(row=1, column = 1)

cvt = Button(win, text = "마일(mile)로 변환", width=20, command = clicked)
cvt.grid(row=2, column=0, columnspan=2)

win.mainloop()

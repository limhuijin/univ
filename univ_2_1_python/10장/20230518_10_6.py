from tkinter import *

def fahrenhite(celsius):
                return celsius * 9 / 5 + 32

def clicked():
                degree = eval(cel.get())
                print(degree)
                fah.delete(0, END)
                fah.insert(0, str(fahrenhite(degree)))

win = Tk()
win.title('섭씨 온도를 화씨 온도로 변환')

lbcel = Label(win, text = '섭씨 온도', width = 10)
lbfar = Label(win, text = '화씨 온도')
lbcel.grid(row = 0, column = 0)
lbfar.grid(row = 1, column = 0)

cel = Entry(win, width = 20)
fah = Entry(win)
cel.grid(row = 0, column = 1)
fah.grid(row = 1, column = 1)

cvt = Button(win, text="변환", width=20, command = clicked)
cvt.grid(row=2, column = 0, columnspan = 2)

win.mainloop()

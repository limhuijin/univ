from tkinter import *
win = Tk()
win.title('사용자 인증')

lb1 = Label(win, text = '사용자 이름')
lb2 = Label(win, text = '암호')
lb1.grid(row = 0, column = 0, sticky = E)
lb2.grid(row = 1, column = 0, sticky = E)

et1 = Entry(win)
et2 = Entry(win)
et1.grid(row = 0, column = 1)
et2.grid(row = 1, column = 1)

lb = Label(win)
lb.grid(row=2, column = 0, columnspan = 2)
bt1 = Button(lb, text='OK')
bt2 = Button(lb, text='CANCEL')
bt1.grid(row=0, column=0, padx = 10)
bt2.grid(row=0, column=1, padx = 10)

win.mainloop()

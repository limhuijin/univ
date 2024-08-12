from  tkinter import *

win = Tk()
win.title('여러 위셋 구성')

lbl = Label(win, text="레이블(Lablel)")
lbl.pack()

txt = Entry(win)
txt.insert(0, '엔트리(Entry)')
txt.pack()

btn = Button(win, text = "OK")
btn.pack()

win.mainloop()

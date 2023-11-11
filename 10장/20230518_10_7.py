from tkinter import *

win = Tk()
win.title('라인 그리기')
win.geometry('640x400+100+100')

def click(event):
                global sX, sY
                print("클릭 위치", event.x, event.y)
                sX, sY = event.x, event.y

def release(event):
                global eX, eY
                print("릴리즈 위치", event.x, event.y)
                eX, eY = event.x, event.y
                canvas.create_line(sX, sY, eX, eY, fill="blue", width=2)

canvas = Canvas(win, relief='solid', bd=2)
canvas.pack(expand=True, fill='both')

canvas.bind("<Button-1>", click)
canvas.bind("<ButtonRelease-1>", release)

win.mainloop()

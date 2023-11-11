import os

dname = os.getcwd()
print('현재 폴더: ', dname)

fs = os.listdir(dname)
for f in fs:
                if os.path.isfile(f):
                                print('\t파일:', f)
                elif os.path.isdir(f):
                                print('\t폴더:', f)

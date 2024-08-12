n1 = int(input("숫자 n1 : "))
n2 = int(input("숫자 n2 : "))

count = 0
add = 0;
for i in range(n1, n2+1, 1):
                for j in range(2, i+1, 1):
                                if i % j == 0:
                                         break

                if i == j:
                                print(i, end = "\t")
                                add = add + 1
                                count = count + 1

                if add == 5:
                                print()
                                add = 0

print("\n", n1, "부터 ", n2, "까지 소수의 개수는 ", count, "개")
##print(f"\n{n1}부터 {n2}까지의 소수의 개수는 {count}개")
 

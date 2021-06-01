x=0
for i in range(1,10):
    x += 1
    for j in range(1, i + 1):
        print(x, end=" ")
    print("\r")   
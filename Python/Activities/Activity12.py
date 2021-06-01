def sum(n):
    if n:
        return n + sum(n-1)
    else:
        return 0
num = sum(10)
print(num)
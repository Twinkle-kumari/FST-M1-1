def sum(n):
    cal=0
    for x in n:
        cal=int(x)+cal
    return cal

listnum = (input("Enter the numbers to get the sum : ").split(" "))       
print(sum(listnum))

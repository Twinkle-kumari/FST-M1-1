numbers = list(input("Enter the numbers : "))
firstnum = int(numbers[0])
lastnum = int(numbers[-1])

for number in numbers:
    if firstnum==lastnum:
        print("True")
        break
    else:
        print("False")
        break
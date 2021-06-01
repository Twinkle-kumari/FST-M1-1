numbers = input("Enter any numbers to get result divisible by 5 : ").split(" ")
print(numbers)
for num in numbers:
    result = int(num) % 5
    if (result==0):
        print(num)
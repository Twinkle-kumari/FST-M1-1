fruits = {
    "apple" : 50,
    "banana" : 20,
    "cherry" : 80,
    "orange" : 40,
    "mango" : 90
    }
print(fruits)
fruitname = input("Enter the fruit name your are looking for : ")
if(fruitname in fruits):
    print("Fruit is available")
else:
    print("Fruit is not available")
        
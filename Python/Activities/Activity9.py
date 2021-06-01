numlist1 = [1,2,3,4,5]
numlist2 = [6,7,8,9,0]
print(numlist1)
print(numlist2)
numlist3=[]
for x in numlist1:
    if x%2!=0:
        numlist3.append(x)
for j in numlist2:
    if j%2==0:
        numlist3.append(j)
print(numlist3)

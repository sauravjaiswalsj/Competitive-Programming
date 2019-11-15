import math
def checkPrime(num):
    if(num<=1):
        return False
    if(num == 2 or num == 3):
        return True
    if(num%2==0 or num%3==0):
        return False
    for i in range(3,int(math.sqrt(num))):
        if(num%i==0):
            return False
    return True

if __name__ == "__main__":
    loop=int(input())
    while(loop!=0):
        firstInput, secondInput = map(int, input().split())
        for i in range(firstInput, secondInput+1):
            if(checkPrime(i)==True):
                print(i)
        if(loop!=1):
            print()
        loop-=1
    

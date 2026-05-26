class Solution(object):
    def isHappy(self, n):
        if n==1: return True
        if n<=3: return False
        Set=set()
        while n!=1 and n not in Set:
            Set.add(n)
            sum=0
            while n>0:
                sum=sum+(n%10)**2
                n=n//10 
            n=sum 
        if n==1: return True
        return False
        
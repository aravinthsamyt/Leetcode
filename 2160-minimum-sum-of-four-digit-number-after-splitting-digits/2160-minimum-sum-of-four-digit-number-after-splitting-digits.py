class Solution(object):
    def minimumSum(self, num):
        List=list()
        for i in range(4):
            List.append(num%10)
            num=num//10
        List.sort()
        return (List[0]*10 + List[2])+(List[1]*10+List[3])
        
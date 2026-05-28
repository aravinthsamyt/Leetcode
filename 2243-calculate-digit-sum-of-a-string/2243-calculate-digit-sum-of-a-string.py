class Solution(object):
    def digitSum(self, s, k):

        while len(s)>k:
            j=0
            n=[]
            for i in range(0,len(s),k):
                List1=s[i:i+k]
                Sum = sum(int(ch) for ch in List1)
                n.append(str(Sum))
            s="".join(n)
        return s


        
        
class Solution(object):
    def repeatedCharacter(self, s):
        c=''
        min=len(s)
        for i in s:
            index=s.find(i,s.find(i)+1)
            if index < min and index!=-1:
                min=index
                c=i
        return c
        
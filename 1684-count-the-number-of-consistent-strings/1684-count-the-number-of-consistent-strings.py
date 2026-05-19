class Solution(object):
    def countConsistentStrings(self, allowed, words):
        count=0
        k=0
        for i in words:
            k=0
            for j in i:
                if j not in allowed:
                    k=1
                    break
            if k!=1:
                count=count+1
        return count
        
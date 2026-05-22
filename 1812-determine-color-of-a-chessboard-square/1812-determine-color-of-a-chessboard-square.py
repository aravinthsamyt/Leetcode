class Solution(object):
    def squareIsWhite(self, cd):
        return (ord(cd[0])+int(cd[1]))%2 == 1
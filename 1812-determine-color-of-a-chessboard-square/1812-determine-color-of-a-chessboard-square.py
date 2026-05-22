class Solution(object):
    def squareIsWhite(self, cd):
        dict1={"a":1,"b":2,"c":3,"d":4,"e":5,"f":6,"g":7,"h":8}
        return (ord(cd[0])+int(cd[1]))%2 == 1
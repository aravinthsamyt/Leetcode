class Solution(object):
    def categorizeBox(self, l, w, h, mass):
        if (l*w*h>=10**9 or (l>=10**4 or w>=10**4 or h>=10**4)):
            if mass>=100:
                return "Both"
            return "Bulky"
        elif mass>=100:
            return "Heavy"
        
        return "Neither"
class Solution(object):
    def winningPlayer(self, x, y):
        if y<4: return "Bob"
        moves=0
        if x < (y//4):
            moves=x
        else:
            moves=y//4
        if moves%2 == 0:
            return "Bob"
        return "Alice"
        
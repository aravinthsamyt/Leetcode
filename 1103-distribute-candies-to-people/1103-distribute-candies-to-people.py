class Solution(object):
    def distributeCandies(self, candies, num_people):
        index=0
        give=1
        arr=[0] * num_people
        while candies > 0:
            arr[index%num_people] += min(give,candies)
            candies-=give
            index+=1
            give+=1
        return arr
        
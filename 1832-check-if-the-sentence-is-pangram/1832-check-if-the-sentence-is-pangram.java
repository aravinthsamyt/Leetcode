class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet <Character> set = new HashSet<>();
        if(sentence.length() < 26){
            return false;
        }
        for(char ch:sentence.toCharArray()){
            set.add(ch);
        }
        return set.size()==26;

    }
}
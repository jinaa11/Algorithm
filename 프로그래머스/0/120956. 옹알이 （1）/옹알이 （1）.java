class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] word = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
            for(int j = 0; j < word.length; j++) {
                babbling[i] = babbling[i].replace(word[j], " ");
            }
            if(babbling[i].trim().length() == 0) {
                answer++;
        }
        
        
            
        }
        return answer;
    }
}
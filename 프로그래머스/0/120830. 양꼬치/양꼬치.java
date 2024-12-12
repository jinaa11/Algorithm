class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int free = 0;
        
        free = n / 10;
        answer = (12000 * n) + (2000 * k) - (2000 * free);
        
        return answer;
    }
}
class Solution {
    public int solution(int n) {
        int answer = 0;
        double je = Math.sqrt(n);
        
        if(n % je == 0) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
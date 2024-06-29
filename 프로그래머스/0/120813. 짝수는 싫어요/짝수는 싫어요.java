class Solution {
    public int[] solution(int n) {
        int[] answer;
        int size = 0;
        
        // 홀,짝 경우에 따라 배열 크기 지정
        if(n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[(n + 1) / 2];
        }
        
        for(int i = 0; i <= n; i++) {
            if(i % 2 != 0) {
                answer[size++] = i;
            } else {
                continue;
            }
        }
        return answer;
    }
}
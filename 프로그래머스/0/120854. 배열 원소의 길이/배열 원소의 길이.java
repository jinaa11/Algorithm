class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length]; // length: 배열 길이
        
        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length(); // length(): 문자열 길이
        }
        return answer;
    }
}
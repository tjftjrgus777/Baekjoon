class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        answer = str1.indexOf(str2);
        if(answer == -1){
            answer = 2;
        }else{
            answer = 1;
        }
        return answer;
    }
}
class Solution4 {
    public long solution(int a, int b) {
        long answer = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {     //a가 b보다 클 경우, 반대의 경우, 같을 경우 이렇게 3개의 경우를 모두 처리해줌
                answer += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
            return answer;
        }

    public static void main(String[] args) {
        Solution4 so = new Solution4();
        System.out.println(so.solution(3,5));
    }
}
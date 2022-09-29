class Solution {  //Solution class는 밑에 solution함수의 속성을 가진다.
    public static String solution(int num) {  //정수 num
        String answer = "";
        if (num % 2 == 0) {   //짝수일 경우 even을 반환하고
            answer = "Even";
        } else {
            answer = "Odd";  // 홀수일 경우 odd를 반환
        }
        return answer;  //맞는 answer값 리턴
    }

    public static void main(String[] args) {
        String result = "1 2 3 4";                   //
        Solution solution = new Solution();         // class Solution의  변수 solution 이고 새로운
        System.out.println("결과 :" + solution.solution(3)); //출력 결과 : solution class에서 3을 넣은 홀수값 해당 사항 출력
        System.out.println("결과 :" + solution.solution(4)); //출력 결과 : solution class에서 4을 넣은 짝수값 해당 사항 출력
    }
}
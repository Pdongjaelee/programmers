class Solution3 {
    public String solution(String word) {

        return word.substring((word.length()-1) / 2, word.length()/2 +1);
    }

    public static void main(String[] args) {
        Solution3 se = new Solution3();
        System.out.println(se.solution("qwer"));
    }
}
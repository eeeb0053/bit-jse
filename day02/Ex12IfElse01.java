package day02;
// if-else 구조
// if의 조건식이 false일 때 무조건 else가 실행이 된다.

// 예를 들어 사용자로부터 입력을 받아서
// 홀수인지 짝수인지 출력하는 프로그램의 경우
// 2로 나누어서 나머지가 0이면 짝수
// 그 외엔 무조건 홀수가 된다.

// 혹은 특정 조건을 만족했을 경우와 그 외의 모든 경우
// 두 가지로 나뉠 때에도 if-else 구조가 나오게 된다.
public class Ex12IfElse01 {
    public static void main(String[] args) {
        int number = -3;
        
        if(number < 0) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("자연수입니다.");
        }
    }
}

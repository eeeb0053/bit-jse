package day02;
// 사용자로부터 점수를 입력받아서
// 90점 이상 A
// 80점 이상 B
// 70점 이상 C
// 60점 이상 D
// 그 이하 F
// 가 출력되는 프로그램을 작성

import java.util.Scanner;
public class Ex16IfElseIf02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("점수를 입력하세요: ");
        int score = scanner.nextInt();
        
        System.out.println("점수 검증이 안된 if else 구조");
        // 아래의 if else 구조는 검증이 안되어있는 상태이다.
        
        if(score >= 90) {
            System.out.println("A입니다.");
        }else if(score >= 80) {
            System.out.println("B입니다.");
        }else if(score >= 70) {
            System.out.println("C입니다.");
        }else if(score >= 60) {
            System.out.println("D입니다.");
        }else {
            System.out.println("F입니다.");
        }

        // 이렇게 올바르지 않은 값이 들어올 때
        // 대응 가능한 방법은 두 가지가 있다.
        
        System.out.println("------------------");
        System.out.println("2. 범위를 빡빡하게 잡자");
        System.out.println("------------------");
        
        if(score >= 90 && score <= 100) {
            System.out.println("A입니다.");
        }else if(score >= 80 && score <= 89) {
            System.out.println("B입니다.");
        }else if(score >= 70 && score <= 79) {
            System.out.println("C입니다.");
        }else if(score >= 60 && score <= 69) {
            System.out.println("D입니다.");
        }else if(score >=0 && score <= 59){
            System.out.println("F입니다.");
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }


        System.out.println("------------------");
        System.out.println("3. 점수가 올바를 때만 if-else 실행");
        System.out.println("------------------");
        // 먼저 입력된 score가 올바른 범위인지 확인하고
        // 올바른 범위면
        // 1번처럼 조건을 간단하게 잡아도 된다.
        // 올바르지 않으면
        // "잘못 입력하셨습니다"가 출력되게 만들어보자
        
        if(score >= 0 && score <= 100) {
            // 올바른 점수이므로 if-else 구조 실행
            if(score >= 90) {
                System.out.println("A입니다.");
            }else if(score >= 80) {
                System.out.println("B입니다.");
            }else if(score >= 70) {
                System.out.println("C입니다.");
            }else if(score >= 60) {
                System.out.println("D입니다.");
            }else {
                System.out.println("F입니다.");
            }
        } else {
            // 올바르지 않은 점수이므로 경고 메세지 출력
            System.out.println("잘못 입력하셨습니다.");
        }
        
        // 데이터가 올바른지 아닌지 확인하는 과정을
        // 검증(validation) 이라고 한다.
        // 검증의 경우 조건식을 빡빡하게 잡는 것보다
        // 틀린 값인지를 체크하는 방법이 더 쉽고 확실하다.
        
        scanner.close();
    }
}













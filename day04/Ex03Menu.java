package day04;
// 우리가 의도하지 않았는데 무한루프에 들어갔으면 문제가 되지만
// 의도적으로 무한루프를 만들어서 우리가 원하는 형태의 프로그램으로 만들어 줄 수 있다.

// 무한루프를 이용하여 프로그램의 메뉴를 만드는 방법
import java.util.Scanner;
public class Ex03Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            System.out.println("======================");
            System.out.println("비트 고등학교 성적관리 프로그램");
            System.out.println("======================");
            System.out.println("       1. 입력");
            System.out.println("       2. 출력");
            System.out.println("       3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            if(userChoice == 1) {
                // 성적 입력 코드
            }else if(userChoice == 2) {
                System.out.println("");
                // 성적 출력 코드
            }else if(userChoice == 3) {
                // 메시지 출력 후 break
                System.out.println("프로그램을 종료합니다.");
                break;
            }else {
                System.out.println("잘못 선택하셨습니다.");
            }
            
        }
        
        scanner.close();
    }
}

package day04;
//사용자로부터 번호, 이름, 국어, 영어, 수학 점수를 입력받아서
//번호: ##번 이름: ###
//국어: 0##점 ...
//총점: ###점 평균:##.##점
//단 국영수 점수는 올바른 점수가 들어올 때까지 다시 입력받기
//또한 처음 프로그램을 시작할 때
//사용자가 입력, 출력, 종료를 선택하여
//사용자가 원하는만큼 입력하고 출력할 수 있게 프로그램을 작성하시오.
import java.util.Scanner;
public class Ex04GradeBook01 {
    static final int SUBJECT_SIZE = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = new String();
        // korean, english, math의 경우
        // 한 번이라도 입력이 되면
        // 0~100 사이의 값이 들어가게 된다.
        // 초기화시 불가능한 점수로 초기화해서 .. 아무 입력 없이 출력시
        // 점수 없다고 뜨게 함 
        
        int id = 0;
        int korean = -1;
        int english = -1;
        int math = -1;
        
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
                System.out.print("번호: ");
                id = scanner.nextInt();
                System.out.print("이름: ");
                scanner.nextLine();
                name = scanner.nextLine();
                
                System.out.print("국어: ");
                korean = scanner.nextInt();
                
                while(korean < 0 || korean > 100) {
                    System.out.println("잘못된 점수입니다.");
                    System.out.print("국어: ");
                    korean = scanner.nextInt();
                }
                
                System.out.print("영어: ");
                english = scanner.nextInt();
                
                while(english < 0 || english > 100) {
                    System.out.println("잘못된 점수입니다.");
                    System.out.print("영어: ");
                    english = scanner.nextInt();
                }
                
                System.out.print("수학: ");
                math = scanner.nextInt();
                
                while(math < 0 || math > 100) {
                    System.out.println("잘못된 점수입니다.");
                    System.out.print("수학: ");
                    math = scanner.nextInt();
                }
            }else if(userChoice == 2) {
                // 성적 출력 코드
                if(korean == -1) {
                    System.out.println("정보가 입력되지 않았습니다.");
                }else {
                    int sum = korean + english + math;
                    double average = sum / (double)SUBJECT_SIZE;
                    
                    System.out.printf("번호: %d번 이름: %s\n", id, name);
                    System.out.printf("국어: %03d점 영어: %03d점 수학 %03d점\n", korean, english, math);
                    System.out.printf("총점: %d점 평균: %.2f점\n", sum, average);
                }
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

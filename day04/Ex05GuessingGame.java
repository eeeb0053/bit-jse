package day04;
// 숫자 맞추기 게임
// 컴퓨터가 임의로 만든 숫자(=난수)를
// 사용자가 알아맞추는 게임
// 만약 사용자가 입력한 숫자가 컴퓨터 난수보다 크면 "DOWN"
// 작으면 "UP"이라고 출력된다.
// 또한 사용자의 최고기록을 보관해서
// 메뉴에서 최고기록 보기를 하면 해당 기록을 볼 수 있다.
// 플레이가 끝날 때 최고기록 반영

// 난수를 담당하는 Random 클래스를 import
import java.util.Random;
import java.util.Scanner;
public class Ex05GuessingGame {
    static final int MAX = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 랜덤 클래스 변수 생성
        Random random = new Random();
        
        int bestScore = 0;
        
        while(true) {
            System.out.println("======================");
            System.out.println("     숫자 맞추기 게임");
            System.out.println("======================");
            System.out.println("       1. 플레이");
            System.out.println("       2. 최고기록 조회");
            System.out.println("       3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            if(userChoice == 1) {
                // 숫자맞추기 게임 코드
                // 1. 컴퓨터 난수를 만들어서 변수에 저장
                //    랜덤 클래스 변수를 사용할 때 next~~ 메소드
                //    메소드 () 안에 숫자를 집어넣으면 0부터 그 숫자-1 사이에서 난수 생성
                //    아무 숫자도 입력하지 않으면 해당 데이터타입의 범위 내에서 생성
                
                // int computerNumber = random.nextInt(MAX);
                // 0~99까지의 값이 들어가게 됨
                // 우리가 필요한 값은 1~100
                int computerNumber = random.nextInt(MAX) + 1;
               
                // 2. 컴퓨터 난수와 사용자 입력 숫자가 다른 동안 반복
                
                // computerNumber에는 1~100
                // 그렇다면 int userNumber를 0으로 초기화하고
                // while 조건식을 computerNumber != userNumber 라고 하면
                // 무조건 1번은 실행되지 않을까?
                
                // 사용자가 입력할 숫자를 저장할 변수
                int userNumber = 0;
                
                // 이번 라운드의 사용자점수를 저장할 변수
                int score = 0;
                
                while(computerNumber != userNumber) {
                    
                    System.out.print("숫자를 입력하세요: ");
                    userNumber = scanner.nextInt();
                    
                    // 숫자를 비교해서 up 혹은 down 출력
                    
                    if(computerNumber > userNumber) {
                        System.out.println("UP");
                    }else if(computerNumber < userNumber){
                        System.out.println("DOWN");
                    }                    
                    score++;
                }
                
                System.out.println("정답입니다!");
                System.out.printf("기록: %d회\n", score);
                // 3. 점수 비교하여 신기록일 경우 bestScore 갱신
                if(score > bestScore) {
                    System.out.println("최고기록 갱신!");
                    bestScore = score;                    
                }
            }else if(userChoice == 2) {
                // 최고기록을 출력하는 코드
                // 플레이어가 한번이라도 플레이했다면 최고기록은 0이 될 수 없다.
                if(bestScore == 0) {
                    System.out.println("플레이한 기록이 없습니다.");
                }else {
                    System.out.printf("현재 최고기록은 %d회 입니다.\n", bestScore);
                }
            }else if(userChoice == 3) {
                // 메세지 출력 후 while 종료
                System.out.println("플레이해주셔서 감사합니다.");
                break;
            }else {
                System.out.println("잘못 입력하셨습니다.");
            }
            
        }
        
        // 버퍼메모리를 참조하는 스캐너 종료
        scanner.close();
    }
}

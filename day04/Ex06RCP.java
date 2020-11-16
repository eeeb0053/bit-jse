package day04;
// 가위 바위 보 게임
// 메뉴: 1. 플레이 2. 전적보기 3. 종료
// 1. 플레이
//    사용자가 가위 바위 보 중에 하나를 고르게 한다.
//    단 가위 1, 바위 2, 보 3, 잘못된 값은 다시 입력
//    컴퓨터도 마찬가지로 1~3 사이의 난수를 만들어서
//    사용자의 입력값과 비교해서 사용자 기준으로 승리, 무승부, 패배 3가지 중 하나를 기록한다.
// 2. 전적보기
//    ##전 ##승 ##무 ##패 로 출력
//    단 아무런 플레이 기록도 없는 경우 메세지 출력

import java.util.Random;
import java.util.Scanner;
public class Ex06RCP {
    static final int MAX = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int win = 0;
        int draw = 0;
        int lose = 0;
        
        while(true) {
            System.out.println("====== 가위바위보 게임 ======");
            System.out.println("1. 플레이  2. 전적보기  3.종료");
            System.out.println("========================");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            
            if(userChoice == 1) {
                // 플레이 코드
                int computerNumber = random.nextInt(MAX) + 1;
                System.out.print("1.가위 2.바위 3.보 >> ");
                int userNumber = scanner.nextInt();
                
                while(userNumber < 1 || userNumber > 3) {
                    System.out.println("잘못 입력하셨습니다.");
                    System.out.print("1.가위 2.바위 3.보 >> ");
                    userNumber = scanner.nextInt();
                }
                
                // 승-무-패의 로직
                // 1. 사용자 숫자와 컴퓨터 숫자가 같을 경우 = 무승부
                // 2. 그외 
                //    A. 사용자가 1을 선택했을 경우
                //      가. 컴퓨터가 2면 패배/아니면 승리
                //    B. 사용자 2 선택
                //      가. 컴퓨터가 3이면 패배/ 아니면 승리
                //    C. 사용자가 3을 선택
                //      가. 컴퓨터 1이면 패배/ 아니면 승리
                
                System.out.println("컴퓨터: "+rcpSetter(computerNumber));
                System.out.println("사용자: "+rcpSetter(userNumber));
                
                // 사용자 숫자 = 컴퓨터 숫자
                if(userNumber == computerNumber) {
                    System.out.println("무승부입니다.");
                    draw++;
                }else {
                    if(userNumber == 1) {
                        // 가위에 대한 승패
                        if(computerNumber == 2) {
                            System.out.println("패배하셨습니다.");
                            lose++;
                        }else {
                            System.out.println("승리하셨습니다.");
                            win++;
                        }
                    }else if(userNumber == 2) {
                        // 바위에 대한 승패
                        if(computerNumber == 3) {
                            System.out.println("패배하셨습니다.");
                            lose++;
                        }else {
                            System.out.println("승리하셨습니다.");
                            win++;
                        }
                    }else if(userNumber == 3) {
                        // 보에 대한 승패
                        if(computerNumber == 1) {
                            System.out.println("패배하셨습니다.");
                            lose++;
                        }else {
                            System.out.println("승리하셨습니다.");
                            win++;
                        }
                    }
                }
                    
            }else if(userChoice == 2) {
                // 전적보기 코드
                int total = win + draw + lose;
                if(total == 0) {
                    System.out.println("전적이 존재하지 않습니다.");
                }else {
                    System.out.printf("%03d전 %03d승 %03d무 %03d패\n", total ,win, draw ,lose);
                }
            }else if(userChoice == 3) {
                // 시스템 종료
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }else {
                System.out.println("잘못된 입력입니다.");
            }
            
        }
        
        scanner.close();
    }
    
    static String rcpSetter(int value) {
        switch(value) {
        case 1:
            return "가위";
        case 2:
            return "바위";
        case 3:
            return "보";
        default:
            return " ";                
        }
    }

}

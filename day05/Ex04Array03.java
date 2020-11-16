package day05;
// 사용자로부터 국영수 점수를 입력받아
// 1~3회차의 점수와 총점 평균을 출력하는 프로그램
// 결과가 다음과 같이 나온다.

import java.util.Scanner;

import util.ScannerUtil;

// 1번 홍길동
// -- 1번 시험 --
// 국어: 080점 영어 065점 수학 054점
// 총점 234점 평균: xx.xx점
// ------------
// -- 2번 시험 --
// 국어: 080점 영어 065점 수학 054점
// 총점 234점 평균: xx.xx점
// ------------
// -- 3번 시험 --
// 국어: 080점 영어 065점 수학 054점
// 총점 234점 평균: xx.xx점
// ------------

// 국 영 수 각 배열에 점수 입력

public class Ex04Array03 {
    private static final int SCORE_MAX = 100;
    private static final int SIZE = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] koreanArray = new int[SIZE];
        int[] englishArray = new int[SIZE];
        int[] mathArray = new int[SIZE];
        
        int id = 0;
        String name = new String();
        
        System.out.print("번호: ");
        id = scanner.nextInt();
        System.out.print("이름: ");
        name = ScannerUtil.nextLine(scanner);
        
        // for문 - i번째에 시험 점수 넣어줌
        for(int i = 0; i < SIZE; i++) {
            koreanArray[i] = ScannerUtil.nextInt(scanner, (i+1)+"회차 국어 점수: ", 0, SCORE_MAX);
            englishArray[i] = ScannerUtil.nextInt(scanner, (i+1)+"회차 영어 점수: ", 0, SCORE_MAX);
            mathArray[i] = ScannerUtil.nextInt(scanner, (i+1)+"회차 수학 점수: ", 0, SCORE_MAX);
        }

        // 입력된 정보 출력
        System.out.printf("%d번 %s\n", id, name);
        
        // 배열을 돌면서 각 배열의 i번째를 출력
        for(int i = 0; i < SIZE; i++) {
            int sum = koreanArray[i] + englishArray[i] + mathArray[i];
            double average = sum / (double)SIZE;
            System.out.println("============"+(i+1)+"번 시험============");
            System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", koreanArray[i], englishArray[i], mathArray[i]);
            System.out.printf("총점: %03d점 평균: %.2f점\n", sum, average);
            System.out.println("==============================");
        }
        
        scanner.close();
    }
}

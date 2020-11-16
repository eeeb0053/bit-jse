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

// 시험별 배열 컨트롤

public class Ex05Array03B {
    private static final int SCORE_MAX = 100;
    private static final int SIZE = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = new int[SIZE];
        int[] secondArray = new int[SIZE];
        int[] thirdArray = new int[SIZE];
        int id = 0;
        String name = new String();
        
        System.out.print("번호: ");
        id = scanner.nextInt();
        System.out.print("이름: ");
        name = ScannerUtil.nextLine(scanner);
        
        // for문 - 1,2,3회차 총 3번 
        System.out.println("1회차");
        firstArray[0] = ScannerUtil.nextInt(scanner, "국어: ", 0, SCORE_MAX);
        firstArray[1] = ScannerUtil.nextInt(scanner, "영어: ", 0, SCORE_MAX);
        firstArray[2] = ScannerUtil.nextInt(scanner, "수학: ", 0, SCORE_MAX);

        System.out.println("2회차");
        secondArray[0] = ScannerUtil.nextInt(scanner, "국어: ", 0, SCORE_MAX);
        secondArray[1] = ScannerUtil.nextInt(scanner, "영어: ", 0, SCORE_MAX);
        secondArray[2] = ScannerUtil.nextInt(scanner, "수학: ", 0, SCORE_MAX);

        System.out.println("3회차");
        thirdArray[0] = ScannerUtil.nextInt(scanner, "국어: ", 0, SCORE_MAX);
        thirdArray[1] = ScannerUtil.nextInt(scanner, "영어: ", 0, SCORE_MAX);
        thirdArray[2] = ScannerUtil.nextInt(scanner, "수학: ", 0, SCORE_MAX);

        
        System.out.printf("%d번 %s\n", id, name);
        
        int sum = firstArray[0] +firstArray[1] +firstArray[2];
        double average = sum / (double)SIZE;
        System.out.println("============1번 시험============");
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", firstArray[0], firstArray[1], firstArray[2]);
        System.out.printf("총점: %03d점 평균: %.2f점\n", sum, average);
        System.out.println("==============================");

        scanner.close();
    }
}



















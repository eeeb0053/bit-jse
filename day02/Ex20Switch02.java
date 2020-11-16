package day02;
// 의도적으로 break를 생략해서 코드를 간략화하게 만들어보자
// 사용자로부터 월을 입력받으면 해당 월의 마지막 날이
// 며칠인지 보여주는 프로그램

import java.util.Scanner;
public class Ex20Switch02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("월: ");
        int month = scanner.nextInt();
        switch(month) {
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("30일까지 입니다.");
            break;
        case 2:
            System.out.println("28일(29일)까지 입니다.");
            break;
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            System.out.println("31일까지 입니다.");
            break;
        default:
            System.out.println("잘못 입력하셨습니다.");
            break;
        }
        
        scanner.close();
    }
}

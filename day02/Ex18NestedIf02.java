package day02;
// 사용자로부터
// 번호, 이름, 국영수 점수를 입력받아서
// 번호: ##번 이름: ###
// 국어: 0##점 ~~~
// 총점: ##점 평균: ##.##점
// 사용자가 잘못된 국영수 점수를 입력하면 잘못입력하셨습니다 종료하겠습니다 출력함

import java.util.Scanner;
public class Ex18NestedIf02 {
    static final int SUBJECT_SIZE = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("번호: ");
        int id = scanner.nextInt();
        System.out.print("이름: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("국어: ");
        int korean = scanner.nextInt();
        
        if(korean >= 0 && korean <= 100){
            System.out.print("영어: ");
            int english = scanner.nextInt();
            
            if(english >= 0 && english <= 100) {
                System.out.print("수학: ");
                int math = scanner.nextInt();
                
                if(math >= 0 && math <= 100) {
                    int sum = korean + english + math;
                    double average = sum / (double)SUBJECT_SIZE;
                    
                    System.out.printf("번호: %d 이름: %s\n", id, name);
                    System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
                    System.out.printf("총점: %d점 평균: %.2f점\n", sum, average);
                }else {
                    System.out.println("잘못 입력하셨습니다.");
                }
            }else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }
            
        /*
        System.out.print("영어: ");
        int english = scanner.nextInt();
        System.out.print("수학: ");
        int math = scanner.nextInt();
        
            
        int sum = korean + english + math;
        double average = sum / (double)SUBJECT_SIZE;
        
        if(korean >= 0 && korean <= 100
                && english >= 0 && english <= 100
                && math >= 0 && math <= 100) {
            System.out.printf("번호: %d 이름: %s\n", id, name);
            System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
            System.out.printf("총점: %d점 평균: %.2f점\n", sum, average);
            
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }
        */
        
        scanner.close();
    }
}

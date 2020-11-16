package day06;

import java.util.Scanner;

import util.ScannerUtil;

// 구조체를 배열로 만드는 것도 가능하다.
// 기존 기본형 데이터타입 배열처럼
// 데이터타입[] 배열이름 = new 데이터타입[크기] 로 선언하여
// 각 칸을 초기와하면 사용 가능하다.
public class Ex05StructArray01 {
    public static void main(String[] args) {
        Student[] studentArray = new Student[5];
        Scanner scanner = new Scanner(System.in);
        // 단 기본형 데이터타입이 아닌 배열의 경우
        // 각 요소를 우리가 매번 초기화해주어야 정상적으로 사용 가능하다.
        
        // 만약 각 요소를 초기화하지 않으면?
        // NullPorinterException 이란 에러가 발생한다.
        // studentArray[0].id = 1;
        
        // 각 요소를 초기화하는 for문
        for(int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new Student();
        }
        
        studentArray[0].setId(3);
        System.out.println(studentArray[0].getId());
        // new 라는 키워드는
        // 참조형 데이터타이벵 대한
        // 공간 확보에 쓰이는 키워드이다.
        // 만약 클래스형 변수의 경우
        // 변수 = new 클래스이름() 으로 초기화하고
        // 배열의 경우
        // 배열이름 = new 데이터타입[크기] 로 초기화한다.
        // 만약 참조형 배열의 경우에는
        // 배열 초기화 이후에 각 요소에 대한 초기화를 해주어야
        // 정상적으로 사용가능하다.
        
        // for문을 이용해서 각 칸의 정보를 넣고
        // 또 다른 for문을 이용해서 각 칸의 정보를 출력해보세요
        for(int i = 0; i < studentArray.length; i++) {
            System.out.print("번호: ");
            studentArray[i].setId(scanner.nextInt());
            System.out.print("이름: ");
            studentArray[i].setName(ScannerUtil.nextLine(scanner));
            studentArray[i].setKorean(ScannerUtil.nextInt(scanner, "국어: ", 0, 100));
            studentArray[i].setEnglish(ScannerUtil.nextInt(scanner, "영어: ", 0, 100));
            studentArray[i].setMath(ScannerUtil.nextInt(scanner, "수학: ", 0, 100));
        }
        
        for(int i = 0; i < studentArray.length; i++) {
            System.out.println("============================");
            System.out.printf("번호: %d번 이름: %s\n", studentArray[i].getId(), studentArray[i].getName());
            System.out.printf("국어: %03d점 영어:%03d점 수학:%03d점\n", 
                    studentArray[i].getKorean(), studentArray[i].getEnglish(), studentArray[i].getMath());
            System.out.printf("총점: %03d점 평균: %.2f점\n", studentArray[i].calculateSum(),
                                                       studentArray[i].calculateAverage());
            System.out.println("============================");
        }
        
        scanner.close();    
    }
}















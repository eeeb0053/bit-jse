package day04;
// 무한루프
// 무한루프란 조건식에서 항상 참이 나와서
// 해당 루프가 종료되지 않고
// 우리가 프로그램을 강제종료할 때까지 계속 돌아가는 반복문
// 무한루프를 만드는 다양한 방법을 알아보자
public class Ex02InfiniteLoop {
    public static void main(String[] args) {
        System.out.println("1. for 반복문을 이용한 무한루프");
        // A. 컨트롤변수의 값이 변화가 없을 때
        System.out.println("A. for(int i = 0; i < 1;");
        /*
        for(int i = 0; i < 1;) {
            System.out.println("for 무한루프 1번");
        } */
        
        // B. 반복 조건식이 항상 참이 나오는 형태
        System.out.println("B. for(int i = 0; 0 < 1; i++)");
        /*
        for(int i = 0; 0 < 1; i++) {
            System.out.println("for 무한루프 2번. i의 현재값: "+i);
        } */
        
        // C. 빈 형태의 for 문
        System.out.println("C. for(;;)");
        /*
        for(;;) {
            System.out.println("ㅎㅎ");
        } */
        
        System.out.println("2. while 반복문을 이용한 무한루프");
        
        System.out.println("A. 변화가 없는 변수를 조건식에 넣으면?");
        System.out.println("int number = 0; while(number < 5)");
        /*
        int number = 0;
        while(number < 5) {
            System.out.println("while 무한루프 1번");
        } */
        
        System.out.println("B. 항상 참이 나오는 조건식을 넣으면?");
        System.out.println("while(0 < 1)");
        /*
        while(0 < 1) {
            System.out.println("while 무한루프 2번");
        } */
        
        System.out.println("C. true");
        System.out.println("while(true)");
        /*
        while(true) {
            System.out.println("while 무한루프 3번");
        } */
        
    }
}















package day03;
// while 반복문
// for 반복문의 경우
// 변수를 쓰긴 하지만
// 우리가 i가 얼마이고 변수보다 크거나 작거나 하는 동안 반복해라
// 즉 횟수가 명확하다.
// 그에 반하여 while 반복문은
// 조건이 true가 나오는 동안 즉, 횟수가 정확하지 않다.
public class Ex15While01 {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++) {
            System.out.println("i의 현재값: "+i);
        }
        
        int i = 0;
        while(i < 3) {
            System.out.println("i의 현재값: "+i);
            i++;
        }
    }
}

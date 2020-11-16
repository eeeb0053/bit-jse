package day06;
// 구조체 (Struct)
// 구조체란 다양한 데이터타입을
// 우리가 필요한 커다란 데이터타입으로 만들어 주는 것을 뜻한다.
// 예를 들어
// 학생이라는 구조체 안에 번호, 이름, 국영수 점수
// 이렇게 들어갈 수 있고
// 구조체 안에 번호판 번호, 차종, 연식 등의 정보를 모아서
// 자동차라는 자료형을 만들어줄 수 있다.
// 단 문제는 구조체는 2세대 언어에서까지만 사용이 됐다.
// 하지만 자바에서도 구조체를 비슷하게 만들어줄 수 있다.

public class Ex03Struct {
    public static void main(String[] args) {
        // 우리가 미리 만들어놓은 Student 클래스는
        // 하나의 자료형이 될 수 있다.
        // 그리고 그안에 어떠한 데이터들을 가질지 미리 규정시켜 놓으면
        // Student 클래스 변수를 만들어서 그 안에 각기 다른 데이터를 넣어줄 수 있다.
        // 즉 id, korean, english, math, name을
        // 통째로 묶어서 하나의 Student라는 데이터타입을 만들어주게 된 것이다.
        Student s = new Student();
        s.setId(0);
        s.setKorean(100);
        s.setEnglish(95);
        s.setMath(85);
        s.setName("홍길동");
        
        Student s2 = new Student();
        s2.setId(2);
        s2.setKorean(99);
        s2.setEnglish(94);
        s2.setMath(84);
        s2.setName("홍길자");
        
        System.out.println("==============================");
        System.out.printf("번호: %d번 이름: %s\n", s.getId(), s.getName());
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", s.getKorean(), s.getEnglish(), s.getMath());
        System.out.println("==============================");
        System.out.printf("번호: %d번 이름: %s\n", s2.getId(), s2.getName());
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", s2.getKorean(), s2.getEnglish(), s2.getMath());
        System.out.println("==============================");
        
        
    }
}

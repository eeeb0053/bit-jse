package day02;
// 조건문 02 - Switch
// if와는 다르게 switch의 경우
// 정수형 변수나 스트링 변수를 하나 선택해서
// 그 변수의 각각의 값에 대한 코드처리를 해주게 된다.

public class Ex19Switch01 {
    public static void main(String[] args) {
        int number = 2;
        
        // swich는 괄호안에 조선식이 아니라
        // 검사할 값 자체가 들어가게 된다.
        switch(number){
        // case 값:
        //        실행할 코드
        //        ....
        //        break;
        // default:
        //         실행할 코드
        //         ....
        //         break;
        
        // break의 경우
        // 해당 switch문이나 반복문을 곧장 종료시킨다.
        // 만약 switch에서 break가 생략되면
        // 만족하는 case부터 break가 나올 때까지의
        // 모든 코드들이 실행된다.
        
        case 1:
            System.out.println("1입니다.");
            break;
        case 2:
            System.out.println("2입니다.");
            break;
        case 3:
            System.out.println("3입니다.");
            break;
        default:
            System.out.println("그외");
            break;                
        }
    }
}

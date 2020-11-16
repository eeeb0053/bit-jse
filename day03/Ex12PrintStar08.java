package day03;
// 별찍기 8번
import java.util.Scanner;
public class Ex12PrintStar08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========");
        System.out.println("별찍기 8번");
        System.out.println("========");
        System.out.print("출력할 줄 수: ");
        int userNumber = scanner.nextInt();
        
        for(int i = 1; i <= 2*userNumber-1; i++) {
            String stars = new String();
            
            if(i < userNumber) {
                // 윗부분을 담당하는 if문
                // 공백 j for 문
                for(int j = 1; j <= userNumber-i; j++) {
                    stars += " ";
                }
                // 별 j for 문
                for(int j = 1; j <= i; j++) {
                    stars += "*";
                }
            }else {
                // 새로운 변수선언
                int lowerI = i - userNumber +1;
                // 아랫부분을 담당하는 if문
                // 공백 j for 문
                for(int j = 1; j <= lowerI-1; j++) {
                    stars += " ";
                }                
                // 별 j for 문
                for(int j = lowerI; j <= userNumber; j++) {
                    stars += "*";
                }
            }
            
            System.out.println(stars);
        }
        
        /*
        for(int i = 1; i <= userNumber; i++) {
            String stars = new String();
            
            for(int j = 1; j <= userNumber-i; j++) {
                stars += " ";
            }
            for(int j = 1; j <= i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
        for(int i = userNumber; i > 1; i--) {
            String stars = new String();
            
            for(int j = 0  ; j <= userNumber-i; j++) {
                stars += " ";
            }
            for(int j = 1; j < i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        */
      /*for(int i = 1; i < userNumber; i++) {
            String stars = new String();
            
            for(int j = 1; j <= i; j++) {
                stars += " ";
            }
            for(int j = i; j < userNumber; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }*/
        
        scanner.close();
    }
}

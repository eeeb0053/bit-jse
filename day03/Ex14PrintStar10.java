package day03;
// 별찍기 10번
import java.util.Scanner;
public class Ex14PrintStar10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========");
        System.out.println("별찍기 10번");
        System.out.println("========");
        System.out.print("출력할 줄 수: ");
        int userNumber = scanner.nextInt();

        for(int i = 1; i <= 2*userNumber-1; i++) {
            String stars = new String();
            
            if(i == 1 || i == 2*userNumber-1){
                for(int j = 1; j <= 2*userNumber-1; j++) {
                    stars += "*";
                }
            }else if(i < userNumber) {
                // 첫줄을 제외한 윗부분
                
                // 왼쪽 별 j for 문
                for(int j = i; j <= userNumber; j++) {
                    stars += "*";
                }
                int upperI = i - 1;
                // 공백 j for 문
                for(int j = 1; j <= 2*upperI-1; j++) {
                    stars += " ";
                }
                // 오른쪽 별 j for 문
                for(int j = i; j <= userNumber; j++) {
                    stars += "*";
                }
            }else {
                // 마지막줄을 제외한 아랫부분
                int lowerI = i - userNumber + 1; 
                // 왼쪽 별 j for 문
                for(int j = 1; j <= lowerI; j++) {
                    stars += "*";
                }
                // 공백 j for문
                
                //전체 폭을 계산하여 저장하는 maxWidth 변수
                int maxWidth = 2 * userNumber - 1;
                //공백폭을 계산하여 저장하는 spaceWidth 변수
                int spaceWidth = maxWidth - 2*lowerI;
                for(int j = 1; j <= spaceWidth; j++) {
                    stars += " ";
                }
                // 오른쪽 별 j for 문
                for(int j = 1; j <= lowerI; j++) {
                    stars += "*";
                }
            }
                
            System.out.println(stars);
        }
        
        
        /*
        for(int i = 1; i <= userNumber; i++) {
            String stars = new String();
            
            for(int j = i; j <= userNumber; j++) {
                stars += "*";
            }
            for(int j = 1; j < 2*i-2; j++) {
                stars += " ";
            }
            for(int j = i; j <= userNumber; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        for(int i = userNumber; i > 1; i--) {
            String stars = new String();
            
            for(int j = i; j <= userNumber+1; j++) {
                stars += "*";
            }
            for(int j = 1; j < 2*i-4; j++) {
                stars += " ";
            }
            for(int j = i; j <= userNumber+1; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        */
        
        scanner.close();
    }
}

package day03;
// 별찍기 9번
import java.util.Scanner;
public class Ex13PrintStar09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========");
        System.out.println("별찍기 9번");
        System.out.println("========");
        System.out.print("출력할 줄 수: ");
        int userNumber = scanner.nextInt();

        for(int i = 1; i <= 2*userNumber-1; i++) {
            String stars = new String();
            int controlI = 0;
            if(i < userNumber) {
                controlI = i;
            }else {
                controlI = 2 * userNumber - i;
                
            }
    
            int lowerI = 2 * userNumber - i;

            for(int j = 1; j <= userNumber-controlI; j++) {
                stars += " ";
            }                
            
            for(int j = 1; j <= 2*controlI-1; j++) {
                stars += "*";
            }
            
            System.out.println(stars);
        }
        
        /*
        for(int i = 1; i <= userNumber; i++) {
            String stars = new String();
            
            for(int j = 1; j <= userNumber-i; j++) {
                stars += " ";
            }
            for(int j = 1; j <= 2*i-1; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
        for(int i = userNumber; i >= 1; i--) {
            String stars = new String();
            
            for(int j = 0; j <= userNumber-i; j++) {
                stars += " ";
            }
            for(int j = 1; j <= 2*i-3; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        */
        /*
        for(int i = 1; i < userNumber; i++) {
            String stars = new String();
            
            for(int j = 1; j <= i; j++) {
                stars += " ";
            }
            for(int j = i+1; j < 2*userNumber-i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        */
        
        scanner.close();
    }
}

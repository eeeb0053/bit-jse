package day03;
// 별찍기 6번
import java.util.Scanner;
public class Ex10PrintStar06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========");
        System.out.println("별찍기 6번");
        System.out.println("========");
        System.out.print("출력할 줄 수: ");
        int userNumber = scanner.nextInt();
        
        for(int i = userNumber; i >= 1; i--) {
            String stars = new String();
            
            for(int j = 1; j <= userNumber-i; j++) {            
                stars += " ";
            }
            for(int j = 1; j <= 2*i-1; j++) {
                stars += "*";
            }          
            System.out.println(stars);
        }
        
      /*for(int i = 1; i <= userNumber; i++) {
            String stars = new String();
            
            for(int j = 1; j < i; j++) {
                stars += " ";
            }
            for(int j = i; j <= 2*userNumber-i; j++) {
                stars += "*";
            }          
            System.out.println(stars);
        }*/
        
        scanner.close();
    }
}

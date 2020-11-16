package util;

import java.util.Scanner;

// 입력과 관련된 여러 유용한 메소드를 구현해놓은
// ScannerUtil 클래스
public class ScannerUtil {
    // 1. nextInt() 후에 nextLine() 사용시
    //    버퍼메모리를 알아서 비워서 nextLine()을 실행해주는 메소드
    public static String nextLine(Scanner scanner) {
        // 먼저 nextInt() 등 때문에
        // 다음 줄, 즉 엔터키가 존재하는지 체크하기 위해서
        // String temp = scanner.nextLine() 실행
        // 그 후 temp.isEmpty()이 true가 나오면
        // temp = scanner.nextLine()을 다시 실행
        // 가장 마지막에 return temp
        
        String temp = scanner.nextLine();
        if(temp.isEmpty()) {
            temp = scanner.nextLine();
        }
        
        return temp;
    }
    
    // 만약 사용자가 입력한 숫자가 최소, 최대 값을 벗어나는 경우
    // 최소 최대 범위안에 속하는 숫자가 입력 될 때까지
    // 계속 입력을 받는 개량된 nextInt() 메소드
    /*
    public static int nextInt(Scanner scanner, int min, int max) {
        System.out.print("값을 입력해주세요: ");
        int temp = scanner.nextInt();
        
        while(temp > max || temp < min) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.print("다시 입력해주세요: ");
            temp = scanner.nextInt();
        }
        
        return temp;
    }
    */
    
    // 사용자가 입력한 값이 숫자로만 이루어져 잇으면 int로 변환하고
    // 숫자로만 이루어져 있지 않은 경우에는 숫자만 입력할 때까지 계속 입력을 요구하는
    // nextInt()메소드
    public static int nextInt(Scanner scanner) {
        // 사용자로부터 숫자를 입력받괴
        // String의 형태로 입력받는다.
        String temp = nextLine(scanner);
        
        // String 클래스의 matches() 메소드를 사용하여
        // temp가 숫자로만 이루어져 있는지 확인한다.
        // 그렇지 않을 경우 temp가 숫자로만 이루어질 때까지 다시 입력받는다.
        while(!temp.matches("\\d*")) {
            System.out.print("숫자만 입력해주세요.\n> ");
            temp = nextLine(scanner);
        }
        // while이 실행되지 않았다 = temp가 숫자로만 이루어져 있다.
        // 즉 temp를 int로 변경가능하다.
        // String을 숫자로 바꿀 때에는
        // Integer 클래스의 parseInt() 메소드를 실행하면 되는데
        // 해당 메소드는 static 설정이 되어있으므로 객체 선언은 필요없다.
        return Integer.parseInt(temp);
    }
    
   
    // 입력을 받을 때 사용자가 원하는 스트링 값을 보여주고 
    // min~max까지의 int만 입력을 받는 nextInt() 메소드
    public static int nextInt(Scanner scanner, String message, int min, int max) {
        System.out.println(message);
        System.out.print("> ");
        int temp = nextInt(scanner);

        while(temp < min || temp > max) {
            System.out.println("잘못 입력하셨습니다.");
            System.out.print(message);
            temp = nextInt(scanner);
        }
        
        return temp;
    }
}








